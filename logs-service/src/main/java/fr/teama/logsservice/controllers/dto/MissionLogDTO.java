package fr.teama.logsservice.controllers.dto;

import java.time.LocalDateTime;

public class MissionLogDTO {
    String serviceName;
    String text;
    LocalDateTime date;

    @Override
    public String toString() {
        return "MissionLogDTO{" +
                "serviceName='" + serviceName + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
