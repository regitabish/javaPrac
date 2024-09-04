public class prac5_3{
    public static void main(String[] args){
        email("no titile",args[0],args[1]);
    }

    public static void email(String title,String address, String text){
        System.out.println(address+"に以下の内容のメールを送信しました");
        System.out.println("件名: "+ title);
        System.out.println("本文: "+ text);
    }
}