package BTVN_day7.Ex2;

public class Circle implements  IShape{
    private double radius;
    //final double pi=3.14;

    public Circle(double  radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }
}
