/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author Silic
 */
public class Nodo {
    int dato;
    Nodo hijoizq, hijoder;
    String nombre;
    
    public Nodo(int d, String n)
    {
        this.dato=d;
        this.nombre=n;
        this.hijoizq=null;
        this.hijoder=null;
    }
    
    public String toString()
    {
        return nombre +" Su dato es "+dato;
    }
}
