package PP;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        sword ei = new sword("D",1,100);
        shield op = new shield("O",1,100);
        Monster slime  = new Monster("slime",1,1,1,100);
        player p1 = new player("yee",ei,op);

        System.out.println("-----------------------------");
        System.out.println("Name :" + p1.getName());
        System.out.println("-----------------------------");
        System.out.println("Name :" + slime.getName());
    }

}