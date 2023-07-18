import empires.GameServiceGrpc;
import empires.World;
import empires.WorldRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpiresAtWarClient {

    public static final Logger logger = Logger.getLogger(EmpiresAtWarClient.class.getName());

    public static void main(String[] args) throws InterruptedException {

        ManagedChannel channelServer = null;

        try {
            channelServer = ManagedChannelBuilder.forAddress("localhost", 50051)
                    .usePlaintext()
                    .build();
            GameServiceGrpc.GameServiceBlockingStub blockingStub = GameServiceGrpc.newBlockingStub(channelServer);
            World world = blockingStub.getWorldInfo(WorldRequest.newBuilder().setUuid("1").build());
            System.out.println(world);

        } catch (Exception ex) {
            logger.log(Level.SEVERE, "Error:" + ex.getMessage());
        }

        if (channelServer != null) {
            logger.log(Level.INFO, "Shutdown channel to client");
            channelServer.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
