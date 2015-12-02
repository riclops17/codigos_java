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
public class coloquiorecursadorpa {
    public static void main(String[] args) {
        //
        String a;
        int op, i, j;
        char res;
        do {
            System.out.println("ingrese un cadena");
            a = TecladoIn.readLine();
            System.out.println("desea ingresar otra cadena s/n");
            res = TecladoIn.readLineNonwhiteChar();

        } while (res != 'n');
        do {
            menu();
            op = TecladoIn.readLineInt();
            opcion(op,a);   
        } while (op != 7);
    }
    
     public static void menu() {
        System.out.println("1:mostrar la primera letra");
        System.out.println("2:mostrar los dos ultimos caracteres ");
        System.out.println("3:mostar la longitud de la cadena");
        System.out.println("4:ingresar otra cadena y compararla");
        System.out.println("5:buscar segun posicion");
        System.out.println("6:buscar una subcadena segun una posicion inicial y final");
        System.out.println("7:salir");
    }
    public static void opcion(int op,String a){
        int i , j;
        switch (op) {
                case 1:
                    System.out.println("la palabra empieza con la letra " + a.charAt(0));
                    break;
                case 2:
                    if (a.length() == 0 || a.length() == 1) {
                        System.out.println(a);
                    } else {
                        int c = a.length() - 2;
                        System.out.println("los ultimos 2 caracteres son " + a.substring(c));
                    }
                    break;
                case 3:
                    System.out.println("la longitud de la cadena se " + a.length());
                    break;
                case 4:
                    String cad2;
                    System.out.println("ingrese otra cadena para comparar");
                    cad2 = TecladoIn.readLine();
                    if (a.length() > cad2.length()) {
                        System.out.println("la cadena es  mayor que la segunda");
                    } else {
                        if (a.equalsIgnoreCase(cad2)) {
                            System.out.println("las cadenas son iguales");
                        } else {
                            System.out.println("la cadena es menor q la segunda");
                        }
                    }
                    break;
                case 5: System.out.println("ingrese una posicion");
                         i= TecladoIn.readLineInt();
                         if( i>= 0 && i<= a.length()-1){
                           System.out.println(" la letra en esa posicion es "+a.charAt(i));
                         }else{
                             System.out.println(" la posicion es incorrecta");
                         }
                        break;
                case 6: System.out.println("ingrese una posicion de inicio");
                        i= TecladoIn.readLineInt();
                        System.out.println("ingrese una posicion de fin");
                        j = TecladoIn.readLineInt();
                        System.out.println("la subcadena de la posiciones dadas es"+a.substring(i, j));
                        break;
                case 7: 
                    break;
                default: System.out.println("error ,ingrese nuevamente");
            }           
    }

}
