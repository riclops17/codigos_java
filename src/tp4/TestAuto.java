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
        Auto []a = new Auto [2];
        while (op!=6){
            System.out.println("1:ingresar un auto");
            System.out.println("2 consultar por un auto");
            System.out.println("3:alquilar por modelo");
            System.out.println("4:devolucion de un auto");
            System.out.println("5:mostrar autos disponibles");
            System.out.println("6:salir");
            System.out.println("");
            op = TecladoIn.readLineInt();
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
                        if (patente.equalsIgnoreCase(a[i].getPatente()) ){
                            System.out.println(a[i].toString());
                        }
                 
                 }
            break;
            case 3:System.out.println("ingrese el modelo que quiere alquilar");
                String modelo = TecladoIn.readLine();
                i= 0;
                boolean parar;
                parar = true;
                while(i<a.length && parar){
                    if (modelo.equalsIgnoreCase(a[i].getModelo()) && a[i].getDisponible()){
                        parar = false;
                    
                      a[i].setDisponible(false);
                        System.out.println("su transaccion es correcta");
                }else{
                        System.out.println("no contamos con autos disponibles");
                    }
        i++;}break;
            case 4 :  System.out.println("ingrese la patente  para realizar la devolucion del auto");
                       String patente2 = TecladoIn.readLine();
                       System.out.println("ingrese el valor de la cuenta");
                       int cuenta2 = TecladoIn.readLineInt();
                       for(i = 0; i<a.length;i++){
                           if (patente2.equalsIgnoreCase(a[i].getPatente())){
                               a[i].setDisponible(true);
                               a[i].setCuentaKm(cuenta2);
                           }
                       }break;
            case 5: for ( i= 0; i<a.length;i++){
                   if(a[i].getDisponible()){
                       System.out.println(a[i].toString());
                       
                   }
            } break;
            
                   
            
           
               
               
    
            }
        }
    }

    public static Auto cargarDatos(){
       
        System.out.println("ingrese su patente");
        String pat = TecladoIn.readLine();
        System.out.println("ingrese la cuenta de km");
        int cuenta = TecladoIn.readLineInt();
        System.out.println("ingrese el modelo");
        String mod = TecladoIn.readLine();
        System.out.println("ingrese si se encuentra disponible true/false");
        boolean dis = TecladoIn.readLineBoolean();
         Auto u = new Auto(pat,cuenta,mod,dis);
        u.getCuentaKm();
        u.getDisponible();
        u.getModelo();
        u.getPatente();
        return u;
        
    }
}

    


    
    
    
    
    
  
   

