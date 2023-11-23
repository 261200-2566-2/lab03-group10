package PP;

public class sword {
    private String name;
    private int Level;
    private int Damage;
    public sword(String name,int Level , int Damage){
        this.name = name;
        this.Level = Level;
        this.Damage = Damage;
    }
    public int getDamage() {
        return (int) (Damage*(1+0.1*Level));
    }
    public int getLevel(){
        return Level;
    }

    public String getSwordName() {
        return name;
    }
}
