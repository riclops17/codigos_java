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
public class ejercicio5 {
    public static int multiplo4(int n){
        int cant;
        cant = 0;
        if (n>0){
            if(n%4== 0){
                cant = 1 + multiplo4(n/10);
            }else{
                cant = multiplo4(n/10);
            }
        }
    return cant;
    }
    public static void main(String[] args) {
        //
        int num,x;
        num =25361230;
        x = multiplo4(num);
        System.out.println("la cantidad de multiplos de 4 es "+x);
    }
}