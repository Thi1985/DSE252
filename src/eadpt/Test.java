
package eadpt;
import java.util.*;
@FunctionalInterface
interface A{
int m(int a, int b);//abstract method

}

public class Test { 
    public static void main(String[] args) {
      A ob1=(x,y)->{return x+y;};
      int result=ob1.m(100,200);
        System.out.println(result);
    }
}
