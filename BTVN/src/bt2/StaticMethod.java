package bt2;

public class StaticMethod {
    private static double PI=3.14;
    public static double calCircleArea(double radius){
        return PI*radius*radius;
    }
    public static double calRectangleArea(double width,double height){
        return width*height;
    }
    public static double calTriangleArea(double a,double b, double c){
        double halfPerimetr=(a+b+c)/2;
        return Math.sqrt(halfPerimetr*(halfPerimetr-a)*(halfPerimetr-b)*(halfPerimetr-c));
    }


}
