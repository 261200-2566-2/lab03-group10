package PP;

public class player extends character{
    public int AtkUp_,DefUp_,SpeedUp_;
    private sword NoobSword;
    private shield BrokenShield;
    public void WeaponSetStat(){

    }

    public player(String Name ,sword Weapon,shield Shield) {
        super(Name, 1, 1, 1, 100);

        this.AtkUp_ = 0;
        this.SpeedUp_ = 0;
        this.DefUp_ = 0;
        this.NoobSword = Weapon;
        this.BrokenShield = Shield;
    }
    public int Atk(){
        return getBaseAttack() + AtkUp_;
    }

    public int Def(){
        return getBaseDefense() + DefUp_;
    }
}
// extends character