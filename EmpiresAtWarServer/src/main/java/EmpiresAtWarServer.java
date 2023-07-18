import domain.services.WorldService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.util.logging.Logger;

public class EmpiresAtWarServer {

    private static final Logger logger = Logger.getLogger(EmpiresAtWarServer.class.getName());
    static int serverPort = 50051;

    public static void main(String[] args) {

        try {
            final Server svc = ServerBuilder.forPort(serverPort)
                    .addService(new WorldService())
                    .build()
                    .start();
            logger.info("Empires At War Server started, listening on " + serverPort);
            System.err.println("Server await termination");
            svc.awaitTermination();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
