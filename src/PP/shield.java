package PP;

public class shield {
    private int Level;
    private int Defense;
    public shield(int Level , int Defense){
        this.Level = Level;
        this.Defense = Defense;
    }
    public int getDefense() {
        return (int) (Defense*(1+0.05*Level));
    }
    public int getLevel() {
        return Level;
    }
}
