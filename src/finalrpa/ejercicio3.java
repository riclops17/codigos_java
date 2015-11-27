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
public class ejercicio3 {
    public static void main(String[] args) {
       int cantA, cantP,peso,cant,acum,res;
       boolean parar;
       cantA = 0;
       cantP= 0;
       peso = 0;
       cant = 1;
       acum = 0;
       res = 0;
       parar = false;
        System.out.println("ingrese la cantidad de vehiculos");
        cantA = TecladoIn.readLineInt();
        while ( cant <= cantA && !parar){
            System.out.println("ingrese la cantidad de personas");
            cantP = TecladoIn.readLineInt();
            System.out.println("ingrese el peso del vehiculo");
            peso = TecladoIn.readLineInt();
            if(acum < 100000 || res <= 150){
                acum = acum + peso;
                res = res + cantP;
                cant++;
            }else{
                
                parar = true;
            }
            
        }
        System.out.println("no se pueden aceptar mas pasajeros");
    }
}
