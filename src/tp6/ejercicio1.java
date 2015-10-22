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
public class ejercicio1 {
    public static  void burbuja(int []a) {
    //
    int i, j, x;

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
    public static boolean verificaOrd(int []b){
    //
     boolean res = true;
     int i=1;
     int x;
     x= b[0];
     while ((i<b.length)&&(res)){
     
     if(x<= b[i]){
         i++;
     }
     else{
         res=false;
     }
     
     
     }    
         
             
     
     return res;
     
     
     
        
    }
    public static void main(String[] args) {
       //
        int a[]={2,1,3,4};
        if (verificaOrd(a)){
            System.out.println("estan en ordenados");
        }else{
            System.out.println("estan desordenados");
        }
    }
    
}

    
    
    

