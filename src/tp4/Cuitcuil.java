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
public class Cuitcuil {

    //atributos
    private int tipo;
    private long documento;
    private final int digito;

    //constructores
    public Cuitcuil(int tip, long doc) {
        tipo = tip;
        documento = doc;
        digito = modulo11(doc);

    }

    //modificadores
    public void setTipo(int tip) {
        this.tipo = tip;
    }

    public void setDocumento(long doc) {
        this.documento = doc;
    }

    //observadores 
    public int getTipo() {
        return this.tipo;
    }

    public long getDoc() {
        return this.documento;
    }

    public int getDigito() {
        return this.digito;
    }

    public String toString() {
        return "tipo = " + this.tipo + "documento =" + this.documento;
    }
    public boolean equals(Cuitcuil a){
        return tipo == a.tipo && documento == a.documento && digito  == a.digito;
    }

    //propios del tipo
    private int modulo11(long doc) {
        
        String x = Long.toString(doc);
        int i, acum, p, acum2,cociente, res;
        
        p = 2;
        acum = 0;
        res = 0;
        for (i = x.length()- 1; i > -1; i--) {
            acum += (((int) x.charAt(i))-48) * p;
            if (p == 7) {
                p = 2;
            } else {
                p++;
            }
        }
        acum = acum %11;
        cociente = acum/11;
        if (acum >= 2 && acum <= 10){
            res = 11 - acum;
        }else{
            if(acum == 1){
               res = cociente % 10 + cociente /10;
            } else{
                if (acum == 0){
                    res = 0;
                }
            }
        }
        
        return res;

    }
public boolean menorQue(Cuitcuil c){
    return (this.tipo <= c.tipo)|| ((this.tipo == c.tipo)&& this.documento <= c.documento);
}
public boolean menorEstricto(Cuitcuil c){
    return (this.tipo < c.tipo)|| ((this.tipo == c.tipo)&& this.documento < c.documento);
}
}
