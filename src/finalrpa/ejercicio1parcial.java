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
public class ejercicio1parcial {
    public static void main(String[] args) {
        int p;
        p=0;
        do{
            piramide(p);
            p++;
            System.out.println("");
        }while(p<=5);
    }
    public static int potencia(int m ,int n){
        int i,res;
        res = 1;
        for (i = 1;i <= n;i++){
            res = res * m;
        }
        return res;
    }
    public static void piramide(int n){
        int i , j;
        for ( i= 1 ; i<= n;i++){
            for (j=n; j>=(n-i)+1;j--){
                
                System.out.print(potencia(i,j));
            }
        System.out.println();}
    }
}

