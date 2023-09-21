package fr.teama.telemetryservice.interfaces;

import fr.teama.telemetryservice.entities.Notification;
import fr.teama.telemetryservice.entities.RocketData;
import fr.teama.telemetryservice.exceptions.PayloadServiceUnavailableException;
import fr.teama.telemetryservice.exceptions.RocketStageServiceUnavailableException;
import org.springframework.http.ResponseEntity;

public interface DataSaver {
    ResponseEntity<String> saveData(RocketData rocketData) throws PayloadServiceUnavailableException, RocketStageServiceUnavailableException;
}
