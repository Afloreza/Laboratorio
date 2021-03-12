package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Laboratorio {

    public static void main(String[] args) {
     
        Vehiculo vehiculos [] = new Vehiculo [6];
        
        vehiculos[0]= new Vehiculo("H7GRV1","Toyota");
        vehiculos[1] = new vehiculoTransporte(25, 6, "Y87HDB", "Toyota");
        vehiculos[2] = new vehiculoTransporte(21, 4, "I09UDE", "Mercedes");
        vehiculos[3] = new VehiculoCompetencia(200, "Y87HDB", "Toyota");
        vehiculos[4] = new VehiculoCompetencia(200, "U5H5TH", "Ford");
        vehiculos[5] = new VehiculoCompetencia(200, "845BK4", "Ferrari");
        
        
        for (Vehiculo vehiculo1: vehiculos){
        
            System.out.println(vehiculo1.mostrarDatos());
            System.err.println("");
        
        
        
        }
    }
    
}
