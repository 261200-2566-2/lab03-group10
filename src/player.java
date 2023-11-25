import java.util.ArrayList;
import java.util.Scanner;


public class player {
    private ArrayList<Warrior> Wcharacters = new ArrayList<>();
    private ArrayList<Mage> Mcharacters = new ArrayList<>();
    public void chooseCharacter (String input) {
        Scanner s = new Scanner(System.in);
        if (input.equals("Warrior")) {
            Warrior warrior = createWarrior(s);
            Wcharacters.add(warrior);
        } else if (input.equals("Mage")) {
            Mage mage = createMage(s);
            Mcharacters.add(mage);
        }
    }
    private boolean getBooleanInput (String Question, Scanner scanner) {
        System.out.println(Question);
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("Y");
    }
    private Warrior createWarrior (Scanner s) {
        System.out.println("What's your name?");
        String name = s.nextLine();
        boolean hasSword = getBooleanInput("Do you want a sword? [Y/N]", s);
        boolean hasShield = getBooleanInput("Do you want a shield? [Y/N]", s);
        Warrior warrior = new Warrior(name, hasSword, hasShield);
        warrior.display();
        return warrior;
    }
    private Mage createMage(Scanner scanner) {
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        boolean hasWand = getBooleanInput("Do you want a wand? [Y/N]", scanner);
        boolean hasVeil = getBooleanInput("Do you want a veil? [Y/N]", scanner);
        Mage mage = new Mage(name, hasWand, hasVeil);
        mage.display();
        return mage;
    }
    public void displayCharacterCounts() {
        System.out.println("Character Counts:");
        System.out.println("Warriors: " + Wcharacters.size());
        System.out.println("Mages: " + Mcharacters.size());
    }

    //PAST CODE
//    public void chooseCharacter(String input){
//        private ArrayList<Warrior> Wcharacters = new ArrayList<>();
//        private ArrayList<Mage> Mcharacters = new ArrayList<>();
//        ArrayList<Support> Scharacters = new ArrayList<>();
//        Scanner s = new Scanner(System.in);
//        if(input.equals("Warrior")){
//            System.out.println("what's your name?");
//            String N = s.nextLine();
//            System.out.println("Do you wanna sword? [Y/N]");
//            String Ans1 = s.nextLine();
//            if(Ans1.equals(("Y"))) Ans1 = "true";
//            else if (Ans1.equals(("N"))) Ans1 = "false";
//            boolean ans1 = Boolean.parseBoolean(Ans1);
//            System.out.println("Do you wanna shield? [Y/N]");
//            String Ans2 = s.nextLine();
//            if(Ans2.equals(("Y"))) Ans2 = "true";
//            else if (Ans2.equals(("N"))) Ans2 = "false";
//            boolean ans2 = Boolean.parseBoolean(Ans2);
//            Warrior w = new Warrior(N,ans1,ans2);
//            w.display();
//            Wcharacters.add(w);
//        }
//        else if(input.equals("Mage")){
//            System.out.println("what's your name?");
//            String N = s.nextLine();
//            System.out.println("Do you wanna wand? [Y/N]");
//            String Ans1 = s.nextLine();
//            if(Ans1.equals("Y")) Ans1 = "true";
//            else if (Ans1.equals(("N"))) Ans1 = "false";
//            boolean ans1 = Boolean.parseBoolean(Ans1);
//            System.out.println("Do you wanna veil? [Y/N]");
//            String Ans2 = s.nextLine();
//            if(Ans2.equals("Y")) Ans2 = "true";
//            else if (Ans2.equals(("N"))) Ans2 = "false";
//            boolean ans2 = Boolean.parseBoolean(Ans2);
//            Mage m = new Mage(N,ans1,ans2);
//            m.display();
//            Mcharacters.add(m);
//        }
}
