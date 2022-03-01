package CS390Assignment4.Prob1;

public class Circle extends Shape {
    //instance field
    double radius;
    //constructor
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    //calculate area
    public double calculateArea(double radius){
        return Math.PI * radius * radius;
    }
    //calculate perimeter
    public double calculatePerimeter(double radius){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius: " + radius +
                ", color: " + color;
    }
}
