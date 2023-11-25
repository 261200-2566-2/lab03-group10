import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        player p = new player();
        System.out.println("Choose a character (Warrior/Mage): ");
        Scanner s = new Scanner(System.in);
        String characterType = s.nextLine();
        p.chooseCharacter(characterType);
        p.displayCharacterCounts();

        //PAST CODE
//        Warrior PP = new Warrior("PP",true , false);
//        System.out.println("Name : " + PP.getName());
//        System.out.println("Level : " + PP.getLevel());
//        System.out.println("Sword : " + PP.getSword());
//        System.out.println("Shield : " + PP.getShield());
//        PP.UpLevel();
//        PP.upgradeEuipShield();
//        System.out.println("LevelEquip : " + PP.getDamage());
//        System.out.println("LevelEquip : " + PP.getDef());
//
//        System.out.println("----------------------------------------------------");
//
//        Mage CC = new Mage("CC",true,true);
//        System.out.println(CC.getLevel());

    }
}