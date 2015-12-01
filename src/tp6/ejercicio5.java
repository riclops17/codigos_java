/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author riclops
 */
public class ejercicio5 {
    
public static void burbujaMejorado(int []a) {
    //
    int i, j, x;
    boolean parar;
    parar = true;
    for (i = 0; i <= a.length-2; i++) {
        for (j = 0; j <= a.length-2-i; j++) {
            if (a[j +1] < a[j]) {
                x = a[j];
                a[j] = a[j+1];
                a [j+1] = x;
            }
        }
    }
    
}
}

