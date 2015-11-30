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
public class ejercicio3simulacro {
    public static boolean esDivisible(int x, int y){
        boolean res;
        res = true;
        if(x%y== 0){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
    public static int divisoresPropios(int n){
        int i,sum;
        sum = 0;
        for(i=1 ; i<n;i++){
            if(esDivisible(n,i)){
                sum = sum +i;
            }
        }
        return sum;
        
    }
    public static void main(String[] args) {
        //
        int num,cant, sum;
        cant= 0;
        sum =0;
        System.out.println("ingrese un numero");
        num = TecladoIn.readLineInt();
        do{
            System.out.println("la sumatoria de los divisores propios de ese numero son"+divisoresPropios(num));
            cant++;
            sum = sum+divisoresPropios(num);
            System.out.println("ingrese otro numero distinto de 0 para continuar");
            num = TecladoIn.readLineInt();
        }while(num!=0);
        System.out.println("la cantidad de numeros procesados son "+cant);
        System.out.println("la sumatoria de todos lso divisores positivos de los numeros son "+sum);
    }
}
