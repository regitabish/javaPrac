public class prac4_4{
    static public void main(String[] args){
        int[] numbers = {3,4,9};
        System.out.print("input a number>");
        int input = new java.util.Scanner(System.in).nextInt();

        for(int value:numbers){
            if(input == value){
                System.out.println("atari");
            }
        }

    }
}