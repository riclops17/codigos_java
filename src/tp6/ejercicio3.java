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
public class ejercicio3 {
    
public static void burbuja(int []a) {
    //
    int i, j, x;

    for (i = 0; i <= a.length-2; i++) {
        for (j = 0; j <= a.length-2-i; j++) {
            if (a[j +1] > a[j]) {
                x = a[j];
                a[j] = a[j+1];
                a [j+1] = x;
            }
        }
    }
}
    public static void selectionSort(int[] a) {
    //
    int i, j, min, x;

    for (i = 0; i < a.length-1; i++) {
        min = i;

        for (j  = i+1; j < a.length; j++) {
            if (a[j] >= a[min]) {
                min = j;
            }
        }
            
        x = a[min];
        a[min] = a[i];
        a[i] = x;
    }
}
    public static void insertionSort(int []a) {
    //
    int p , j , temp;

    for (p = 1; p <= a.length-1; p++) {
        temp = a[p];
        j = p;

        while ( (j>0) && (temp>a[j-1]) ) {
            a[j] = a[j-1];
            j = j-1;
        }

        a[j] = temp;
    }
}
    

    public static void main(String[] args) {
        int a[]={1,2,3,4};
         insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
}
}

