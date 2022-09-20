package Remote;

import java.rmi.RemoteException;

public class SolveEquationServer implements SolveEquation{
    @Override
    public String solve(int a, int b, int c) throws RemoteException {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            return "x1 = " + x1 + ", x2 = " + x2;
        }
        else if (D == 0) {
            double x = -b / (2 * a);
            return "x = " + x;
        }
        else {
            return "Уравнение не имеет действительных корней!";
        }
    }
}
