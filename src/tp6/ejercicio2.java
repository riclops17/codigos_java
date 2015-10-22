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
public class ejercicio2 {
     public static boolean verificarElementos(int[] arreglo, int n) {
        //
        int i;
        i = 0;
        boolean res = false;
        while (i < arreglo.length && !res) {

            if (n == arreglo[i]) {
                res = true;

            }
            i++;
        }
        return res;

    }
     public static int binarySearch(int []a,int k) {
    //
    int l,m,r,res;
    m = 0;
    l =0;
    r = a.length-1;
    res = -1;

    while ((l<=r )&&(k != a [m])) {
        m = (l + r )/2;
        if (k == a [m]) {
            res = m;
        } else {
            if (k< a [m]) {
                r = m -1;
            } else {
                l = m + 1;
            }
        }
    }

    return res;
}
     public static void main(String[] args) {
        int a[]={1,2,3,4};
        int x = 5;
        int y = 0;
         y= binarySearch(a,x);
         if ( y == -1){
             System.out.println("no se encuentra el elemento");
         }else
         {
             System.out.println("se encuentra el elemento");
         }
        
    }
}
