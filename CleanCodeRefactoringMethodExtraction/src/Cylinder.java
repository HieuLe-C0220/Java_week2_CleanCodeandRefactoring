public class Cylinder {
    public static double getVolume(double radius, double height){
        double volume = getbaseArea(radius) * height + 2 * getPerimeter(radius);
        return volume;
    }
    public static double getPerimeter(double radius) {
        return 2*Math.PI*radius;
    }
    public static double getbaseArea(double radius) {
        return Math.PI*radius*radius;
    }
}
