/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author migu_
 */
public class Slot {
    
    public int valor = 0;
    public boolean libre;
    
    public Slot(){
        libre = true;
    }
    
    public void llenar(int valorIngresado){
        valor = valorIngresado;
        libre = false;
    }
    
    public void vaciar(){
        valor = 0;
        libre = true;
    }
    
}
