/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import utiles.TecladoIn;

/**
 *
 * @author riclops
 */
public class TestAuto {
    public static void main(String[] args) {
        int op,i;
        op = 0;
        Auto []a = new Auto [10];
        while (op!=6){
            System.out.println("1:ingresar un auto");
            System.out.println("2 consultar por un auto");
            System.out.println("3:alquilar por modelo");
            System.out.println("4:devolucion de un auto");
            System.out.println("5:mostrar autos disponibles");
            System.out.println("6:salir");
            System.out.println("");
            switch(op){
            case 1: for(i = 0; i< a.length ; i++){
                a[i]= cargarDatos();
            }
                System.out.println("los datos de los autos son");
                for(i = 0 ;i<a.length;i++){
                    System.out.println(a[i].toString());
                }
            break;
            case 2:System.out.println("ingrese la patente del auto que desea consultar");
                    String patente = TecladoIn.readLine();
                    for ( i = 0; i< a.length;i++){
                        if (patente == a[i].getPatente()){
                            System.out.println(a[i].toString());
                        }
                 
                 }
            break;
            case 3:
        }
    }
    }
    public static Auto cargarDatos(){
        Auto u = new Auto();
        System.out.println("ingrese su patente");
        String pat = TecladoIn.readLine();
        System.out.println("ingrese la cuenta de km");
        int cuenta = TecladoIn.readLineInt();
        System.out.println("ingrese el modelo");
        String mod = TecladoIn.readLine();
        System.out.println("ingrese si se encuentra disponible true/false");
        boolean dis = TecladoIn.readLineBoolean();
        u.getCuentaKm();
        u.getDisponible();
        u.getModelo();
        u.getPatente();
        return u;
        
    }
}

    


    
    
    
    
    
  
   

