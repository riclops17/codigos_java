/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;
import utiles.TecladoIn;
/**
 *
 * @author riclops
 */
public class ejercicio6 {
      public static void invertir(char t){
        char l;
        
        String carac;
        carac = "";
          System.out.println("ingrese un caracter");
          l = TecladoIn.readLineNonwhiteChar();
          if (l != '.'){
              if ( l == t){
                  invertir (t);
                  
                 
              }
              else{
                  invertir(t);
                  carac = carac + l;
                  
              }
          }
          System.out.print(carac);
}
      public static void main(String[] args) {
          char t;
          System.out.println("ingrese  un caracter diferente");
          t = TecladoIn.readLineNonwhiteChar();
          invertir(t);
    }
}