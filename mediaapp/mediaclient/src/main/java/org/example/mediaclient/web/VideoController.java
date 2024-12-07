package org.example.mediaclient.web;

import com.google.protobuf.Descriptors;
import org.example.mediaclient.dto.VideoDto;
import org.example.mediaclient.service.VideoServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.xproce.lab.Creator;
import org.xproce.lab.UploadVideoRequest;
import org.xproce.lab.Video;

import java.util.Map;

@RestController
public class VideoController {

    @Autowired
    private VideoServiceClient videoService;

    @PostMapping("addVideo")
    public VideoDto uploadVideo() {
        Creator creator = Creator.newBuilder()
                .setName("Xproce")
                .setEmail("hirchoua.badr@gmail.com")
                .setId("2")
                .build();

        UploadVideoRequest request = UploadVideoRequest.newBuilder()
                .setTitle("grpc 101")
                .setDescription("The gRPC 101 is an introductory course to master Grpc")
                .setUrl("https://github.com/badrhr/gRPC101")
                .setDurationSeconds(380)
                .setCreator(creator)
                .build();

        VideoDto videoDto = videoService.uploadVideo(request);
        System.out.println(videoDto);
        return videoDto;

    }

}
