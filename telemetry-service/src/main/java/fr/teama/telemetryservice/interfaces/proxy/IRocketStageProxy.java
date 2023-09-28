package fr.teama.telemetryservice.interfaces.proxy;


import fr.teama.telemetryservice.exceptions.RocketStageServiceUnavailableException;
import fr.teama.telemetryservice.models.Tracking;

public interface IRocketStageProxy {

    void fuelLevelReached() throws RocketStageServiceUnavailableException;

    void heightReached(Tracking tracking) throws RocketStageServiceUnavailableException;

}
