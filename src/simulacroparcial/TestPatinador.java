/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacroparcial;
import utiles.TecladoIn;
/**
 *
 * @author riclops
 */
public class TestPatinador {
    
    public static void main(String [] args){
        int op,i;
        op = 0;
        System.out.println("Ingrese la cantidad de los patinadores");
        int cant = TecladoIn.readLineInt();
        Patinador [] arrpat = new Patinador [cant];
        while ( op != 4){
            System.out.println("1:Cargar datos de los patinadores");
            System.out.println("2: mostrar datos de patinadores segun categoria");
            System.out.println("3:Cambiar categoria segun Dni");
            System.out.println("4:Salir");
            op = TecladoIn.readLineInt();
            switch (op){
                case 1 : for ( i = 0; i< arrpat.length;i++){
                    arrpat [i]= cargarDatos();
                }
                    System.out.println("datos de los patinadores");
                    for ( i = 0; i< arrpat.length;i++){
                        System.out.println(arrpat.toString());
                    }
                break;
                case 2 :System.out.println("ingrese la categoria del patinador");
                    char categ = TecladoIn.readLineNonwhiteChar();
                    for ( i = 0; i< arrpat.length;i++){
                        if (categ == arrpat[i].getCategoria()){
                            System.out.println(arrpat[i].toString());
                        }
                
                    
            }
        }
    }
    }
public static Patinador cargarDatos(){
    Patinador p = new Patinador();
            System.out.println("nombre del patinador");
            String nom = TecladoIn.readLine();
            System.out.println("apellido del patinador");
            String sur = TecladoIn.readLine();
            System.out.println("dni del patinador");
            String doc = TecladoIn.readLine();
            System.out.println("edad del patinador ");
            int age = TecladoIn.readLineInt();
            System.out.println("categoria");
            char cat = TecladoIn.readLineNonwhiteChar();
            p.setApellido(sur);
            p.setNombre(nom);
            p.setEdad(age);
            p.setCategoria(cat);
            return p;
}

}

    