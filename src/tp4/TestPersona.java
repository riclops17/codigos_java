/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import utiles.Aleatorio;
import utiles.TecladoIn;

/**
 *
 * @author riclops
 */
public class TestPersona {

    public static void main(String[] args) {
        int  op;
        
       
        Persona[] a = new Persona[2];
       

        do {
            menu();
            op = TecladoIn.readInt();
            switch (op) {
                case 1:
                    cargar(a);
                    break;
                case 2:System.out.println("los datos de las personas son:");
                       mostrarPersona(a);
                    break;
                case 3:System.out.println("ingrese el nombre de la persona que desea consultar");
                    String nomb = TecladoIn.readLine();
                    consultar (a,nomb);
                    break;
                case 4:insertion(a);
                    break;
                case 5 :selection(a);
                    break;
                case 6:burbuja(a);
                    break;
                case 7: System.out.println("ingrese el tipo");
                        int ti = TecladoIn.readLineInt();
                        System.out.println("ingrese el dni");
                        long doct = TecladoIn.readLineLong();
                        Cuitcuil c;
                        c = new Cuitcuil (ti,doct);
                        if (secuencia(a,c)!= -1){
                        System.out.println(a[+secuencia(a,c)].ToString());
                        }else{
                        System.out.println("no se encuentra la persona");
                        }
            
                    break;
                case 8:System.out.println("ingrese el tipo");
                        int tip = TecladoIn.readLineInt();
                        System.out.println("ingrese el dni");
                        long docu = TecladoIn.readLineLong();
                        Cuitcuil d;
                        d = new Cuitcuil (tip,docu);
                        if (busquedaBinaria(a,d)!= -1){
                        System.out.println(a[+busquedaBinaria(a,d)].ToString());
                        }else{
                            System.out.println("no se encuentra la persona");
                        }
                    break;
                case 9: System.out.println("ingrese el codigo postal");
                     int codi = TecladoIn.readLineInt();
                     recuperarPersonaF(a,codi);
                break;
                case 10: System.out.println("ingrese el codigo postal");
                      int codig = TecladoIn.readLineInt();
                    System.out.println("ingrese su domicilio");
                     String calle = TecladoIn.readLine();
                    recuperarPersonaJ(a,codig,calle);
                break;
                case 11:
                    
                    int k;
                    
                    System.out.println("ingrese el apellido de la persona fisica");
                    String ape =  TecladoIn.readLine();
                    k = cantP(a,a.length-1,ape);
                    System.out.println("la cantidad de personas con ese apellido es "+k);
                    break;
                case 12: int f;
                    System.out.println("ingrese el nombre de la provincia");
                    String pro = TecladoIn.readLine();
                    f = cantE(a,a.length-1,pro);
                    System.out.println("la cantidad de empresas de la provincia es "+f);
                case 13: mergesort(a,0,a.length-1);
                    break;
                case 14: quickSort(a,0,a.length-1);
                    break;
                case 15:
                    break;
                case 16 : System.out.println("ingrese la cantidad de personas");
                       int tam = TecladoIn.readLineInt();
                     a = cargarConjuntoPrueba(tam);
                    break;
                case 17:System.out.println("gracias por utilizar nuestro programa tan confiable");
                    break;
                default : System.out.println("error");
                
                    
                
                     

            }
        }while (op != 17);

    }

