public class prac3_6{
    static public void main(String[] args){
        System.out.println("game start");
        System.out.println("input a number");
        for(int i=0;i<5;i++){
            int num = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
            int ans = new java.util.Random().nextInt(9);
            
            System.out.println("ans="+ans);
            if(num == ans){
                System.out.println("correct!!");
                break;
            }
        }
        System.out.println("finish the game")
    }
}