package PP;

public class shield {
    private String name;
    private int Level;
    private int Defense;
    public shield(String name,int Level , int Defense){
        this.name = name;
        this.Level = Level;
        this.Defense = Defense;
    }
    public int getDefense() {
        return (int) (Defense*(1+0.05*Level));
    }
    public int getLevel() {
        return Level;
    }

    public String getShieldName() {
        return name;
    }
}
