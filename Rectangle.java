package CS390Assignment4;

public class Rectangle extends Shape {
    //instance fields declared as default
    double width;
    double height;

    //parameterized constructor
    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    //calculateArea method
    public double calculateArea(double width, double height){
        return width * height;
    }
    //calculating perimeter
    public double calculatePerimeter(){
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "width: " + width +
                ", height: " + height +
                ", color: " + color;
    }
}
