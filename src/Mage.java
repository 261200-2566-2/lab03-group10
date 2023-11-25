public class Mage implements character{
    private String name , wand , veil;
    private int Hp , Mana , Max_Hp = 100 , Max_Mana = 100 , Level , LevelEquipWand , LevelEquipVeil , Exp , Max_Exp;
    private int basespeed , baseDam , baseDef , Damage = 100 , Def = 100;
    public boolean vic , hasWand , hasVeil;
    public Mage(String name , boolean hasWand , boolean hasVeil){
        this.name = name;
        this.Hp = this.Max_Hp;
        this.Mana = this.Max_Mana;
        this.Level = 60;
        this.LevelEquipWand = 1;
        this.LevelEquipVeil = 1;
        this.Exp = 0;
        this.Max_Exp = 100;
        this.basespeed = 5;
        this.baseDam = 2;
        this.baseDef = 1;
        this.hasWand = hasWand;
        this.hasVeil = hasVeil;
        this.wand = hasWand ? "CLIGATIAN" : null;
        this.veil = hasVeil ? "NATANAUO" : null;
    }
    public void calSpeed(){
        int wandSpeedDe = (getWand() == null) ? 0 : (int) (basespeed * 0.2);
        int veilSpeedDe = (getVeil() == null) ? 0 : (int) (basespeed * 0.2);
        this.basespeed = basespeed-wandSpeedDe-veilSpeedDe;
    }
    public String getName(){ return name;}
    public int getHp(){ return Hp;}
    public int getMana(){ return Mana;}
    public int getExp(){ return Exp;}
    public String getWand(){ return wand;}
    public int getDamage(){
        if(wand == null) return baseDam;
        else return (int)(Damage*(1+0.1*Level));
    }
    public String getVeil(){ return veil;}
    public int getDef(){
        if(veil == null) return baseDef;
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
    public int getLevelEquipWand(){ return LevelEquipWand;}
    public void upgradeEuipWand() {
        if(wand != null){
            while((Level)/2 > LevelEquipWand) {
                LevelEquipWand++;
                basespeed += 2;
            }
        }
    }
    public int getLevelEquipVeil(){ return LevelEquipVeil;}
    public void upgradeEuipVeil() {
        if(veil != null){
            while((Level)/2 > LevelEquipVeil) {
                LevelEquipVeil++;
                basespeed += 2;
            }
        }
    }
    public void display(){
        Mage m = new Mage(name,hasWand,hasVeil);
        System.out.println("-------------------------------");
        System.out.println("NAME : " + m.getName());
        System.out.println("HP : " + m.getHp());
        System.out.println("MANA : " + m.getMana());
        System.out.println("EXP : " + m.getExp());
        //สมมติกรณีที่เลเวล 60
        m.upgradeEuipWand();
        m.calSpeed();
        System.out.println("SPEED : " + m.getSpeed());
        System.out.println("LEVEL : " + m.getLevel());
        System.out.println("WAND : " + m.getWand());
        if(m.wand != null){
            System.out.println("LEVEL WAND : " + m.getLevelEquipWand());
        }
        System.out.println("VEIL : " + m.getVeil());
        if(m.veil != null){
            System.out.println("LEVEL VEIL : " + m.getLevelEquipVeil());
        }
        System.out.println("-------------------------------");
    }
    public int getSpeed(){ return basespeed;}
}
