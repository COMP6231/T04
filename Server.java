import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * A server that will run the remote object: Server.java
 * @author Pouria Roostaei
 */

public class Server {

    public static void main(String[] args) {

        try {
            //TODO: Create a stub from the remote object (Hint: UnicastRemoteObject)

            // TODO: Create a new registry and bind the remote object's stub in it


            System.out.println("Server is ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}