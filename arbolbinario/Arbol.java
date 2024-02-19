/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author Silic
 */
public class Arbol {
    Nodo raiz;
    
    public Arbol()
    {
        raiz=null;
    }
    
    public void agregarNodo(int d, String n)
    {
        Nodo nuevo = new Nodo(d,n);
        if(raiz==null)
        {
            raiz = nuevo;
        }
        else
        {
            Nodo aux=raiz;
            Nodo padre;
            while(true)
            {
                padre=aux;
                if(d<aux.dato)
                {
                    aux=aux.hijoizq;
                    if(aux==null)
                    {
                        padre.hijoizq=nuevo;
                        return;
                    }
                }
                else
                {
                    aux=aux.hijoder;
                    if(aux==null)
                    {
                        padre.hijoder=nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    public boolean vacio(){
        return raiz==null;
    }
    
    public void buscarNodo(String nom, Nodo nodo){
        if(nodo!=null)
        {
            if(nodo.nombre.equals(nom))
            {
                System.out.println("Se ha encontrado el nodo con el nombre: "+nom+" y dato: "+nodo.dato);
                return;
            }
            buscarNodo(nom, nodo.hijoizq);
            buscarNodo(nom, nodo.hijoder);
        }
    }
}
