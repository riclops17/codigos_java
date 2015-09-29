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
    private String tipo;
    private String documento;
    private int digito;
    //constructores
    public Cuitcuil(String tip,String doc){
       tipo = tip;
       documento= doc;
       
       
    }
    //modificadores
    public void setTipo(String tip){
        this.tipo=tip;
    }
    public void setDocumento(String doc){
        this.documento = doc;
    }
    //observadores 
    public String getTipo(){
        return this.tipo;
    }
    public String getDoc(){
        return this.documento;
    }
    public String toString(){
        return "tipo = " +this.tipo+ "documento ="+this.documento;
    }
    //propios del tipo
    private int modulo11( String doc){
        int longitud = doc.length();
        int i,acum,p,acum2,res;
        acum2 = 0;
        p = 2;
        acum = 0;
        res = 0;
        for(i= longitud-1 ;i<= 0;i--){
            acum += doc.charAt(i) * p;
            if (p == 7){
                p = 2;
            }else {
                p++;
            }
        }
            switch (acum2){
                case 1 : if (acum2 == 0){
                    res = 0;
                    
                }break;
                case 2 : if ( acum<11 && acum>1){
                    res = 11 - acum2;
                }break;
                case 3 : if ( acum == 1 ){
                  int x = acum2 % 10;
                  int y = acum2 / 10;
                  res = x + y;
                }
                    
            }
            return res;
              
    }
    public boolean menorQue(Cuitcuil c){
        String x;
        String 
        
        x = tipo+documento;
       
    }
    
                     
                
            
            
            
            
            
        
       
    

}

