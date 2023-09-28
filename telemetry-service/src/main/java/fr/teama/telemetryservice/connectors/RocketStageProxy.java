package fr.teama.telemetryservice.connectors;

import fr.teama.telemetryservice.exceptions.RocketStageServiceUnavailableException;
import fr.teama.telemetryservice.helpers.LoggerHelper;
import fr.teama.telemetryservice.interfaces.proxy.IRocketStageProxy;
import fr.teama.telemetryservice.models.Tracking;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RocketStageProxy implements IRocketStageProxy {
    @Value("${rocket-department.host.baseurl}")
    private String apiBaseUrlHostAndPort;

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public void fuelLevelReached() {
        LoggerHelper.logInfo("Notify the rocket department that the fuel has reached a specific level");
        restTemplate.postForEntity(apiBaseUrlHostAndPort + "/rocket/stage", null, String.class);
    }

    @Override
    public void heightReached(Tracking tracking) {
        LoggerHelper.logInfo("Notify the rocket department that the rocket has reached a specific height");
        restTemplate.postForEntity(apiBaseUrlHostAndPort + tracking.getRouteToNotify(), null, String.class);
    }
}
