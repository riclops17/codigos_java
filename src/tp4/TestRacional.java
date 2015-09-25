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
public class TestRacional {
    public static void menu(){
        System.out.println("");
        System.out.println("1:cargar un numero racional  ");  
        System.out.println("2:mostrar el numero racional ");
        System.out.println("3: ingresar otro numero racional y sumarlo");
        System.out.println("4: ingresar otro numero racional y restarlo");
        System.out.println("5: ingresar otro numero racional y multiplicarlo ");
        System.out.println("6: ingresar otro numero racional y dividirlo ");
        System.out.println("7: simplificar el numero racional dado");
        System.out.println("8: salir");
    }
    public static void main(String[] args) {
        //
        int op;
        op = 0;
        Racional r1 = new Racional ();
        Racional r2 = new Racional ();
        while (op!=8){
            menu();
            op = TecladoIn.readLineInt();
            switch (op){
                case 1 : System.out.println("ingrese el denominador ");
                    int de = TecladoIn.readLineInt();
                    System.out.println("ingrese el numerador ");
                    int nu = TecladoIn.readLineInt();
                    r1.setDenominador(de);
                    r1.setNumerador(nu); 
                    
                    break;
                case 2: System.out.println(" el numero racional ingresado es "+r1.aMostrar());
                    break;
                case 3: System.out.println("ingrese el denominador del nuevo numero");
                    int de1 = TecladoIn.readLineInt();
                    System.out.println(" ingrese el numerador del nuevo numero");
                    int nu1 = TecladoIn.readLineInt();
                    r2.setDenominador(de1);
                    r2.setNumerador(nu1);
                    r1 = r1.suma(r2);
                    System.out.println("resultado:"+r1.aMostrar());
                    break;
                case 4:System.out.println("ingrese el denominador del nuevo numero");
                    int de2 = TecladoIn.readLineInt();
                    System.out.println(" ingrese el numerador del nuevo numero");
                    int nu2 = TecladoIn.readLineInt();
                    r2.setDenominador(de2);
                    r2.setNumerador(nu2);
                    r1 =r1.resta(r2);
                    System.out.println("resultado :"+r1.aMostrar());
                    break;
                case 5 : System.out.println("ingrese el denominador del nuevo numero");
                    int de4 = TecladoIn.readLineInt();
                    System.out.println(" ingrese el numerador del nuevo numero");
                    int nu4 = TecladoIn.readLineInt();
                    r2.setDenominador(de4);
                    r2.setNumerador(nu4);
                    r1 =r1.multiplicar(r2);
                    System.out.println("resultado :"+r1.aMostrar());
                    break;
                case 6 : System.out.println("ingrese el denominador del nuevo numero");
                    int de5 = TecladoIn.readLineInt();
                    System.out.println(" ingrese el numerador del nuevo numero");
                    int nu5 = TecladoIn.readLineInt();
                    r2.setDenominador(de5);
                    r2.setNumerador(nu5);
                    r1 = r1.dividir(r2);
                    System.out.println("resultado =" +r1.aMostrar());
                    break;
                case 7 : r1.simplificar(); break;
                    
                  
                
                
            }
        }
    }
}

