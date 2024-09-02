public class prac2_2{
    public static void main(String[] args){
        System.out.print("ようこそ占い館へ\nあなたの名前を入力してください>");
        String name;
        name = new java.util.Scanner(System.in).nextLine();
        System.out.print("\nあなたの年齢を入力してください>");
        String ageString;
        ageString = new java.util.Scanner(System.in).nextLine();
        int age;
        age = Integer.parseInt(ageString);

        int r = new java.util.Random().nextInt(4);

        System.out.println("占いの結果が出ました");
        System.out.println(age+"歳の"+name +"さん、あなたの運勢は"+r+"です");
        System.out.println("(1:大吉 2:中吉 3:吉 4:凶)");
    }
}