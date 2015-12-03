/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalrpa;

/**
 *
 * @author riclops
 */
public class piramides {
    public static void piramide1(int n){
        int i ,j;
        for (i= 1 ; i<= n;i++){
            for(j=1;j<=i;j++){
                
                System.out.print(i);
            
            
        }System.out.println();
    }
    }
    public static void piramideInvertida(int n){
        int i,j,k,l;
       for(i=n ; i>= 1;i--){
           if(i%2 == 0){
               for(k= i; k>=1 ;k--){
                   System.out.print(k);
               }
           }else{
               for(k=1;k<= i;k++){
                   System.out.print(k);
               }
           }
           System.out.println("");
           
       }
    }
    public static void piramider(int n){
        int i, j;
        for(i=1;i<= n;i++){
            for(j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void piramidea(int n){
        int i , j;
        for(i=1;i<=n;i++){
            for(j=1;j<= i;j++){
                System.out.print(j);
                
            }
        
        System.out.println("");
        }
    }
    public static void piramideb(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    public static void piramidec(int n){
        int i , j;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void piramided(int n){
        int i , j;
        for(i=1 ;i<= n;i++){
            for(j=n;j>=n-i+1;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        //piramideInvertida(4);
        //practica de casting de tipo
        double res;
        int b;
        int a = 23;
        res = 23.8;
        b = (int) res;
        System.out.println(b);
    }
}
