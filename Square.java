package CS390Assignment4;

public class Square extends Rectangle {

    public Square(String color, double side1, double side) {
        super(color, side1, side);
         width = side1;
         height = side;
    }

    @Override
    public String toString() {
        return "Square : " +
                "width: " + width +
                ", height: " + height +
                ", color: " + color;
    }
}
