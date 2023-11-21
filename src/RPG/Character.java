package RPG;

public abstract class Character {
    public String name;
    public int level,speed;
    public int Hp,Max_Hp,mana,xp;

    public Character(String name,int level,int Hp,int Max_Hp,int mana,int xp,int speed){
        this.name = name;
        this.level = level;
        this.Hp = Hp;
        this.Max_Hp = Max_Hp;
        this.mana = mana;
        this.xp = xp;
        this.speed = speed;
    }
}
