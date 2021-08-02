package com.study.event.eventapp.event;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;
import java.util.UUID;

@Builder
@Getter
public class FileEvent {

    private String eventId;
    private String type;
    private Map<String,Object> data;

    public static FileEvent toCompleteEvent(Map<String,Object> data){
        return FileEvent.builder()
                .eventId(UUID.randomUUID().toString())
                .type(EventType.COMPLETE.name())
                .data(data)
                .build();
    }

    public static FileEvent toErrorEvent(Map<String,Object> data){
        return FileEvent.builder()
                .eventId(UUID.randomUUID().toString())
                .type(EventType.ERROR.name())
                .data(data)
                .build();
    }
}
