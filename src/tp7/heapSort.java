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
public class heapSort {
        

    public static void sort(int a[],int n){
      int i,aux;
      
        armarHeapMaximo(a,n);        
        for ( i = n; i > 0; i--){ 
          
            aux = a[0];
            a[0] = a[i];
            a[i] = aux;
            n = n-1;

            siftUp(a, 0,n);
        }

    }     

    public static void armarHeapMaximo(int a[],int n){
    int i;
        for ( i = n/2; i >= 0; i--){

            siftUp(a, i,n);   
        }  

    }      

    public static void siftUp(int a[], int i,int n){
    //
    
        int temp,izq,der,padre;
        izq = 2*i ;

        der = 2*i + 1;

        padre = i;

        if (izq <= n && a[izq] > a[i]){

            padre = izq;
        }

        if (der <= n && a[der] > a[padre]){        

            padre = der;
        }

        if (padre!= i){
           
            temp = a[i];
            a[i]= a[padre];
            a[padre]= temp;
            siftUp(a, padre,n);
        }

    }    

   public static void main(String[] args) {
        int []a1={9,5,4,1,3,2,20,6,8,50};
        sort(a1,a1.length-1);
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i] + " ");
        }
    }     
}
