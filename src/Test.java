interface A{
    int x=100;
    void m();
}



public abstract class Test {
    abstract void fun();
         
}
class Drive extends Test{
    
    void fun(){
        System.out.println("Hello Abstract");
    } 
    public static void main(String[] args) {
        Test t=new Drive();
        t.fun();
    }
}
