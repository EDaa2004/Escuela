
package ec.edu.espoch.mavenproject2;

import java.util.ArrayList;

/**
 *
 * @author PERSONAL
 */
public class Mavenproject2 {

    public static void main(String[] args) {
    System.out.println("Hello World!");
    ArrayList<String> nombres = new ArrayList<>();
    
    
    nombres.add("efren");
    nombres.add("jessica");
    nombres.add("jonnier");
    nombres.add("dylan");
    
    System.out.println("Nombre es la lista:");
    for(String nombre : nombres){
        System.out.println(nombre);
    }
    nombres.remove("efren");
    System.out.println("Lista despues de eliminar 'efren'");
    for(String nombre:nombres){
        System.out.println(nombre);
    }
    nombres.remove(0);
    System.out.println("lista depsues de eleminar");
    for(String nombre : nombres){
        System.out.println(nombre);
    }
    System.out.println("tamaño de la lista: " +nombres.size());
    }
    
}
