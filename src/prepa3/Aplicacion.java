/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prepa3;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class Aplicacion {
    
    
    
    //APLICAMOS EL POLIFORMISMO
    private Personal[] arrayPersonal = new Personal[2];

    public Personal[] getArrayPersonal() {
        return arrayPersonal;
    }

    public void setArrayPersonal(Personal[] arrayPersonal) {
        this.arrayPersonal = arrayPersonal;
    }
    
    public Aplicacion(){
        
        
        /*
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < this.arrayPersonal.length; i++) {
            String nombre = sc.next();
            String apellido = sc.next();
            int ci = sc.nextInt();
            int carnet = sc.nextInt();
            System.out.println("1 profesor, 2 seguridad, 3 limpieza");
            int rsp = sc.nextInt();
            
            if(rsp == 1){
                arrayPersonal[i] = new Profesor(nombre,apellido,ci,carnet);
            }
            else if(rsp == 2 ){
                arrayPersonal[i] = new Limpieza(nombre,apellido,ci,carnet);
                
            }
            else{
                arrayPersonal[i] = new Seguridad(nombre,apellido,ci,carnet);
            }
            
            
        }
        
        for (int j = 0; j < arrayPersonal.length; j++) {
                
                if(arrayPersonal[j] instanceof Profesor){
                    System.out.println("Profesor:");
                    System.out.println(arrayPersonal[j].toString());
                    //CASTEO
                    Profesor p = (Profesor) arrayPersonal[j];
                    p.Corregir();
                }
                else if(arrayPersonal[j] instanceof Limpieza){
                    System.out.println("Limpieza:");
                    System.out.println(arrayPersonal[j].toString());
                    //CASTEO
                    Limpieza l = (Limpieza) arrayPersonal[j];
                    l.Limpiar();
                }
                else{
                    System.out.println("Seguridad:");
                    System.out.println(arrayPersonal[j].toString());
                    //CASTEO
                    Seguridad s = (Seguridad) arrayPersonal[j];
                    s.Vigilar();
                }
            }
        
    }
    
    
   */
}

}