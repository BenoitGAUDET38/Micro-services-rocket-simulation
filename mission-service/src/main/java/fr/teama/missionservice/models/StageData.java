package fr.teama.missionservice.models;

public class StageData {

    private int stageLevel;
    private Double fuel;

    public StageData(int stageLevel, Double fuel) {
        this.stageLevel = stageLevel;
        this.fuel = fuel;
    }

    public int getStageLevel() {
        return stageLevel;
    }

    public void setStageLevel(int stageLevel) {
        this.stageLevel = stageLevel;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

}
