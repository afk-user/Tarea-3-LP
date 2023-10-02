/*
 * @(#)Pikinim.java 2.06
 * 
 * Copyright (c) 2023 Javier Matamala.
 * Todos los derechos reservados.
*/
package pikinim;
/**
 * Clase abstracta que incluye las variables ataque, capacidad, cantidad, y las funciónes disminuir y multiplicar.<p>
 * Representa la "raza" de los Pikinim, debido a que las subclases heredan todas las propiedades.
 * @version 2.06
 * @author Javier Matamala */
public abstract class Pikinim {
    private int ataque;
    private int capacidad;
    private int cantidad;

    /**
     * Setter de ataque de la clase Pikinim.
     * @param damage : Recibe el ataque a establecer.
     */
    public void set_dmg(int damage){
        ataque = damage;
    }
    /**
     * Getter de ataque de la clase Pikinim.
     * @return int : Retorna el ataque del Pikinim.
     */
    public int get_dmg(){
        return ataque;
    }
    /**
     * Setter de capacidad de la clase Pikinim.
     * @param capacity : Recibe la capacidad a establecer.
     */
    public void set_cap(int capacity){
        capacidad = capacity;
    }
    /**
     * Getter de capacidad de la clase Pikinim.
     * @return int : Retorna la capacidad del Pikinim.
     */
    public int get_cap(){
        return capacidad;
    }
    /**
     * Setter de cantidad de la clase Pikinim.
     * @param quantity : Recibe la cantidad a establecer.
     */
    public void set_quan(int quantity){
        cantidad = quantity;
    }
    /**
     * Getter de cantidad de la clase Pikinim.
     * @return int : Retorna la cantidad del Pikinim.
     */
    public int get_quan(){
        return cantidad;
    }

    /**
     * Función que disminuye el número de Pikinim en una cantidad.
     * @param cantidad : La cantidad a disminuir de Pikinim.
     */
    public void disminuir(int cantidad){
        set_quan(get_quan()-cantidad);
    }
    /**
     * Función abstracta que permite aumentar la cantidad de Pikinim.<p>
     * La forma en la que el método funciona depende de cada subclase.
     * @param cantidad : Número que se modifica para saber cuantos pikinim añadir al total.
     */
    public abstract void multiplicar(int cantidad);
}