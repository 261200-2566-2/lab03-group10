package PP;

public class player{
    public player(String name,int xp,sword Sword,shield Shield) {
        Sword = new sword(2, 15);
        Shield = new shield(1, 10);
        character PP = new character("PP",20,Sword,Shield);
    }
}
// extends character