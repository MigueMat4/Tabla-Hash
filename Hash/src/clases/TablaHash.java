package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel Matul <miguemat4@gmail.com>
 */
public class TablaHash {
    public Slot[] tabla;
    public int maximo = 0;
    
    public TablaHash(int tope){
        maximo = tope;
        tabla = new Slot[maximo];
        for (int i=0; i<maximo; i++)
            tabla[i] = new Slot();
    }
    
    public int hash(int valor){
        return ((valor + 1) % maximo);
    }
    
    public void insertar(int valor){
        int llave = this.hash(valor);
        tabla[llave].llenar(valor);
    }
    
    public int buscar(int valor){
        int llave = this.hash(valor);
        if (tabla[llave].libre)
            llave = -1;
        else{
            int contador = 0;
            for (int i = 0; i < tabla[llave].valores.size(); i++) {
                if (tabla[llave].valores.get(i) == valor)
                    break;
                contador++;
            }
            if (contador == tabla[llave].valores.size())
                llave = -1;
        }
        return llave;
    }
    
    public void eliminar(int llave, int valor){
        tabla[llave].vaciar(valor);
    }
}
