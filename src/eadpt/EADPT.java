/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eadpt;
//practical 4: arrays as parameters
import java.util.Arrays;
public class EADPT {
    public static void main(String[] args) {
        
        maximum(1,8,4);
        maximum(1.2,4.5,7.8);
        maximum("Hello","Cat","Net");
    } 
    public static <T extends Comparable<T>> void maximum(T x, T y, T z){
    T max;
        max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        System.out.println(max);
    }
}


