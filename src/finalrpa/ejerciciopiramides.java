/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalrpa;

/**
 *
 * @author riclops
 */
public class ejerciciopiramides {
    public static void piramide (int n){
        int i,j;
        for(i = 1;i<= n;i++){
            for (j=1 ; j<= i;j++){
                if( j % 2== 0){
                System.out.print(transforma(j));
            }else{
                    System.out.print(j);
                }
           
        } System.out.println("");
    }
    }
    public static char transforma(int i){
        char res;
        res = 0;
        switch (i){
            case 2: res = 'B';
                break;
            case 4: res = 'D';
                break;
            case 6: res = 'f';
                break;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 1;
        do{
        piramide(n);
        System.out.println("");
        n++;
    }while (n>= 1 && n<= 7);
}
}