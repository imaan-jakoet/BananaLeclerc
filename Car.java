/**
 * @author: Siddiqa
 * 
 */

public class Car {

      // Instance variables
      private double maxSpeed;
      private double acceleration;
      private double deceleration;
      private double limp_mode_speed;
      private double crawl_mode_speed;
      private double fuel_tank_capacity;
      private double initial_fuel;
      private boolean limpMode;
      private boolean crawlMode;

      // Default Constructor
      public Car(double maxSpeed, double acceleration, double deceleration, double limp_mode_speed, double crawl_mode_speed, double fuel_tank_capacity, double initial_fuel, boolean limpMode, boolean crawlMode) {
            this.maxSpeed = maxSpeed;
            this.acceleration = acceleration;
            this.deceleration = deceleration;
            this.limp_mode_speed = limp_mode_speed;
            this.crawl_mode_speed = crawl_mode_speed;
            this.fuel_tank_capacity = fuel_tank_capacity;
            this.initial_fuel = initial_fuel;
            this.limpMode = limpMode;
            this.crawlMode = crawlMode;
      }

      // Getters
      public double getMaxSpeed() { return this.maxSpeed; }

      public double getAcceleration() { return this.acceleration; }

      public double getDeceleration() { return this.deceleration; }

      public double getLimpModeSpeed() { return this.limp_mode_speed; }

      public double getCrawlModeSpeed() { return this.crawl_mode_speed; }

      public double getFuelTankCapacity() { return this.fuel_tank_capacity; }

      public double getInitialFuel() { return this.initial_fuel; }

      public boolean getLimpMode() {return this.limpMode; }

      public boolean getCrawlMode() {return this.crawlMode; }

      // Setters

      public void setMaxSpeed(double maxSpeed) { this.maxSpeed = maxSpeed; }

      public void setAcceleration(double acceleration) { this.acceleration = acceleration; }

      public void setDeceleration(double deceleration) { this.deceleration = deceleration; }

      public void setLimpModeSpeed (double limp_mode_speed) {this.limp_mode_speed = limp_mode_speed; }

      public void setCrawlModeSpeed (double crawl_mode_speed) { this.crawl_mode_speed = crawl_mode_speed; }

      public void setFuelTankCapacity (double fuel_tank_capacity) { this.fuel_tank_capacity = fuel_tank_capacity; }

      public void setInitialFuel (double initial_fuel) { this.initial_fuel = initial_fuel; }

      public void setLimpMode(boolean limpMode) {this.limpMode = limpMode;}

      public void setCrawlMode(boolean crawlMode) {this.crawlMode = crawlMode;}
}
