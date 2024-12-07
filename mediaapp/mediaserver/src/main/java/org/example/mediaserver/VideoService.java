package org.example.mediaserver;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.xproce.lab.UploadVideoRequest;
import org.xproce.lab.Video;
import org.xproce.lab.VideoServiceGrpc;

@GrpcService
public class VideoService extends VideoServiceGrpc.VideoServiceImplBase {

    @Override
    public void uploadVideo(UploadVideoRequest request, StreamObserver<Video> responseObserver) {

        Video video = Video.newBuilder()
                .setId("1234")
                .setTitle(request.getTitle())
                .setDescription(request.getDescription())
                .setUrl(request.getUrl())
                .setDurationSeconds(request.getDurationSeconds())
                .setCreator(request.getCreator())
                .build();
        responseObserver.onNext(video);
        responseObserver.onCompleted();

    }
}
