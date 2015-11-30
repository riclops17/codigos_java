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
public class ejerciciomatriz {
    public static void matriz(int n){
        int i , j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i<j){
                    System.out.print(transforma(j));
                }else{
                    System.out.print(j);
                }
               
            }
        System.out.println();}
    }
    public static char transforma(int i){
        char res;
        res = 0;
        switch (i){
            case 1: res = 'A';
                break;
            case 2: res = 'B';
                break;
            case 3: res = 'C';
                break;
            case 4: res = 'D';
                 break;
            case 5: res = 'E';
                break;
        }
        return res;
    }
    public static void main(String[] args) {
        matriz(4);
    }
}
