package kohanpackage;
public  class kohan{
    public static void callDeae(){
        System.out.println("deae");
    }
    public static void showMondokoro(){
        System.out.println("Mondokoro");
        try {
            Thread.sleep(3000); // 3秒間だけ処理を止める
        } catch (InterruptedException e) {
        }
        zenhanpacage.zenhan.doTogame();
    }
}