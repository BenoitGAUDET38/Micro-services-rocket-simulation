package fr.teama.weatherservice.services;

import fr.teama.weatherservice.connectors.externalDTO.MissionLogDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class KafkaProducerService {
    private static KafkaTemplate<String, MissionLogDTO> kafkaTemplate;

    @Autowired
    public KafkaProducerService(KafkaTemplate<String, MissionLogDTO> kafkaTemplate) {
        KafkaProducerService.kafkaTemplate = kafkaTemplate;
    }

    public static void sendMissionLog(String serviceName, String text) {
        MissionLogDTO missionLogDTO = new MissionLogDTO(serviceName, text, LocalDateTime.now());
        kafkaTemplate.send("logs-topic", missionLogDTO);
    }
}

