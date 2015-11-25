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
        int i, acum, p, acum2, res;
        acum2 = 0;
        p = 2;
        acum = 0;
        res = 0;
        for (i = x.length()- 1; i <= 0; i--) {
            acum += x.charAt(i) * p;
            if (p == 7) {
                p = 2;
            } else {
                p++;
            }
        }
        switch (acum2) {
            case 1:
                if (acum2 == 0) {
                    res = 0;

                }
                break;
            case 2:
                if (acum < 11 && acum > 1) {
                    res = 11 - acum2;
                }
                break;
            case 3:
                if (acum == 1) {
                    int c = acum2 % 10;
                    int y = acum2 / 10;
                    res = c + y;
                }

        }
        return res;

    }

    public boolean menorQue(Cuitcuil c) {
        boolean todoOk = tipo <= c.tipo;
        
        if (!todoOk) {
            todoOk = documento <= c.documento;
        }
        return todoOk;
    }

    public boolean menorEstricto(Cuitcuil c) {
        boolean todoOk = tipo < c.tipo;
        
        if (!todoOk) {
            todoOk = documento < c.documento;
        }
        return todoOk;
    }
}
