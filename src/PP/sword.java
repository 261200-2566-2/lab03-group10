package PP;

public class sword {
    private int Level;
    private int Damage;
    public sword(int Level , int Damage){
        this.Level = Level;
        this.Damage = Damage;
    }
    public int getDamage() {
        return (int) (Damage*(1+0.1*Level));
    }
    public int getLevel(){
        return Level;
    }
}
