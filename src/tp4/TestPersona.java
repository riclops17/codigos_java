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
        int op;
    //System.out.println("ingrese la cantidad de personas"); se evitara esta opcion ya que se cargaran aletoriamente
        
        Persona[] a = new Persona[2];

        do {
            menu();
            op = TecladoIn.readInt();
            switch (op) {
                case 1:
                    cargar(a);
                    break;
                case 2:
                    System.out.println("los datos de las personas son:");
                    mostrarPersona(a);
                    break;
                case 3:
                    System.out.println("ingrese el nombre de la persona que desea consultar");
                    String nomb = TecladoIn.readLine();
                    consultar(a, nomb);
                    break;
                case 4:
                    insertion(a);
                    System.out.println("se ah ordenado exitosamente");
                    break;
                case 5:
                    selection(a);
                    System.out.println("se ah ordenado exitosamente");
                    break;
                case 6:
                    burbuja(a);
                    System.out.println("se ah ordenado exitosamente");
                    break;
                case 7:
                    System.out.println("ingrese el tipo");
                    int ti = TecladoIn.readLineInt();
                    System.out.println("ingrese el dni");
                    long doct = TecladoIn.readLineLong();
                    Cuitcuil c;
                    c = new Cuitcuil(ti, doct);
                    if (secuencia(a, c) != -1) {
                        System.out.println(a[+secuencia(a, c)].ToString());
                    } else {
                        System.out.println("no se encuentra la persona");
                    }

                    break;
                case 8:
                    System.out.println("ingrese el tipo");
                    int tip = TecladoIn.readLineInt();
                    System.out.println("ingrese el dni");
                    long docu = TecladoIn.readLineLong();
                    Cuitcuil d;
                    d = new Cuitcuil(tip, docu);
                    if (busquedaBinaria(a, d) != -1) {
                        System.out.println(a[+busquedaBinaria(a, d)].ToString());
                    } else {
                        System.out.println("no se encuentra la persona");
                    }
                    break;
                case 9:
                    System.out.println("ingrese el codigo postal");
                    int codi = TecladoIn.readLineInt();
                    recuperarPersonaF(a, codi);
                    break;
                case 10:
                    System.out.println("ingrese el codigo postal");
                    int codig = TecladoIn.readLineInt();
                    System.out.println("ingrese su domicilio");
                    String calle = TecladoIn.readLine();
                    recuperarPersonaJ(a, codig, calle);
                    break;
                case 11:
                    int k;
                    System.out.println("ingrese el apellido de la persona fisica");
                    String ape = TecladoIn.readLine();
                    k = cantP(a, a.length - 1, ape);
                    System.out.println("la cantidad de personas con ese apellido es " + k);
                    break;
                case 12:
                    int f;
                    System.out.println("ingrese el nombre de la provincia");
                    String pro = TecladoIn.readLine();
                    f = cantE(a, a.length - 1, pro);
                    System.out.println("la cantidad de empresas de la provincia es " + f);
                case 13:
                    /*
                    *si el numero a ordenar es de 0 y 1 termina
                    *ordena recursivamente las 2 mitades del arreglo
                    *mezcla las 2 mitades ordenadas en un arreglo ordenado
                    */
                    mergesort(a,0,a.length-1);
                    System.out.println("se ah ordenado exitosamente");
                    break;
                case 14:
                    /*
                    *Elijo  un elemento de la lista a ordenar al que lo llamo pivote
                    *Después de elegir el pivote se realizan dos búsquedas
                    *Una de izquierda a derecha, buscando un elemento mayor que el pivote
                    *Otra de derecha a izquierda, buscando un elemento menor que el pivote. 
                    *Cuando se han encontrado los dos elementos anteriores, se intercambian,
                    *y se sigue realizando la búsqueda hasta que las dos búsquedas se encuentran. 
                    */
                    quickSort(a, 0, a.length - 1);
                    System.out.println("se ah ordenado exitosamente");
                    break;
                case 15:
                    heapSort(a, a.length - 1);
                    System.out.println("se ah ordenado exitosamente");
                    break;
                case 16:
                    System.out.println("ingrese la cantidad de personas");
                    int tam = TecladoIn.readLineInt();
                    a = cargarConjuntoPrueba(tam);
                    break;
                case 17:
                    break;
                default:
                    System.out.println("error, ingrese nuevamente");

            }
        } while (op != 17);

    }

    public static Persona cargarDatos() {
        Persona a;
        System.out.println("ingrese el nombre de la persona");
        String nom = TecladoIn.readLine();
        System.out.println("ingrese el tipo de dni");
        int tipo = TecladoIn.readLineInt();
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

    public static void insertion(Persona[] a) {
        int p, j;
        Persona temp;
        for (p = 1; p <= a.length - 1; p++) {
            temp = a[p];
            j = p;

            while ((j > 0) && (temp.getCuit().menorEstricto(a[j - 1].getCuit()))) {
                a[j] = a[j - 1];
                j = j - 1;
            }

            a[j] = temp;
        }
    }

    public static void selection(Persona[] a) {
        int i, j, min;
        Persona x;

        for (i = 0; i < a.length - 1; i++) {
            min = i;

            for (j = i + 1; j < a.length; j++) {
                if (a[j].getCuit().menorQue(a[min].getCuit())) {
                    min = j;
                }
            }

            x = a[min];
            a[min] = a[i];
            a[i] = x;
        }
    }

    public static void burbuja(Persona[] a) {
        int i, j;
        Persona x;

        for (i = 0; i <= a.length - 2; i++) {
            for (j = 0; j <= a.length - 2 - i; j++) {
                if (a[j + 1].getCuit().menorEstricto(a[j].getCuit())) {
                    x = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = x;
                }
            }
        }
    }

    public static int secuencia(Persona[] a, Cuitcuil t) {
        // retorna la posocicion de la persona si se encuentra de lo contrario retorna -1
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
        // retorna la posocicion de la persona si se encuentra de lo contrario retorna -1
        int inicio, fin, medio, resultado;
        inicio = 0;
        fin = a.length - 1;
        resultado = -1;

        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if (k.equals(a[medio].getCuit())) {
                resultado = medio;
                inicio = fin + 1;
            } else {
                if (k.menorEstricto(a[medio].getCuit())) {
                    fin = medio - 1;
                } else {
                    inicio = medio + 1;
                }
            }
        }

        return resultado;
    }

    public static boolean esPersonaFisica(Persona[] a, int i) {
        // retorna verdadero si es se trata de una persona fisica de lo contrario falso
        boolean res = true;

        if (a[i].getCuit().getTipo() == 30 || a[i].getCuit().getTipo() == 33) {
            res = false;
        }
        return res;
    }

    public static int cantP(Persona[] a, int i, String ape) {
        // modulo que busca la cantidad de personas ,es  del 2do parcial modificado para este ejercicio
        int dig1;

        if (i < 0) {
            dig1 = 0;
        } else {
            if (a[i].getNombre().contains(ape) && esPersonaFisica(a, i)) {
                dig1 = 1 + cantP(a, i - 1, ape);
            } else {
                dig1 = cantP(a, i - 1, ape);
            }
        }
        return dig1;
    }

    public static int cantE(Persona[] a, int i, String prov) {
        // modulo que busca la cantidad de empresas ,tomado del 2do parcial modificado para este ejercicio
        int dig;
        if (i < 0) {
            dig = 0;
        } else {
            if (prov.equalsIgnoreCase(a[i].getProvincia()) && !esPersonaFisica(a, i)) {
                dig = 1 + cantE(a, i - 1, prov);
            } else {
                dig = cantE(a, i - 1, prov);
            }
        }
        return dig;
    }

    public static void quickSort(Persona[] a, int izq, int der) {
        Persona aux;
        Persona pivote = a[izq];
        int i = izq;
        int j = der;

        while (i < j) {
            while (a[i].getCuit().menorQue(pivote.getCuit()) && i < j) {
                i++;
            }
            while (pivote.getCuit().menorEstricto(a[j].getCuit())) {
                j--;
            }
            if (i < j) {
                aux = a[i];
                a[i] = a[j];
                a[j] = aux;
            }
        }
        a[izq] = a[j];
        a[j] = pivote;
        if (izq < j - 1) {
            quickSort(a, izq, j - 1);
        }
        if (j + 1 < der) {
            quickSort(a, j + 1, der);
        }
    }
     public static void mezclar(Persona a[],int izq, int m, int der){
   int i, j, k;
   Persona [] b = new Persona [a.length]; 
   for (i=izq; i<=der; i++) //copia las mitades en el arreglo auxiliar
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
       a[k++]=b[i++]; //primera mitad (si estan)
 }
     public static void mergesort(Persona[] a,int izq, int der){
    if (izq<der){
            int m =(izq+der)/2;
            mergesort(a,izq, m);
            mergesort(a,m+1, der);
            mezclar(a,izq, m, der);
    }
}
     
    public static Persona[] cargarConjuntoPrueba(int tam) {
        // crea un conjunto de personas aleatorio
        Persona[] listado = new Persona[tam];

        for (int i = 0; i < listado.length; i++) {
            listado[i] = new Persona(
                    Aleatorio.intAleatorio(10000, 9999999),
                    Aleatorio.tipoAleatorio(), Aleatorio.stringAleatorio(20),
                    Aleatorio.stringAleatorio(15), Aleatorio.intAleatorio(1, 5000),
                    Aleatorio.intAleatorio(1, 9000),
                    Aleatorio.stringAleatorio(20)
            );
        }
        return listado;
    }

    
    public static void menu() {
        System.out.println();
        System.out.println("1: Cargar datos de personas");
        System.out.println("2: Mostrar datos ");
        System.out.println("3: Consultar persona");
        System.out.println("4: Ordenar por metodo incersion");
        System.out.println("5: Ordenar por  metodo seleccion");
        System.out.println("6: Ordenar por metodo burbuja");
        System.out.println("7: Buscar una persona segun su cuit-cuil secuencialmente");
        System.out.println("8: Buscar una persona segun su cuit-cuil utilizando el metodo busqueda binaria");
        System.out.println("9: Recuperar personas fisicas de una localidad determinada");
        System.out.println("10:Recuperar personas juridicas de una localidad dada");
        System.out.println("11:Contar la cantidad de personas fisicas con un determinado apellido");
        System.out.println("12:Contar la cantidad de empresas de una provincia determinada");
        System.out.println("13:Ordenar por metodo mergeSort");
        System.out.println("14:Ordenar por metodo quickSort");
        System.out.println("15:Ordenar por metodo heapSort");
        System.out.println("16:Cargar un arreglo de personas con valores aleatorios");
        System.out.println("17:Salir");
    }

    public static void cargar(Persona[] a) {
        // carga datos de personas individualmente
        int i;
        for (i = 0; i < a.length; i++) {
            a[i] = cargarDatos();
        }
    }

    public static void mostrarPersona(Persona[] a) {
        //muestra los datos de personas por pantalla
        int i;

        for (i = 0; i < a.length; i++) {
            System.out.println(a[i].ToString());
        }
    }

    public static void consultar(Persona[] a, String nomb) {
        // metodo para recuperar pesonas fisicas cuyo nombre o apellido contenga la cadena dada ej suarez
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i].getNombre().contains(nomb) && esPersonaFisica(a, i)) {
                System.out.println(a[i].ToString());
            }
        }
    }

    public static void recuperarPersonaF(Persona[] a, int codi) {
        // recupera las personas fisicas dado su codigo postal
        int i;
        for (i = 0; i < a.length; i++) {
            if (codi == a[i].getCodigoP() && esPersonaFisica(a, i)) {
                System.out.println(a[i].ToString());
            }
        }

    }

    public static void recuperarPersonaJ(Persona[] a, int codig, String calle) {
        // recupera las personas juridicas dado su codigo postal y calle
        int i;
        for (i = 0; i < a.length; i++) {
            if (codig == a[i].getCodigoP() && calle.equals(a[i].getDomicilio()) && !esPersonaFisica(a, i)) {
                System.out.println(a[i].ToString());
            }
        }
    }

    public static void siftUp(Persona[] a, int i, int n) {
         
        int izq, der, padre;
        Persona aux;
        izq = 2 * i;
        der = 2 * i + 1;
        padre = i;
        if (izq <= n && a[i].getCuit().menorEstricto(a[izq].getCuit())) {
            padre = izq;
        }
        if (der <= n && a[padre].getCuit().menorEstricto(a[der].getCuit())) {
            padre = der;
        }
        if (padre != i) {
            aux = a[i];
            a[i] = a[padre];
            a[padre] = aux;
            siftUp(a, padre, n);
        }
    }

    public static void armarHeapMaximo(Persona[] a, int n) {
        int i;
        for (i = n / 2; i >= 0; i--) {
            siftUp(a, i, n);
        }
    }

    public static void heapSort(Persona[] a, int n) {
        int i;
        Persona aux;
        armarHeapMaximo(a, n);
        for (i = n; i > 0; i--) {
            aux = a[0];
            a[0] = a[i];
            a[i] = aux;
            n = n - 1;
            siftUp(a, 0, n);
        }

    }
}
