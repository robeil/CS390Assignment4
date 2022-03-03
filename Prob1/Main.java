package CS390Assignment4.Prob1;

public class Main {

    public static void printTotal(Shape[] shapes){
        double totalArea = 0.0;
        double totalPerimeter= 0.0;
        for(Shape s : shapes){
            System.out.println(s.toString());
            totalArea += s.calculateArea();
          totalPerimeter += s.calculatePerimeter();
        }
        System.out.println("Total area " + totalArea +"\nTotal Perimeter "+ totalPerimeter);
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
