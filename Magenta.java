/*
 * @(#)Magenta.java         2.04 24 Sep 2023
 * 
 * Copyright (c) 2023 Javier Matamala.
 * Todos los derechos reservados.
*/

/**
 * Clase que hereda las propiedades de Pikinim.<p>
 * Representa el grupo de Pikinim Magenta.
 * @version 2.04 24 Sep 2023
 * @author Javier Matamala */
class Magenta extends Pikinim {
    /**
     * Constructor de la subclase Magenta.<p>
     * El ataque y la capacidad vienen predefinidas a 2 y 1, respectivamente.
     * @param quantity : Recibe la cantidad inicial de Pikinim Magentas.
     */
    Magenta(int quantity){
        set_dmg(2);
        set_cap(1);
        set_quan(quantity);
    }
    /**
     * Función que permite aumentar la cantidad de Pikinim Magentas.
     * @param cantidad : La cantidad a modificar para aumentar los Pikinim.
     */
    void multiplicar(int cantidad){
        set_quan(get_quan() + cantidad * get_dmg());
    }
}