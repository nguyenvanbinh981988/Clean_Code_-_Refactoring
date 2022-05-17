package Refactoring_tach_phuong_thuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius){
        return 2*radius*Math.PI;
    }

    private static double getBaseArea(int radius){
        return radius*radius*Math.PI;
    }
}
