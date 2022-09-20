package Remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SolveEquation extends Remote {
    public String  solve(int a,int b,int c) throws RemoteException;
}