    public static Persona cargarDatos() {
        Persona a;
        System.out.println("ingrese el nombre de la persona");
        String nom = TecladoIn.readLine();
        
        
        System.out.println("ingrese el tipo de dni");
        int  tipo = TecladoIn.readLineInt();
        System.out.println("ingrese el dni");
        long dni = TecladoIn.readLineLong();
        System.out.println("ingrese el domicilio");
        String dom = TecladoIn.readLine();
        System.out.println("ingrese el numero de domicilio");
        int nro = TecladoIn.readLineInt();
        System.out.println("ingrese la provincia");
        String prov = TecladoIn.readLine();
        System.out.println("ingrese el codigo postal");
        int cod = TecladoIn.readLineInt();
        a = new Persona(dni, tipo, nom, dom, nro, cod, prov);
        return a;

    }
public static void insertion(Persona []a){
    int p , j ;
     Persona temp;
    for (p = 1; p <= a.length-1; p++) {
        temp = a[p];
        j = p;

        while ( (j>0) && (temp.getCuit().menorEstricto(a[j-1].getCuit())) ) {
            a[j] = a[j-1];
            j = j-1;
        }

        a[j] = temp;
    }
}
public static void selection (Persona []a){
      int i, j, min;
      Persona x;

    for (i = 0; i < a.length-1; i++) {
        min = i;

        for (j  = i+1; j < a.length; j++) {
            if (a[j].getCuit().menorQue(a[min].getCuit()) ) {
                min = j;
            }
        }
            
        x = a[min];
        a[min] = a[i];
        a[i] = x;
    }
}
public static void burbuja(Persona []a){
    int i, j;
    Persona x;

    for (i = 0; i <= a.length-2; i++) {
        for (j = 0; j <= a.length-2-i; j++) {
            if (a[j +1].getCuit().menorEstricto(a[j].getCuit()) ) {
                x = a[j];
                a[j] = a[j+1];
                a [j+1] = x;
            }
        }
    }
}
public static int secuencia (Persona[]a,Cuitcuil t){
    int i;
        i = 0;
        int posicion = -1;
        boolean res = false;
        while (i < a.length && !res) {

            if (t.equals(a[i].getCuit())) {
                res = true;
                posicion = i;

            }
            i++;
        }
        return posicion;
}
public static int busquedaBinaria(Persona[] a, Cuitcuil k) {
        int inicio, fin, medio, resultado;

        inicio = 0;
        fin = a.length - 1;
        resultado = -1;

        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if ( k.equals(a[medio].getCuit())) {
                resultado = medio;
                inicio = fin + 1;
            } else {
                if (k.menorEstricto(a[medio].getCuit()) ) {
                    fin = medio - 1;
                } else {
                    inicio = medio + 1;
                }
            }
        }

        return resultado;
    }
   public static boolean esPersonaFisica(Persona[] a,int i){
       boolean res = true;
       
       if (a[i].getCuit().getTipo()== 30 || a[i].getCuit().getTipo() == 33){
           res = false;
       }
       return res;
   }
   public static int cantP(Persona []a,int i, String ape){
        int dig1;
        
        
        if(i<0){
            dig1= 0;
        }else{
            if(a[i].getNombre().contains(ape) && esPersonaFisica(a,i)){
                dig1 = 1 +cantP(a,i-1,ape);
            }else{
                dig1 = cantP(a,i-1,ape);
            }
        }return dig1;
   }
   
public static int cantE(Persona[] a,int i,String prov){
        int dig;
        if(i<0){
            dig= 0;
        }else{
            if(prov.equalsIgnoreCase(a[i].getProvincia())&& !esPersonaFisica(a,i)){
                dig = 1 +cantE(a,i-1,prov);
            }else{
                dig = cantE(a,i-1,prov);
            }
        }return dig;
    }
