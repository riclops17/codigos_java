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
public class prueba {
    public static int cantidad(String a,int i){
        int dig;
        if (i<0){
            dig = 0;
        }else{
            if(a.charAt(i)== '0'){
                dig = 1 + cantidad(a,i-1);
            }else{
                dig = cantidad ( a,i-1);
            }
        }
        return dig;
    }
    public static int cantd(int []a,int i){
        int dig1;
        if(i<0){
            dig1= 0;
        }else{
            if(a[i]== 0){
                dig1 = 1 +cantd(a,i-1);
            }else{
                dig1 = cantd(a,i-1);
            }
        }return dig1;
    }
    public static void main(String[] args) {
        //String a;
        //a = "ab0d0f";
        int a[]={0,0,0,0,0,0};
        int i = a.length-1;
        System.out.println("la cantidada de ceros es"+cantd(a,i));
        //System.out.println("la cantidad de ceros es "+cantidad(a,a.length()-1));
    }
}
