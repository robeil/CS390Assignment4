package CS390Assignment4.Prob3;

public class Driver {

    public static void main(String[] args) {
        Figure[] figures = {
                new DownwardHat(),
                new DownwardHat(),
                new UpwardHat(),
                new FaceMaker(),
                new Vertical()
        };
        //printing all together
        for(Figure f: figures){
            f.getFigure();
        }

       //printing all together with their run time type
       for(int i = 0; i < figures.length; i++){
          System.out.print(figures[i].getClass().getSimpleName() +": ");
          figures[i].getFigure();
       }
    }
}
