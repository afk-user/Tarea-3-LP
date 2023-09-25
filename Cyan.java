/*
 * @(#)Cyan.java            2.05
 * 
 * Copyright (c) 2023 Javier Matamala.
 * Todos los derechos reservados.
*/

/**
 * Clase que hereda las propiedades de Pikinim.<p>
 * Representa el grupo de Pikinim Cyan.
 * @version 2.05
 * @author Javier Matamala */
class Cyan extends Pikinim {
    /**
     * Constructor de la subclase Cyan.<p>
     * El ataque y la capacidad vienen predefinidas a 1 y 1, respectivamente.
     * @param quantity : Recibe la cantidad inicial de Pikinim Cyan.
     */
    Cyan(int quantity){
        set_dmg(1);
        set_cap(1);
        set_quan(quantity);
    }
    /**
     * Función que permite aumentar la cantidad de Pikinim Cyan.
     * @param cantidad : La cantidad a modificar para aumentar los Pikinim.
     */
    void multiplicar(int cantidad){
        set_quan(get_quan() + cantidad * 3);
    }
}