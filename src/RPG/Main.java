package RPG;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Player player = new Player("Player1");
        Monster monster = new Monster("Monster1", 1, 50, 50, 0, 10, 2);

        System.out.println("Player name: " + player.name);
        System.out.println("Monster name: " + monster.name);
    }

}