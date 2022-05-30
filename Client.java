import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Map;

/**
 * A client to access the server: Client.java
 * @author Pouria Roostaei
 */

public class Client {
    public static void main(String[] args) {

        String host = "localhost";
        Integer port = 6231;
        try {
            // TODO: Connect to the registry


            // TODO: Look up a stub with name "Dictionary"


            String line  = "I am student at Concordia University. This is my favourite course at Concordia University.";

            // TODO: Test word(String line)
            /**
             * Create res variable to receive response from stub.
             * @param res Map<String, Integer>
             */

            System.out.println("response (String line): " + res);

            // TODO: Test word(String[] line)

            System.out.println("response (String[] lines): " + res);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}