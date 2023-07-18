package domain.services;

import empires.GameServiceGrpc;
import empires.World;
import empires.WorldRequest;
import io.grpc.stub.StreamObserver;

public class WorldService extends GameServiceGrpc.GameServiceImplBase {

    public WorldService(){
        // initiate repository
    }

    @Override
    public void getWorldInfo(WorldRequest request, StreamObserver<World> responseObserver) {
        System.out.println(request);
        responseObserver.onNext(World.newBuilder().setUuid("1").setName("World 1").build());
        responseObserver.onCompleted();
    }
}
