/*
 * @(#)Amarillo.java        2.06
 * 
 * Copyright (c) 2023 Javier Matamala.
 * Todos los derechos reservados.
*/
package pikinim;
import java.lang.Math;
/**
 * Clase que hereda las propiedades de Pikinim.<p>
 * Representa el grupo de Pikinim Amarillos.
 * @version 2.06
 * @author Javier Matamala */
public class Amarillo extends Pikinim {
    /**
     * Constructor de la subclase Amarillo.<p>
     * El ataque y la capacidad vienen predefinidas a 1 y 3, respectivamente.
     * @param quantity : Recibe la cantidad inicial de Pikinim Amarillos.
     */
    public Amarillo(int quantity){
        set_dmg(1);
        set_cap(3);
        set_quan(quantity);
    }
    /**
     * Función que permite aumentar la cantidad de Pikinim Amarillos.
     * @param cantidad : La cantidad a modificar para aumentar los Pikinim.
     */
    public void multiplicar(int cantidad){
        set_quan(get_quan() + (int)Math.ceil(cantidad * 1.5));
    }
}