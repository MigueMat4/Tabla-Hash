/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Miguel Matul <miguemat4@gmail.com>
 */
public class Slot {
    
    public ArrayList<Integer> valores = new ArrayList<>();
    public boolean libre;
    
    public Slot(){
        libre = true;
    }
    
    public void llenar(int valorIngresado){
        valores.add(valorIngresado);
        libre = false;
    }
    
    public void vaciar(int valorAEliminar){
        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i) == valorAEliminar){
                valores.remove(i);
                break;
            }
        }
        if (valores.isEmpty())
            libre = true;
    }
    
}
