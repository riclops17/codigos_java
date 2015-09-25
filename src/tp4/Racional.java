/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author riclops
 */
public class Racional {
    // atributos 
    private int numerador;
    private int denominador;
    //constructores 
    // cree el constructor vacio para que me ayude en las propias de tipo
    public Racional (){
        this.numerador=0;
        this.numerador=0;
    }
    public Racional ( int n, int d){
        numerador = n;
        denominador = d;
        
    }
    //obsevadores
     public int getNumerador(){
         return this.numerador;
     }
     public int getDenominador(){
         return this.denominador;
     }
    public double pasarADouble(){
        return (double) this.numerador/this.denominador;
    }
    public String ToString(){
        return +this.numerador+"/"+this.denominador;
    }
    public boolean equals(Racional r){
        return numerador == r.numerador && denominador == r.denominador;
    }
    //modificadores
    public void setNumerador(int n){
        this.numerador= n;
        
    }
    public void setDenominador (int d){
        this.denominador=d;
        
    }
    //propias del tipo
    public Racional suma(Racional a){
        Racional x = new Racional();
        x.setNumerador((numerador* a.denominador)+ (denominador*a.numerador));
        x.setDenominador(denominador*a.denominador);
        return x;
    }
    public Racional resta(Racional a ){
         Racional x = new Racional();
         x.setNumerador((numerador* a.denominador)- (denominador*a.numerador));
         x.setDenominador(denominador* a.denominador);
         return x;
    }
    public Racional dividir(Racional a){
        Racional x = new Racional();
        x.setNumerador(numerador * a.denominador);
        x.setDenominador(denominador * a.numerador);
        return x;
       
    }
    public Racional multiplicar (Racional a){
        Racional x = new Racional ();
        x.setNumerador(numerador* a.numerador);
        x.setDenominador(denominador* a.denominador);
        return x;
    }
    private int mcd(int a, int b) {
        int r;

        r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        return b;
    }
     public void simplificar() {
        int mcd;

        mcd = mcd(numerador, denominador);
        numerador = numerador / mcd;
        denominador = denominador / mcd;

        if (denominador == 1) {
            System.out.println(numerador);
        } else {
            System.out.println(numerador + "/" + denominador);
        }
    }
}
