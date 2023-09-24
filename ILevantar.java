/*
 * @(#)ILevantar.java       2.04 24 Sep 2023
 * 
 * Copyright (c) 2023 Javier Matamala.
 * Todos los derechos reservados.
*/

/**
 * Interfaz encargada de entregar la funcion ILevantable a las subclases Zona::Enemigo y Zona::Pieza
 * @version 2.04 24 Sep 2023
 * @author Javier Matamala */
interface ILevantable {
    /**
     * Función abstracta que ejecuta la acción de levantar.<p>
     * Tiene una implementación ligeramente distinta dependiendo de que subclase la use.
     * @param yellow : recibe un objeto de subclase Pikinim::Amarillo
     * @param cyan : recibe un objeto de subclase Pikinim::Cyan
     * @param magenta : recibe un objeto de subclase Pikinim::Magenta
     */
    void Levantar(Pikinim yellow,Pikinim cyan, Pikinim magenta);
}