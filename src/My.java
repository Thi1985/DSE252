
public class My extends Thread {
    public static void main(String[] args) {
        My t1=new My();
        My t2=new My();
        t1.start();
        t2.start();
        System.out.println(t1.getPriority());
        System.out.println(t1.getPriority());
    }
    public void run(){
        System.out.println("Hello");
    }
}
