/*
 * @(#)Pieza.java           2.05
 * 
 * Copyright (c) 2023 Javier Matamala.
 * Todos los derechos reservados.
*/

/**
 * Zona donde se encuentra una pieza de la nave.
 * La clase contiene el código para el correcto funcionamiento de la zona.
 * @version 2.05
 * @author Javier Matamala */
class Pieza extends Zona implements ILevantable {
    private int peso;
    
    /**
     * Setter de peso de un objeto tipo Pieza.
     * @param weight : Recibe el peso a establecer.
     */
    void set_weight(int weight){
        peso = weight;
    }
    /**
     * Getter de peso de un objeto tipo Pieza.
     * @return int : Retorna el peso de la Pieza.
     */
    int get_weight(){
        return peso;
    }
    /**
     * Constructor de la clase Pieza.
     * @param weight : Ingresa el stat de peso de la Pieza.
     */
    Pieza(int weight){
        set_weight(weight);
    }

    /**
     * Función que ejecuta la acción de levantar la pieza encontrada.
     * @param yellow : recibe un objeto de subclase Pikinim::Amarillo
     * @param cyan : recibe un objeto de subclase Pikinim::Cyan
     * @param magenta : recibe un objeto de subclase Pikinim::Magenta
     */
    public void Levantar(Pikinim yellow ,Pikinim cyan, Pikinim magenta){
        if(get_weight() <= yellow.get_quan() * yellow.get_cap() + cyan.get_quan() * cyan.get_cap() + magenta.get_quan() * magenta.get_cap()){
            set_status(true);
        }
        return;
    }
    /**
     * Función que ejecuta la interacción con la zona.
     * @param yellow : recibe un objeto de subclase Pikinim::Amarillo
     * @param cyan : recibe un objeto de subclase Pikinim::Cyan
     * @param magenta : recibe un objeto de subclase Pikinim::Magenta
     */
    void Interactuar(Pikinim yellow, Pikinim cyan, Pikinim magenta){

        System.out.println("Lomiar se encuentra frente a frente con una de las magnificientes piezas que componen su nave.\n"+
            "Él y los Pikinim cruzan miradas, ambos sabiendo que recolectar estos preciados fragmentos pueden asegurar su supervivencia.\n"+
            "Moviendose alrededor de la pieza para asegurar su integridad, Lomiar encuentra la siguiente estadística:\n\nPeso: "+get_weight()+"\n");

        Levantar(yellow, cyan, magenta);
        if(get_status()){
            System.out.println("Gracias al esfuerzo de los Pikinim, Lomiar recupera exitosamente la pieza de la nave");
        }else{
            System.out.println("A pesar de los intentos de los pikinim, ellos no lograron levantar la pieza. Quizás hacen falta un par de manos más...");
        }
        return;
    }
    /**
     * Función que llama a Interactuar(...) de la clase padre.
     * @param yellow : recibe un objeto de subclase Pikinim::Amarillo
     * @param cyan : recibe un objeto de subclase Pikinim::Cyan
     * @param magenta : recibe un objeto de subclase Pikinim::Magenta */
    void soupact(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        super.Interactuar(yellow, cyan, magenta);
    }
}