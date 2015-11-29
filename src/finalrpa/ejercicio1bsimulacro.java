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
public class ejercicio1bsimulacro {
   public static boolean esMultiplo(int a,int b,int x){
       boolean res;
       res = true;
       if((a%x == 0) && (b%x == 0) ){
           res = true;
       }else{
           res = false;
       }
       return res;
   }
    public static void main(String[] args) {
        
        int x1,x2,num,sum,cantm,maxnum,cant,promedio;
        
        cant = 0;
        sum= 0;
        cantm = 0;
        maxnum= 0;
        System.out.println("ingrese 2 numeros");
        x1 = TecladoIn.readLineInt();
        x2 = TecladoIn.readLineInt();
        System.out.println("ingrese un numero entero o un 0 para finalizar");
        num = TecladoIn.readLineInt();
        while(num != 0){
            if(esMultiplo(x1,x2,num)){
                System.out.println("es multiplo");
                cantm++;
                sum = sum+ num;
                
            }else{
                System.out.println("no es multiplo");
            }
            if(num>maxnum){
                maxnum = num;
            }
            
            cant++;
            System.out.println("ingrese otro num");
            num = TecladoIn.readLineInt();
        }
       // promedio = ((sum/cantm)*(0,1));
        System.out.println("la cantidad de num es"+cant);
        System.out.println("la suma de los multiplos es"+sum);
        System.out.println("la cantidad de multiplos es"+cantm);
        System.out.println("el mayor numero ingresado por el usuario es"+maxnum);
        //System.out.println("el promedio es ");
    }
}
