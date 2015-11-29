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
public class ejercicio1csimulacro {
    public static int signo(int a,int b , char x){
        int res;
        res = 0;
        switch (x){
            case '+': res = a + b;
                break;
            case '-': res = a- b;
                break;
            case '*': res = a * b;
                break;
            case '/': res = a / b;
                break;
                
        }
        return res;
    }
    public static void main(String[] args) {
        //
        int num1 , num2,cants,cantr,cantp,cantd;
        char op,respuesta;
        cants = 0;
        cantr = 0;
        cantp = 0;
        cantd = 0;
        do{
            System.out.println("escribir el primer numero y el segundo que desea operar");
            num1 = TecladoIn.readLineInt();
            num2 = TecladoIn.readLineInt();
            System.out.println("ingrese la opercion que desea realizar");
            op = TecladoIn.readLineNonwhiteChar();
            switch (op){
                case '+': System.out.println("la respuesta es "+signo(num1,num2,op));
                    cants++;
                    break;
                case '-': System.out.println("la respuestas es " +signo(num1,num2,op));
                       cantr++;
                    break;
                case '*': System.out.println("la respues es "+signo(num1,num2,op));
                    cantp++;
                case '/': System.out.println("la respuesta es "+signo(num1,num2,op));
                        cantd++;
                
                    break;
                default: System.out.println("error");
                        
            }
            System.out.println("desea seguir s/n");
            respuesta= TecladoIn.readLineNonwhiteChar();
            
        }while(respuesta != 'n');
        System.out.println("la cantidad de veces de la operacion sumas es "+cants);
        System.out.println("la cantidad de veces de la operacion resta es "+cantr);
        System.out.println("la cantidad de veces de la operacion multiplicacion es "+cantp);
        System.out.println("la cantidad de veces de la opercion divicion entera es"+cantd);
    }
}
