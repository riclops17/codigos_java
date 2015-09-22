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
public class Auto {
    //atributo
    private String Patente;
    private int CuentaKm;
    private String Modelo;
    private boolean Disponible;
    //constructores
    public Auto (){
        
    }
    
    
    public Auto (String pat){
        Patente = pat;
    }
    public Auto (String pat,int km,String mod,boolean dispo){
        Patente = pat;
        CuentaKm = km;
        Modelo = mod;
        Disponible = dispo;
    }
    //modificadores
    public void setCuentaKm(int km){
        this.CuentaKm= km;
        
    }
    public  void setModelo(String mod){
        this.Modelo = mod;
    }
    public void setDisponible (boolean dispo){
        this.Disponible= dispo;
    }
    //obserbadores
    public String getPatente(){
        return this.Patente;
        
    }
    public int getCuentaKm(){
        return this.CuentaKm;
    }
    public String getModelo(){
        return this.Modelo;
    }
    public boolean getDisponible(){
        return this.Disponible;
        
    }
    public String toString(){
        return "patente = "+this.getPatente()+" cuenta = "+this.getCuentaKm()+" modelo = "+this.getModelo()+"disponible = "+this.getDisponible();
    } 
    public boolean equals(Auto a){
        return Patente.equalsIgnoreCase(a.Patente)&& CuentaKm == a.CuentaKm && Modelo.equalsIgnoreCase(a.Modelo)&& Disponible == a.Disponible;
    }
    
}
