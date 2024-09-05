public class Matango{
    int hp = 50;
    char suffix;
    public Matango(char suffix){
        this.suffix = suffix;
    }

    public void attack(Hero h){
        System.out.println("attack of Matango " +this.suffix);
        System.out.println("10 damege");
        h.hp -= 10;
    }
    
}