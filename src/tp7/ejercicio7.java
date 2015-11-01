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
public class ejercicio7 {
    public static boolean busquedaBinaria(int[] a,int prim,int ult,int valor){
        boolean res;
        int medio = (prim + ult)/2;
        if(prim > ult){
            res = false;
        }else{
            if(a[medio]== valor){
                res = true;
            }else{
                if (a [medio]< valor){
                    res = busquedaBinaria(a,medio+1,ult,valor);
                }else{
                    res = busquedaBinaria(a,prim ,medio-1,valor);
                }
            }
        }
        return res;
    }
    public static void quickSort(int a[],int izq,int der){
        int pivote = a[izq];// tomamos primer elemento como pivote
        int i = izq;//realiza la busqueda de izquierda a derecha
        int j = der;// realiza la busqueda de derecha a izquierda
        int aux;
        while (i<j){ //para q no se crucen las busqudas
            while(a[i]<=pivote && i<j){//busca elemento mayor
                i++;
            }
            while (a[j]> pivote){//busca el menor 
                j--;
            }
            if(i<j){//intercambio
                aux = a[i];
                a[i]= a[j];
                a[j]= aux;
            }
        }
        a[izq]= a[j];
        a[j]= pivote; //los menores a su izquierda y los mayores a su derecha
        if(izq < j-1){//ordenamos el subarreglo izquierda
            quickSort(a,izq,j-1);
        }
        if(j+1 < der){// ordenamos el subarreglo derecho
            quickSort(a,j+1,der); 
        }
    }
    public static void main(String[] args) {
        //
        int [] a={4,45,1,3,5,2};
        quickSort(a,0,a.length-1);
         for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        }

    }

