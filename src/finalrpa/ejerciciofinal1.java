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
public class ejerciciofinal1 {
    public static int multiplicar (int m,int n){
        int i,res;
        res = 0;
        for(i= 1;i<= n;i++){
            res = res + m;
        }
        return res;
    }
    public static int potencia (int x,int y){
        int i , res ;
        res = 0;
        for (i=1;i<y;i++){
            res = res + multiplicar(x,x);
        }
        return res;
       
    }
    public static void main(String[] args) {
        //
        
        System.out.println(multiplicar(2,3));
        System.out.println(potencia(2,3));
    }
}
