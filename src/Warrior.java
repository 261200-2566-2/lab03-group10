public class Warrior implements character {
    private String name , sword , shield;
    private int Hp , Mana , Max_Hp = 100 , Max_Mana = 100 , Level , LevelEquipSword , LevelEquipShield , Exp , Max_Exp;
    private int basespeed , baseDam , baseDef , Damage = 100 , Def = 100;
    private boolean vic , hasSword , hasShield;
    public Warrior(String name , boolean hasSword , boolean hasShield){
        this.name = name;
        this.Hp = this.Max_Hp;
        this.Mana = this.Max_Mana;
        this.Level = 1;
        this.LevelEquipSword = 1;
        this.LevelEquipShield = 1;
        this.Exp = 0;
        this.Max_Exp = 100;
        this.basespeed = 5;
        this.baseDam = 2;
        this.baseDef = 1;
        this.hasSword = hasSword;
        this.hasShield = hasShield;
        this.sword = hasSword ? "EXTREMIN" : null;
        this.shield = hasShield ? "LEVIATAN" : null;
    }
    public void calSpeed(){
        int swordSpeedDe = (getSword() == null) ? 0 : (int) (basespeed * 0.2);
        int shieldSpeedDe = (getShield() == null) ? 0 : (int) (basespeed * 0.2);
        this.basespeed = basespeed-swordSpeedDe-shieldSpeedDe;
    }
    public String getName(){ return name;}
    public int getHp(){ return Hp;}
    public int getMana(){ return Mana;}
    public int getExp(){ return Exp;}
    public String getSword(){ return sword;}
    public int getDamage(){
        if(sword == null) return baseDam;
        else return (int)(Damage*(1+0.1*Level));
    }
    public String getShield(){ return shield;}
    public int getDef(){
        if(shield == null) return baseDef;
        else return (int)(Def*(1+0.05*Level));
    }
    public int getLevel(){ return Level;}
    public void UpLevel(){
        while (this.Exp >= this.Max_Exp){
            this.Level++;
            this.Exp = this.Exp-this.Max_Exp;
            this.Max_Hp = (int) (this.Max_Exp*1.2);
        }
    }
    public int getLevelEquipSword(){ return LevelEquipSword;}
    public void upgradeEuipSword() {
        if(sword != null){
            while((Level)/2 > LevelEquipSword) {
                LevelEquipSword++;
                basespeed += 2;
            }
        }
    }
    public int getLevelEquipShield(){ return LevelEquipShield;}
    public void upgradeEuipShield() {
        if(shield != null){
            while((Level)/2 > LevelEquipShield) {
                LevelEquipShield++;
                basespeed += 2;
            }
        }
    }
    public void display(){
        Warrior w = new Warrior(name,hasSword,hasShield);
        System.out.println("-------------------------------");
        System.out.println("NAME : " + w.getName());
        System.out.println("HP : " + w.getHp());
        System.out.println("MANA : " + w.getMana());
        System.out.println("EXP : " + w.getExp());
        w.calSpeed();
        System.out.println("SPEED : " + w.getSpeed());
        System.out.println("LEVEL : " + w.getLevel());
        System.out.println("SWORD : " + w.getSword());
        if(w.sword != null){
            System.out.println("LEVEL SWORD : " + w.getLevelEquipSword());
        }
        System.out.println("SHIELD : " + w.getShield());
        if(w.shield != null){
            System.out.println("LEVEL SHIELD : " + w.getLevelEquipShield());
        }
        System.out.println("-------------------------------");
    }
    public int getSpeed(){ return basespeed;}
}
