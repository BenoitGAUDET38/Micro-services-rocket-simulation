package fr.teama.telemetryservice.entities;

import java.util.List;

public class Rocket {

    private Double altitude;

    private Double speed;

    private List<Stage> stages;

    public Rocket(List<Stage> stages) {
        this.altitude = 0.0;
        this.speed = 0.0;
        this.stages = stages;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public List<Stage> getStages() {
        return stages;
    }

    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "altitude=" + altitude +
                ", speed=" + speed +
                ", stages=" + stages +
                '}';
    }
}
