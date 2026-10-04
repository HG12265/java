import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            MyRemoteInterface remoteObject = new ServerImple();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("MyRemoteObject", remoteObject);
            System.out.println("RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
