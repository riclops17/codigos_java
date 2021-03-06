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
public class Persona {

    private Cuitcuil cuit;
    private String nombre;
    private String domicilio;
    private int nroDomicilio;
    private int codigoP;
    private String provincia;

    public Persona(long dni, int tip, String nom, String calle, int nro, int cod, String prov) {
        cuit = new Cuitcuil(tip, dni);
        nombre = nom;
        domicilio = calle;
        nroDomicilio = nro;
        codigoP = cod;
        provincia = prov;
    }
   
    public Cuitcuil getCuit() {
        return this.cuit;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public int getNroDomicilio() {
        return this.nroDomicilio;

    }

    public int getCodigoP() {
        return this.codigoP;
    }

    public String getProvincia() {
        return this.provincia;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public void setDomicilio(String calle){
        this.domicilio= calle;
    }
    public void setNroDomicilio(int nro){
        this.nroDomicilio= nro;   
    }
    public void setCodigoP(int cod){
        this.codigoP=cod;
    }
    public void setProvincia(String prov){
        this.provincia= prov;
    }
    public void setCuil (int tip,long dni){
        this.cuit.setTipo(tip);
        this.cuit.setDocumento(dni);
    }
    public String ToString() {
        return "nombre: " + nombre + "Cuil: " + cuit.getTipo() + "-" + cuit.getDoc() + "-" + cuit.getDigito() + "\ndomicilio:" + domicilio + "\nnumero:" + nroDomicilio + "\nCodigo postal:" + codigoP + "\nprovincia:" + provincia;

    }

}
