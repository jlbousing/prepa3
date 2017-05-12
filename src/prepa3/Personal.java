/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prepa3;

/**
 *
 * @author Sony
 */
public abstract class Personal {
    
    protected String nombre;
    protected String apellido;
    protected int ci;
    protected int carnet;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public Personal(String nombre, String apellido, int ci, int carnet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.carnet = carnet;
    }
    
    public abstract String toString();
    
    
    
}
