public class thief{
    String name;
    int hp;
    int mp;

    public thief(String name,int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public thief(String name,int hp){
        this(name,hp,5);
    }

    public thief(String name){
        this(name,40,5);
    }
}