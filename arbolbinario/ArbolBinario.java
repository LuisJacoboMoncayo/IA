/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolbinario;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Silic
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int o=-1, numero;
        String nombre;
        Arbol a = new Arbol();
        while(o!=0)
        {
            System.out.println("\n\n\t\tMenú");
            System.out.println("\n1.-Insertar nuevo nodo");
            System.out.println("2.-Buscar nodo");
            System.out.println("3.-Salir");
            System.out.print("\n\nTeclee el núemero de opción: ");
            o = leer.nextInt();
            switch(o)
            {
                case 1:
                    leer.nextLine();
                    System.out.print("\n\nTeclee el número: ");
                    numero = leer.nextInt();
                    leer.nextLine();
                    System.out.print("\nTeclee el nombre: ");
                    nombre = leer.nextLine();
                    a.agregarNodo(numero, nombre);
                    break;
                case 2:
                    leer.nextLine();
                    if(!a.vacio())
                    {
                        System.out.print("Ingrese el nombre del nodo a buscar: ");
                        nombre = leer.nextLine();
                        a.buscarNodo(nombre, a.raiz);
                        leer.nextLine();
                    }
                    else
                    {
                        System.out.println("El árbol está vació.");
                        leer.nextLine();
                    }
                    break;
                case 3:
                    o=0;
                    break;
                default:
                    System.out.println("\nTeclee una opción dentro del rango.");
            }
        }while(o!=0);
    }
}
