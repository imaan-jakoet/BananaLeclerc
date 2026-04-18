public class Tyres {
    int availableTyreSet;
    int tyreID;
    String compound;
    double lifeSpan;
    double dryFrictionMultiplier;
    double coldFrictionMultiplier;
    double lightRainFrictionMultiplier;
    double heavyRainFrictionMultiplier;
    double dryDegradation;
    double coldDegradation;
    double lightRainDegradation;
    double heavyRainDegradation;

    public Tyres(int availableTyreSet, int tyreID, String compound, double lifeSpan, double dryFrictionMultiplier, double coldFrictionMultiplier, double lightRainFrictionMultiplier, 
    double heavyRainFrictionMultiplier, double dryDegradation, double coldDegradation, double lightRainDegradation, double heavyRainDegradation){
        this.availableTyreSet = availableTyreSet;
        this.tyreID = tyreID;
        this.compound = compound;
        this.lifeSpan = lifeSpan;
        this.dryFrictionMultiplier = dryFrictionMultiplier;
        this.coldFrictionMultiplier = coldFrictionMultiplier;
        this.lightRainFrictionMultiplier = lightRainFrictionMultiplier;
        this.heavyRainFrictionMultiplier = heavyRainFrictionMultiplier;
        this.dryDegradation = dryDegradation;
        this.coldDegradation = coldDegradation;
        this.lightRainDegradation = lightRainDegradation;
        this.heavyRainDegradation = heavyRainDegradation;
    }

    public int getAvailableTyreSet() {
        return availableTyreSet;
    }

    public double getColdDegradation() {
        return coldDegradation;
    }

    public double getColdFrictionMultiplier() {
        return coldFrictionMultiplier;
    }

    public String getCompound() {
        return compound;
    }

    public double getDryDegradation() {
        return dryDegradation;
    }

    public double getDryFrictionMultiplier() {
        return dryFrictionMultiplier;
    }

    public double getHeavyRainDegradation() {
        return heavyRainDegradation;
    }

    public double getHeavyRainFrictionMultiplier() {
        return heavyRainFrictionMultiplier;
    }

    public double getLifeSpan() {
        return lifeSpan;
    }

    public double getLightRainDegradation() {
        return lightRainDegradation;
    }

    public double getLightRainFrictionMultiplier() {
        return lightRainFrictionMultiplier;
    }

    public int getTyreID() {
        return tyreID;
    }

    public void setAvailableTyreSet(int availableTyreSet) {
        this.availableTyreSet = availableTyreSet;
    }

    public void setColdDegradation(double coldDegradation) {
        this.coldDegradation = coldDegradation;
    }

    public void setColdFrictionMultiplier(double coldFrictionMultiplier) {
        this.coldFrictionMultiplier = coldFrictionMultiplier;
    }

    public void setCompound(String compound) {
        this.compound = compound;
    }

    public void setDryDegradation(double dryDegradation) {
        this.dryDegradation = dryDegradation;
    }

    public void setDryFrictionMultiplier(double dryFrictionMultiplier) {
        this.dryFrictionMultiplier = dryFrictionMultiplier;
    }

    public void setHeavyRainDegradation(double heavyRainDegradation) {
        this.heavyRainDegradation = heavyRainDegradation;
    }

    public void setHeavyRainFrictionMultiplier(double heavyRainFrictionMultiplier) {
        this.heavyRainFrictionMultiplier = heavyRainFrictionMultiplier;
    }

    public void setLifeSpan(double lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public void setLightRainDegradation(double lightRainDegradation) {
        this.lightRainDegradation = lightRainDegradation;
    }

    public void setLightRainFrictionMultiplier(double lightRainFrictionMultiplier) {
        this.lightRainFrictionMultiplier = lightRainFrictionMultiplier;
    }

    public void setTyreID(int tyreID) {
        this.tyreID = tyreID;
    }
}
