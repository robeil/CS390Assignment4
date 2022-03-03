package CS390Assignment4.Prob3;

public class Driver {

    public static void main(String[] args) {
        Figure[] figures = {
                new UpwardHat(),
                new UpwardHat(),
                new DownwardHat(),
                new FaceMaker(),
                new Vertical()
        };
        //printing all together
        for(Figure f: figures){
            f.getFigure();
        }
        System.out.println(" ");
        System.out.print(" --->");
       //printing all together with their run time type
       for(int i = 0; i < figures.length; i++){
          System.out.print("\n"+figures[i].getClass().getSimpleName() +": ");
          figures[i].getFigure();
       }
    }
}
