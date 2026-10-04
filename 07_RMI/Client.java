import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            MyRemoteInterface remoteObject =
                (MyRemoteInterface) Naming.lookup("rmi://localhost/MyRemoteObject");

            String result = remoteObject.sendMessage("Hello from RMI Client!");
            System.out.println("Server Response: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
