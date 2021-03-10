/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author User
 */
public class VehiculoCompetencia extends Vehiculo {
    
    private  int cilindraje;
    

    public VehiculoCompetencia(int cilindraje,String matricula, String marca) {
        super(matricula, marca);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public String mostrarDatos (){
  
    return "Matricula: " +matricula+"\nMarca: "+marca +"\nCilindraje: "+cilindraje;
    }
    

    
   
}
