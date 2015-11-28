/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalrpa;

import utiles.TecladoIn;

/**
 *
 * @author riclops
 */
public class ejercicio2parcial {
    public static void main(String[] args) {
        int cantn , num, cantp,cantnp;
        cantn= 0;
       
        cantp = 0;
        cantnp= 0;
         System.out.println("ingrese un numero distinto de 0");
            num = TecladoIn.readLineInt();
        while(num !=0){
           
            if(  primo(num)){
                System.out.println("es un numero primo");
                cantp++;
            }else{
                System.out.println("no es un numero primo");
                cantnp++;
            }
            cantn++;
            System.out.println("ingrese otro numero");
            num = TecladoIn.readLineInt();
        }
        System.out.println("la cantidad de numeros procesados son "+cantn);
        System.out.println("la cantidad de numeros primos son "+cantp);
        System.out.println("la cantidad de numeros no primos son "+cantnp);
    }
    public static boolean esDivisible(int x,int y){
        return ((x % y )== 0);
    }
    public static boolean primo(int n){
        int i;
        i = 2;
        boolean res,parar;
        res = true;
        parar = false;
        while(i<n && !parar){
            if(esDivisible(n,i)){
                parar = true;
                res = false;
            }else{
                i++;
                res = true;
            }
        }
        return res;
    }
}
