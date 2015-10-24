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
public class ejercicio4 {
    public static int [] sumOrd(int[]a,int[]b){
        int[] c= new int[a.length + b.length];
        int cantA = a.length;
        int cantB = b.length;
        int i , k;
        i= 0;
        boolean menor = true;
        for(int j=0;j<cantA;j++){
            k=0;
            menor  = true;
            while (k < cantB && menor){
                if (a[k]<=b[j]){
                    c[i]=a[k];
                    k++;
                    i++;
                }else{
                    c[i]= b[i];
                    menor = false;
                    i++;
                }
            }
        }
        
        return c;
        
    }
    public static void main(String[] args) {
        //
        int a[]={1,2,3,4};
        int b[]={5,6,7};
        sumOrd(a,b);
        for (int i = 0; i < sumOrd(a,b).length; i++) {
            System.out.print(sumOrd(a,b)[i] + " ");
        }

        System.out.println();
    }
    
}
