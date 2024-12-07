package org.example.mediaclient.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class VideoDto {

    String id;
    String title;
    String description;
    String url;
    int duration_seconds;

}
