package com.github.java4wro.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class EventDTO {

    private Integer eventPrice;
    private String eventName;
    private String eventDescription;
    private LocalDateTime eventDateTime;

    public Integer getEventPrice() {
        return eventPrice;
    }

    public void setEventPrice(Integer eventPrice) {
        this.eventPrice = eventPrice;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(LocalDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }
}
