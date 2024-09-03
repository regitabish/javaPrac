public class prac3_5{
    public static void main(String[] args){
        System.out.print("1:search 2:create 3:delete 4:update >");
        int selected = Integer.parseInt( new java.util.Scanner(System.in).nextLine() );

        switch(selected){
            case 1: 
                System.out.println("searching");
                break;
            case 2:
                System.out.println("creating");
                break;
            case 3:
                System.out.println("deleting");
                break;
            case 4:
                System.out.println("updating");
                break;
        }

    }
}