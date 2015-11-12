/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import utiles.TecladoIn;

/**
 *
 * @author riclops
 */
public class TestPersona {

    public static void main(String[] args) {
        int i, op;
        op = 0;
        Persona[] a = new Persona[3];

        while (op != 15) {
            //
            op = TecladoIn.readInt();
            switch (op) {
                case 1:
                    for (i = 0; i < a.length; i++) {
                        a[i] = cargarDatos();
                    }
                    break;
                case 2:System.out.println("los datos de las personas son:");
                    for (i = 0;i< a.length;i++){
                        System.out.println(a[i].ToString());
                    }break;
                case 3:System.out.println("ingrese el nombre de la persona que desea consultar");
                    String nomb = TecladoIn.readLine();
                    for ( i= 0;i< a.length;i++){
                        if(nomb.contains(a[i].getNombre())&& (a[i].getCuit().getTipo().equals(20)||(a[i].getCuit().getTipo().equals(23)||a[i].getCuit().getTipo().equals(27)) )){
                            System.out.println(a[i].ToString());
                        }
                    }break;
                case 4:insertion(a);
                    break;
                case 5 :selection(a);
                    break;
                case 6:burbuja(a);
                    break;
                case 7:

            }
        }

    }

    public static Persona cargarDatos() {
        Persona a;
        System.out.println("ingrese el nombre de la persona");
        String nom = TecladoIn.readLine();
        System.out.println("ingrese el tipo de dni");
        String tipo = TecladoIn.readLine();
        System.out.println("ingrese el dni");
        String dni = TecladoIn.readLine();
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

}


