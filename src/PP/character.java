package PP;
public class character{
    private String Name;
    private int Level;
    private int Hp;
    private int Max_Hp;
    private int Mana;
    private int Max_Mana;
    private int Xp = 0;
    private int Max_Xp = 100;
    private int baseSpeed;
    private int baseAttack;
    private int baseDefense;
    private sword Sword;
    private shield Shield;
    private void calSpeed(){
        int swordSpeedDe = (Sword == null) ? 0 : baseSpeed*(4*Sword.getLevel());
        int shieldSpeedDe = (Shield == null) ? 0 : baseSpeed*(4*Shield.getLevel());
        this.baseSpeed = baseSpeed-swordSpeedDe-shieldSpeedDe;
    }
    public void UpLevel(){
        while (this.Xp >= this.Max_Xp){
            this.Level++;
            this.Xp = this.Xp-this.Max_Xp;
            this.Max_Hp = (int) (this.Max_Xp*1.2);
        }
    }
    public int getLevel() {
        return Level;
    }
    public character(String Name , int Xp , sword swordin , shield shieldin) {
        this.Name = Name;
        this.Level = 1;
        this.Hp = this.Max_Hp;
        this.Mana = this.Max_Mana;
        this.Xp = Xp;
        this.baseSpeed = 1;
        this.baseAttack = 1;
        this.baseDefense = 1;
        this.Sword = swordin;
        this.Shield = shieldin;
        UpLevel();
        calSpeed();
    }
    public void equipSword(sword sword){
        this.Sword = sword;
        calSpeed();
    }
    public void equipShield(shield shield){
        this.Shield = shield;
        calSpeed();
    }
    public void recDamage(int Damage){
        int effDamage = Damage;
        if(Shield != null){
            effDamage -= Shield.getDefense();
        }
        if(effDamage > 0){
            this.Hp -= effDamage;
            if(this.Hp < 0){
                this.Hp = 0;
            }
        }
    }
    public int Attack(){
        if(Sword != null){
            return Sword.getDamage();
        }else return 0;
    }

}
