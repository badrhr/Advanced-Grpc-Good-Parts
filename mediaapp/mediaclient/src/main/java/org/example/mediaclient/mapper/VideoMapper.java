package org.example.mediaclient.mapper;

import org.example.mediaclient.dto.VideoDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.xproce.lab.Video;

@Component
public class VideoMapper {

    ModelMapper mapper = new ModelMapper();

    public VideoDto fromVideoProtoTovideoDto(Video video) {
        return mapper.map(video, VideoDto.class);
    }
}
