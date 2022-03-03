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
    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    //calculate perimeter
    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius: " + radius +
                ", color: " + color;
    }
}
