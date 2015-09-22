/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacroparcial;

/**
 *
 * @author riclops
 */
public class Patinador {
    //atributos
    private String Apellido;
    private String Nombre ;
    private String Dni;
    private int Edad;
    private char Categoria;
    //constructores 
    
   public Patinador (){
       
   }
   public Patinador(String ape , String nom,String doc , int de ,char cat){
       Apellido = ape;
       Nombre = nom;
       Dni = doc;
       Edad = de ;
       Categoria = cat;
       
   }
   //observadores
   public String getApellido(){
       return this.Apellido;
       
   }
   public String getNombre(){
       return this.Nombre;
   }
   public String getDni (){
       return this.Dni;
       
   }
   public int getEdad (){
       return this.Edad;
   }
   public char getCategoria(){
       return this.Categoria;
   }
   public String toString(){
       return "nombre ="+this.Nombre+"apellido ="+this.Apellido+"Dni ="+this.Dni+ "Edad ="+this.Edad+"categoria ="+this.Categoria;
   }
   // modificadores 
   public void  setNombre(String nom){
       this.Nombre= nom;
   }
   public void setApellido (String ape){
       this.Apellido = ape;
   }
   public void setDni(String doc){
       this.Dni=doc;
       
   }
   public void setEdad(int de){
       this.Edad= de;
   }
   public void setCategoria ( char cat){
       this.Categoria=cat;
   }
   //propias del tipo
   public void asciendeCategoria(char c){
       switch (c){
           case 'p': Categoria = 'i';break;
           case 'i': Categoria = 'c';break;
           case 'c': Categoria = 'b';break;
           case 'b': Categoria = 'a';break;
           case 'a':break;
           default:System.out.println("error");break;
               
       }
       
   }
   public boolean equals(Patinador x){
       return Nombre.equals(x.Nombre)&& (Apellido.equals(x.Apellido))&& Dni.equals(x.Dni) && Edad==x.Edad && Categoria == x.Categoria;
   }
   
}
