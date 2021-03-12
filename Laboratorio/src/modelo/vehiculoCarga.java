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
public class vehiculoCarga {
    
    String peso;
    String tipo;
    String numero;


    public vehiculoCarga(String peso, String tipo, String numero) {
        this.peso = peso;
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Override
    public String toString() {
        return "vehiculoCarga{" + "peso=" + peso + ", tipo=" + tipo + '}';
    }
    
    
    
    
}
