/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

/**
 *
 * @author riclops
 */
public class ejercicio3 {
    public static int cantdig(int n){
        if (n<=9){
            return 1;
        }else {
            return 1 + cantdig(n/10);
        }
    }
    public static int buscarDig(int n,int t ){
       
        int dig ;
        //System.out.println(n);
        if (n<10){
            if (n == t){
                dig = 1;
            }else {
                dig = 0;
            }
        }else{
            
        
        
        
         if (n%10== t){
            
            dig = 1 + buscarDig(n/10,t);
            
        }else {
             dig = buscarDig(n/10,t);
         }
        }
       
       return dig;
    }
    public static void main(String[] args) {
        int num = 32154;
        int m = 13234;
        int t = 3;
        //System.out.println("la cantidad de digitos es "+cantdig(num));
        System.out.println("la cantidad de apariciones del digito es" +buscarDig(m,t));
    }
}
