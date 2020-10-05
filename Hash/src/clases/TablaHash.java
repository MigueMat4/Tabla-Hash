package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migu_
 */
public class TablaHash {
    private Slot[] tabla;
    int maximo = 0;
    
    public TablaHash(int tope){
        maximo = tope;
        tabla = new Slot[maximo];
    }
    
    public int hash(int valor){
        return ((valor + 1) % maximo);
    }
    
    public void insertar(int valor){
        int llave = this.hash(valor);
        tabla[llave] = new Slot();
        tabla[llave].llenar(valor);
    }
    
    public int buscar(int valor){
        int llave = this.hash(valor);
        if (tabla[llave].libre)
            llave = -1;
        return llave;
    }
    
    public void eliminar(int valor){
        int llave = buscar(valor);
        if (llave != -1)
            tabla[llave].vaciar();
    }
}
