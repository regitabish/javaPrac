public class PoisonMatango extends Matango{

    public PoisonMatango(char suffix){
        super(suffix)= suffix;
    }

    int poisonAttackNum = 5;

    public void attack(Hero h){
        super.attack(h);
        if(this.poisonAttackNum > 0){
            System.out.println("Poison Attack from poison matango "+this.suffix);
            int damege = h.hp/5;
            System.out.println(damege +" damage for"+h.name);
            h.hp -= damege;
            this.poisonAttackNum -= 1;
        }
    }
}