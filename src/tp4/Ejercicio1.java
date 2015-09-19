/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import utiles.TecladoIn;

/**
 *
 * @author Ricardo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        //
        int n, m, op, i, j;
        op = 0;
        System.out.println("ingrese el orden de la matriz A");
        n = TecladoIn.readLineInt();
        m = TecladoIn.readLineInt();
        int[][] a = new int[n][m];
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.print("Ingrese fila " + (i + 1) + " columna " + (j + 1) + ": ");
                a[i][j] = TecladoIn.readLineInt();
            }
        }
        while (op != 11) {
            System.out.println("1: Mostrar los elementos de una matriz");
            System.out.println("2: verificar si la matriz es cuadrada");
            System.out.println("3: verificar  la matriz es triangulas superior");
            System.out.println("4: verificar la matriz si es diagonal");
            System.out.println("5: sumar matriz");
            System.out.println("6: multiplicar por un escalar ");
            System.out.println("7: Trasponer matriz");
            System.out.println("8: sumar elementos de una fila determinada");
            System.out.println("9: sumar los elementos de una columna determinada");
            System.out.println("10:Multiplicar una matriz por otra ");
            System.out.println("11: salir");
            System.out.println(" ingrese una opcion");
            op = TecladoIn.readLineInt();

            opcion(op, a);

        }

    }

    public static void mostrar(int[][] a) {
        //
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean cuadrada(int[][] b) {
        //
        boolean x = true;
        if ((b.length) == (b[0].length)) {
            x = true;
        } else {
            x = false;
        }
        return x;
    }

    public static boolean triangularSuperior(int[][] c) {
        //
        int i, j;
        i = 0;
        boolean res = false, parar;
        parar = true;
        while ((i < c.length) && (parar)) {
            j = 0;
            while ((j < c[0].length) && (parar)) {
                if ((i > j) && (c[i][j] != 0)) {
                    res = true;
                } else {
                    res = false;
                    parar = false;
                }

                j = j + 1;
            }
            i = i + 1;
        }
        return res;
    }

    public static boolean triangularInferior(int[][] c) {
        //
        int i, j;
        i = 0;
        boolean res = false, parar;
        parar = true;
        while ((i < c.length) && (parar)) {
            j = 0;
            while ((j < c[0].length) && (parar)) {
                if ((i < j) && (c[i][j] != 0)) {
                    res = true;
                } else {
                    res = false;
                    parar = false;
                }

                j = j + 1;
            }
            i = i + 1;
        }
        return res;
    }

    public static boolean diagonal(int[][] d) {
        //
        boolean rest;
        rest = true;
        if ((triangularSuperior(d)) && (triangularInferior(d))) {
            rest = true;

        }
        return rest;

    }

    public static void sumaM(int[][] e, int[][] f, int k, int r) {
        //
        int i, j;
        int[][] res = new int[k][r];
        if (e.length == f.length) {
            for (i = 0; i < e.length; i++) {
                for (j = 0; j < e[0].length; j++) {
                    res[i][j] = e[i][j] + f[i][j];
                }
            }
            mostrar(res);
        } else {
            System.out.println("no se puede realizar la suma de matrices");
        }

    }

    public static void productoE(int[][] f, int k) {
        //
        int i, j;
        for (i = 0; i < f.length; i++) {
            for (j = 0; j < f[0].length; j++) {
                f[i][j] = f[i][j] * k;
            }
        }
        mostrar(f);
    }

    public static void transponer(int[][] g) {
        //
        int i, j;
        int[][] res;
        res = new int[g[0].length][g.length];
        for (i = 0; i < g.length; i++) {
            for (j = 0; j < g.length; j++) {
                res[j][i] = g[i][j];
            }
        }
        mostrar(res);
    }

    public static void sumf(int[][] h, int f) {
        //
        int j, res;
        res = 0;
        for (j = 0; j < h[0].length; j++) {
            res = res + h[f][j];
        }
        System.out.println("la suma es" + res);
    }

    public static void sumc(int[][] h, int c) {
        //
        int i, res;
        res = 0;
        for (i = 0; i < h.length; i++) {
            res = res + h[i][c];
        }
        System.out.println("la suma es" + res);
    }

    public static void multiplicacion(int[][] a, int[][] b) {
        //
        int i, j, canti, cantj, cantj2, k, sum;
        canti = a.length;
        cantj = a[0].length;
        cantj2 = b[0].length;
        int[][] c = new int[canti][cantj];
        for (i = 0; i < canti; i++) {
            for (j = 0; j < cantj2; j++) {
                sum = 0;
                for (k = 0; k < cantj; k++) {
                    sum = sum + a[i][k] * b[k][j];
                }
            }
        }
        mostrar(c);

    }

    public static void opcion(int x, int[][] a) {
        //
        int i, j;
        switch (x) {
            case 1:
                mostrar(a);
                break;
            case 2:
                if (cuadrada(a)) {
                    System.out.println("la matriz es cuadrada");
                } else {
                    System.out.println("la matriz no es cuadrada");
                }
                break;
            case 3:
                if (cuadrada(a) && triangularSuperior(a)) {
                    System.out.println("es triangular superior");
                } else {
                    System.out.println("no es triangular superior");
                }
                break;
            case 4:
                if (cuadrada(a) && diagonal(a)) {
                    System.out.println("es una matriz diagonal");
                } else {
                    System.out.println("no es una matriz diagonal");
                }
                break;
            case 5:
                int k = 0;
                int l = 0;
                System.out.println("ingrese el orden de la matriz que sumara");
                k = TecladoIn.readLineInt();
                l = TecladoIn.readLineInt();
                int[][] b = new int[k][l];
                for (i = 0; i < b.length; i++) {
                    for (j = 0; j < b[0].length; j++) {
                        System.out.println("ingrese los elementos");
                        b[i][j] = TecladoIn.readLineInt();
                    }
                }
                sumaM(a, b, k, l);
                break;
            case 6:
                int y = 0;
                System.out.println("ingrese un escalar");
                y = TecladoIn.readLineInt();
                productoE(a, y);
                break;
            case 7:
                transponer(a);
                break;
            case 8:
                int g = 0;
                System.out.println("ingrese la fila que desea sumar");
                g = TecladoIn.readLineInt();
                sumf(a, g);
                break;
            case 9:
                int z = 0;
                System.out.println("ingrese la columna que desea sumar");
                z = TecladoIn.readLineInt();
                sumc(a, z);
                break;
            case 10:
                int s = 0;
                int q = 0;

                System.out.println("ingrese el orden de la matriz que multiplicara");
                s = TecladoIn.readLineInt();
                q = TecladoIn.readLineInt();
                int[][] v = new int[q][s];
                for (i = 0; i < v.length; i++) {
                    for (j = 0; j < v.length; j++) {
                        System.out.print("Ingrese fila " + (i + 1) + " columna " + (j + 1) + ": ");
                        v[i][j] = TecladoIn.readLineInt();
                    }
                }
                if (a[0].length == v.length) {
                    multiplicacion(a, v);
                } else {
                    System.out.println("no se puede realizar la multiplicacion");
                }
                break;

        }
    }

}
