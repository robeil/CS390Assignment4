package CS390Assignment4.Prob5;

public class Main {

    public static void main(String[] args) {

        Computer c1 = new Computer("Mac","IOS",2000,16);
        Computer c2 = new Computer("Dell","Window",1600,12);

        Computer[] computers = {c1,c2};
        System.out.println(c1.equals(c2));

        //printing all the info about the computers
        for(Computer c: computers){
            System.out.println(c.toString());
            System.out.println("Hashcode of this is: "+ c.hashCode());
        }
    }
}
