public class Race {
    // instance variables
    private String race_name;
    private int num_laps;
    private double pitTyreSwapTime;
    private double basePitStopTime;
    private double pitRefuelRate;
    private double cornerCrashPenalty;
    private double pitExitSpeed;
    private double fuelSoftCapLimit;
    private String startingWeatherCond;
    private double timeReference;

    public Race(String race_name, int num_laps, double pitTyreSwapTime, double basePitStopTime, double pitRefuelRate, double cornerCrashPenalty, double pitExitSpeed, double fuelSoftCapLimit, String startingWeatherCond, double timeReference) {
        this.race_name = race_name;
        this.num_laps = num_laps;
        this.pitTyreSwapTime = pitTyreSwapTime;
        this.basePitStopTime = basePitStopTime;
        this.pitRefuelRate = pitRefuelRate;
        this.cornerCrashPenalty = cornerCrashPenalty;
        this.pitExitSpeed = pitExitSpeed;
        this.fuelSoftCapLimit = fuelSoftCapLimit;
        this.startingWeatherCond = startingWeatherCond;
        this.timeReference = timeReference;
    }

    // Getters
    public String getRaceName() { return race_name; }
    public int getNumLaps() { return num_laps; }
    public double getPitTyreSwapTime() { return pitTyreSwapTime; }
    public double getBasePitStopTime() { return basePitStopTime; }
    public double getPitRefuelRate() { return pitRefuelRate; }
    public double getCornerCrashPenalty() { return cornerCrashPenalty; }
    public double getPitExitSpeed() { return pitExitSpeed; }
    public double getFuelSoftCapLimit() { return fuelSoftCapLimit; }
    public String getStartingWeatherCond() { return startingWeatherCond; }
    public double getTimeReference() { return timeReference; }

    // Setters
    public void setRaceName(String race_name) { this.race_name = race_name; }
    public void setNumLaps(int num_laps) { this.num_laps = num_laps; }
    public void setPitTyreSwapTime(double pitTyreSwapTime) { this.pitTyreSwapTime = pitTyreSwapTime; }
    public void setBasePitStopTime(double basePitStopTime) { this.basePitStopTime = basePitStopTime; }
    public void setPitRefuelRate(double pitRefuelRate) { this.pitRefuelRate = pitRefuelRate; }
    public void setCornerCrashPenalty(double cornerCrashPenalty) { this.cornerCrashPenalty = cornerCrashPenalty; }
    public void setPitExitSpeed(double pitExitSpeed) { this.pitExitSpeed = pitExitSpeed; }
    public void setFuelSoftCapLimit(double fuelSoftCapLimit) { this.fuelSoftCapLimit = fuelSoftCapLimit; }
    public void setStartingWeatherCond(String startingWeatherCond) { this.startingWeatherCond = startingWeatherCond; }
    public void setTimeReference(double timeReference) { this.timeReference = timeReference; }
}