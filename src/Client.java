import Remote.SolveEquation;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static final String UNIQUE_BINDING_NAME = "server.solveEquation";

    public static void main(String[] args) throws RemoteException, NotBoundException {
        final Registry registry = LocateRegistry.getRegistry(8080);
        SolveEquation solveEquation = (SolveEquation) registry.lookup(UNIQUE_BINDING_NAME);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        int a = scanner.nextInt();
        System.out.print("Введите коэффициент b: ");
        int b = scanner.nextInt();
        System.out.print("Введите коэффициент c: ");
        int c = scanner.nextInt();
        System.out.println(solveEquation.solve(a, b, c));
    }
}
