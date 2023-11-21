public abstract class Charactor {
    public String name;
    public int level,speed;
    public float Hp,Max_Hp,mana,xp;

    public Charactor(String name,int level,float Hp,float Max_Hp,float mana,float xp,int speed){
        this.name = name;
        this.level = level;
        this.Hp = Hp;
        this.Max_Hp = Max_Hp;
        this.mana = mana;
        this.xp = xp;
        this.speed = speed;
    }
}
