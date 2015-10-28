/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

/**
 *
 * @author riclops
 */
public class ejercicio3 {
    public static int cantdig(int n){
        if (n<=9){
            return 1;
        }else {
            return 1 + cantdig(n/10);
        }
    }
    public static void main(String[] args) {
        int num = 32154;
        System.out.println("la cantidad de digitos es "+cantdig(num));
    }
}
