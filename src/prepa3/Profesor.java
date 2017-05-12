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
public class Profesor extends Personal{
    
    public Profesor(String nombre, String apellido, int ci, int carnet){
        super(nombre,apellido,ci,carnet);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCarnet(int carnet) {
        super.setCarnet(carnet); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCi(int ci) {
        super.setCi(ci); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getApellido() {
        return super.getApellido(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCarnet() {
        return super.getCarnet(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCi() {
        return super.getCi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return this.nombre+" "+this.apellido+" "+this.ci+" "+this.carnet;
    }
    
    public void Corregir(){
        System.out.println("El profesor esta corrigiendo");
    }
    
   
    
}
