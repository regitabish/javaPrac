public class Cleric{
    String name;
    int hp =50;
    int mp =10;

    final int maxHp = 50;
    final int maxMp = 10;

    public void selfAid(){
        this.mp -= 5;
        this.hp = this.maxHp;
    }

    public int pray(int praySec){
        int rand = new java.util.rand.nextInt(3);

        this.mp += rand+praySec;
        if(this.mp > this.maxMp){
            this.mp = this.maxMp;
        }

        return rand+praySec
    }
    
}