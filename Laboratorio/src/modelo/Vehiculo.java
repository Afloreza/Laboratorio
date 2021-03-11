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
public class Vehiculo {
        
    String matricula;
    String marca;
    
   
    public Vehiculo (String matricula, String marca ){
       this.matricula = matricula;
       this.marca = marca;
     }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

  public String mostrarDatos (){
  
  return "Matricula: " +matricula+"\nMarca: "+marca;
  }
    
    
    
}
