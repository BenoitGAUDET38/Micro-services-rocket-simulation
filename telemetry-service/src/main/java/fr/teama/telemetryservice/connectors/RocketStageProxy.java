package fr.teama.telemetryservice.connectors;

import fr.teama.telemetryservice.interfaces.ILoggerComponent;
import fr.teama.telemetryservice.interfaces.proxy.IRocketStageProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RocketStageProxy implements IRocketStageProxy {
    @Value("${rocket-stage.host.baseurl}")
    private String apiBaseUrlHostAndPort;

    @Autowired
    ILoggerComponent logger;

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public void fuelLevelReached() {
        logger.logInfo("Notify the rocket department that the fuel as reached a specific level");
        restTemplate.postForEntity(apiBaseUrlHostAndPort + "/rocket/start-logging", null, String.class);
    }
}
