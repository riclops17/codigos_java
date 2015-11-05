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
    public static boolean esCreciente(int[] a,int i){
        boolean orden;
        if (i<=0){
            orden = true;
        }else{
            if(a[i]> a[i-1]){
                orden = esCreciente(a,i-1);
                
            }else {
                orden = false;
            }
        }
        return orden;
    }
    public static void main(String[] args) {
        //
        int n, i;
        int a[]={1,2,4,6,8,10};
        i = a.length-1;
        if (buscador(8,a,i)){
            System.out.println("el numero se encuentra");
        }else{
            System.out.println("el numero no se encuentra");
        }
        if(esCreciente(a,a.length-1)){
            System.out.println("es creciente");
        }else{
            System.out.println("no es creciente");
        }

    }
}
    
