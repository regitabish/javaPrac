public class prac5_2{
    public static void main(String[] args){
        email("タイトル例","aaaa@testmail.com","本文の内容");
    }

    public static void email(String title,String address, String text){
        System.out.println(address+"に以下の内容のメールを送信しました");
        System.out.println("件名: "+ title);
        System.out.println("本文: "+ text);
    }
}