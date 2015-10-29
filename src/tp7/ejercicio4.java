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
public class ejercicio4 {
    static boolean buscador(int n,int []v,int i){
        boolean res ;
        res = true;
        
        
        if (i < 0){
            res = false;
        }else{
            res = (n == v[i]|| buscador( n,v,i-1));
        
            
        }
        return res;
    }
    public static void main(String[] args) {
        //
        int n, i;
        int a[]={12,7,0,-1,8,10};
        i = a.length-1;
        if (buscador(8,a,i)){
            System.out.println("el numero se encuentra");
        }else{
            System.out.println("el numero no se encuentra");
        }

    }
}
    
