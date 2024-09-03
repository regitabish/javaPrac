public class prac3_3{
    public static void main(String[] args){
        boolean isHungry = true;
        String food = "curry";

        System.out.println("こんにちは");

        if(!isHungry){
            System.out.println("i am full");
        }else{
            System.out.println("i am hungry");
            System.out.println(food+"をたべます");
        }

    }
}