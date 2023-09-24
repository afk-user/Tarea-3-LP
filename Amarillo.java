/*
 * @(#)Amarillo.java        2.04 24 Sep 2023
 * 
 * Copyright (c) 2023 Javier Matamala.
 * Todos los derechos reservados.
*/
import java.lang.Math;

/**
 * Clase que hereda las propiedades de Pikinim.<p>
 * Representa el grupo de Pikinim Amarillos.
 * @version 2.04 24 Sep 2023
 * @author Javier Matamala */
public class Amarillo extends Pikinim {
    /**
     * Constructor de la subclase Amarillo.<p>
     * El ataque y la capacidad vienen predefinidas a 1 y 3, respectivamente.
     * @param quantity : Recibe la cantidad inicial de Pikinim Amarillos.
     */
    Amarillo(int quantity){
        set_dmg(1);
        set_cap(3);
        set_quan(quantity);
    }
    /**
     * Función que permite aumentar la cantidad de Pikinim Amarillos.
     * @param cantidad : La cantidad a modificar para aumentar los Pikinim.
     */
    void multiplicar(int cantidad){
        set_quan(get_quan() + (int)Math.ceil(cantidad * 1.5));
    }
}