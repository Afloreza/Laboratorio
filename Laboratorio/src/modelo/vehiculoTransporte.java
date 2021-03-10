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
public class vehiculoTransporte extends Vehiculo {
    
    private int capacidad;
    private int puertas;

    public vehiculoTransporte(int capacidad, int puertas, String matricula, String marca) {
        super(matricula, marca);
        this.capacidad = capacidad;
        this.puertas = puertas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getPuertas() {
        return puertas;
    }
        
    @Override
    public String mostrarDatos (){
  
    return "Matricula: " +matricula+"\nMarca: "+marca +"\nCapacidad: "+capacidad+"\npuertas: "+puertas;
    
    }
            
    }
    

