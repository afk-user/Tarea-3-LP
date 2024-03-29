/*
 * @(#)Zona.java            2.06
 * 
 * Copyright (c) 2023 Javier Matamala.
 * Todos los derechos reservados.
*/
package zona;
import pikinim.*;
/**
 * @version 2.06
 * @author Javier Matamala */
public class Zona {
    private boolean completada = false;

    /**
     * Setter del marcador de completación de la zona.
     * @param status : El valor a asignar a la completación.
     */
    public void set_status(boolean status){
        completada = status;
        return;
    }
    /**
     * Getter del marcador de completación de la zona.
     * @return boolean : Retorna el valor que de completación de la zona.
     */
    public boolean get_status(){
        return completada;
    }
    /**
     * Función que ejecuta la interacción con la zona.<p>
     * Esta función se ve sobrecargada a menos que ya no hayan más acciones por realizar.
     * @param yellow : recibe un objeto de subclase Pikinim::Amarillo
     * @param cyan : recibe un objeto de subclase Pikinim::Cyan
     * @param magenta : recibe un objeto de subclase Pikinim::Magenta
     */
    public void Interactuar(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        System.out.println("No queda nada más que hacer aquí...");
        return;
    }
    /**
     * Función que llama a Interactuar(...) de la clase padre.<p>
     * Como esta es la clase padre, se configuró para que no haga nada.
     * @param yellow : recibe un objeto de subclase Pikinim::Amarillo
     * @param cyan : recibe un objeto de subclase Pikinim::Cyan
     * @param magenta : recibe un objeto de subclase Pikinim::Magenta */
    public void soupact(Pikinim yellow, Pikinim cyan, Pikinim magenta){}
}