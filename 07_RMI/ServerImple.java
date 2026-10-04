import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImple extends UnicastRemoteObject implements MyRemoteInterface {
    public ServerImple() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello from RMI Server!";
    }

    @Override
    public String sendMessage(String message) throws RemoteException {
        return "Message received by the server: " + message;
    }
}
