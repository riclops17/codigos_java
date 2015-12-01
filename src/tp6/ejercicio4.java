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
        int i , k= 0;
        i= 0;
        boolean menor;
        for(int j=0;j<cantA;j++){
            
            menor  = true;
            while (k < cantB && menor){
                if (a[k]<=b[j]){
                    c[i]=a[k];
                    if(k<cantA-1){
                        k++;
                    }
                    i++;
                    
                }else{
                    c[i]= b[j];
                    menor = false;
                    i++;
                }
            }
        }
        
        return c;
        
    }
    public static void main(String[] args) {
        //
        int a[]={2,5,8,9};
        int b[]={3,6,7};
        int[] c = new int [7];
       // c = sumOrd(a,b);
        if(esCreciente(a,a.length)){
            System.out.println("es creciente");
            
        }else{
            System.out.println("no es creciente");
        }
       // for (int i = 0; i < c.length; i++) {
           // System.out.print(c[i] + " ");
       // }

        //System.out.println();
    }
    
}