public static void quickSort(Persona[] a,int izq,int der){
        Persona aux;
        Persona pivote = a[izq];// tomamos primer elemento como pivote
        int i = izq;//realiza la busqueda de izquierda a derecha
        int j = der;// realiza la busqueda de derecha a izquierda
        
        while (i<j){ //para q no se crucen las busquedas
            while(a[i].getCuit().menorQue(pivote.getCuit()) && i<j){//busca elemento mayor
                i++;
            }
            while (pivote.getCuit().menorEstricto(a[j].getCuit())){//busca el menor 
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
public static void mezclar(Persona a[],int izq, int m, int der){
   int i, j, k;
   Persona [] b = new Persona [a.length]; //arreglo  auxiliar
   for (i=izq; i<=der; i++) //copia ambas mitades en el arreglo auxiliar
             b[i]=a[i];

             i=izq;
             j=m+1;
             k=izq;
             while (i<=m && j<=der) //copia el siguiente elemento más grande
             if (b[i].getCuit().menorQue(b[j].getCuit()))
                     a[k++]=b[i++];
             else
                     a[k++]=b[j++];
             while (i<= m) //copia los elementos que quedan de la
                           a[k++]=b[i++]; //primera mitad (si los hay)
 }
public static void mergesort(Persona a[],int izq, int der){
    if (izq<der){
            int m =(izq+der)/2;
            mergesort(a,izq, m);
            mergesort(a,m+1, der);
            mezclar(a,izq, m, der);
    }
}
 public static Persona[] cargarConjuntoPrueba(int tam) {
        Persona[] listado = new Persona[tam];

        for (int i = 0; i < listado.length; i++) {
            listado[i] = new Persona(
                    Aleatorio.intAleatorio(10000, 9999999),
                    Aleatorio.tipoAleatorio(),Aleatorio.stringAleatorio(20),
                    Aleatorio.stringAleatorio(15),Aleatorio.intAleatorio(1, 5000),
                    Aleatorio.intAleatorio(1, 9000),
                    Aleatorio.stringAleatorio(20)
                    );
        }
        return listado;
    }
 public static void opcion(int r,Persona[] a){
     
 }
 public static void menu(){
     System.out.println();
     System.out.println("1: cargar datos de personas");
     System.out.println("2: mostrar datos ");
     System.out.println("3: consultar persona");
     System.out.println("4: ordenar por metodo incersion");
     System.out.println("5: ordenar por  metodo seleccion");
     System.out.println("6: ordenar por metodo burbuja");
     System.out.println("7: buscar una persona segun su cuit-cuil secuencialmente");
     System.out.println("8: buscar una persona segun su cuit-cuil utilizando el metodo busqueda binaria");
     System.out.println("9: recuperar personas fisicas de una localidad determinada");
     System.out.println("10: recuperar personas juridicas de una localidad dada");
     System.out.println("11: contar la cantidad de personas fisicas con un determinado apellido");
     System.out.println("12: contar la cantidad de empresas de una provincia determinada");
     System.out.println("13: ordenar por metodo mergeSort");
     System.out.println("14: ordenar por metodo quickSort");
     System.out.println("15: ordenar por metodo heapSort");
     System.out.println("16: cargar un arreglo de personas con valores aleatorios");
     System.out.println("17: salir");
 }
 public static void cargar(Persona[] a){
     int i;
     for (i = 0; i < a.length; i++) {
                        a[i] = cargarDatos();
 }
 }
 public static void mostrarPersona(Persona[] a){
     int i;
 
     for (i = 0;i< a.length;i++){
        System.out.println(a[i].ToString());
 }
 }
 public static void consultar(Persona[] a,String nomb){
     // metodo para recuperar pesonas fisicas cuyo nombre contenga la cadena dada ej suarez
     int i;
     for ( i= 0;i< a.length;i++){
        if(a[i].getNombre().contains(nomb) && esPersonaFisica(a,i)) {
            System.out.println(a[i].ToString());
                        }
                    }
 }
 public static void recuperarPersonaF(Persona[] a,int codi){
     int i;
     for ( i= 0; i< a.length;i++){
                      if(codi == a[i].getCodigoP()&& esPersonaFisica(a,i)){
                          System.out.println(a[i].ToString());
                      }
                  }
     
 }
 public static void recuperarPersonaJ(Persona[] a,int codig,String calle){
     int i;
     for(i = 0; i < a.length;i++){
     if(codig == a[i].getCodigoP() && calle.equals(a[i].getDomicilio())&& !esPersonaFisica(a,i)){
        System.out.println(a[i].ToString());
            }
         }
 }
 public static void shiftUp(int[] a,int i){
     int derecho = 2*i;
     int izquierdo = 2*i+1;
     int padre;
     if(izquierdo <= a.length-1 && a[izquierdo]> a[i]){
         padre = izquierdo;
         
     }else{
         padre = i;
     }
     if (derecho <= a.length-1 &&a[derecho]> a[padre]){
         padre = derecho;
     }
 }
 
}



