package CS390Assignment4;

public class Main {

    public static void printTotal(Shape[] shapes){
        for(Shape s : shapes){
            System.out.println(s.toString());
        }
    }
    public static void main(String[] args){
        //creating array of shape
        Shape[] shapeColl = {
                new Circle("Red",2),
                new Rectangle("Black",4,2),
                new Square("White",4,4),
                new Rectangle("Red",4,6),
                new Circle("Yellow",6)
        };
        //calling the static method
        printTotal(shapeColl);
    }
}
