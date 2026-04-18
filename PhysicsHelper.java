public class PhysicsHelper {
    public static final double GRAVITY = 9.8;    

    public static double calculateMaxCornerSpeed(double tyreFriction, double radius, double crawlConstant){
        return Math.sqrt(tyreFriction * GRAVITY * radius) + crawlConstant;
    }

    public static double calculateBrakingDistance(double currentSpeed, double targerCornerSpeed, double brakeRate){
        return (Math.pow(currentSpeed, 2) - Math.pow(targerCornerSpeed, 2)) / (2 * brakeRate);
    }
}
