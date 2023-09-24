/*
 * @(#)Muralla.java         2.04 24 Sep 2023
 * 
 * Copyright (c) 2023 Javier Matamala.
 * Todos los derechos reservados.
*/
import java.lang.Math;

/**
 * Zona que impide el paso mientras el atributo vida sea mayor a 0.
 * La clase contiene el código para el correcto funcionamiento de la zona.
 * @version 2.04 24 Sep 2023
 * @author Javier Matamala */
class Muralla extends Zona {
    private int vida;
    
    /**
     * Setter de vida de un objeto tipo Muralla.
     * @param health : Recibe la vida a establecer.
     */
    void set_hp(int health){
        vida = health;
    }
    /**
     * Getter de vida de un objeto tipo Muralla.
     * @return : Retorna la vida de la muralla. 
     */
    int get_hp(){
        return vida;
    }

    /**
     * Constructor de la clase Muralla.
     * @param health : Establece el stat de vida de la muralla.
     */
    Muralla(int health){
        set_hp(health);
    }

    /**
     * Función que intenta romper la muralla.<p>
     * En caso de no poder romperla en un turno, el daño se preserva.
     * @param yellow : Recibe un objeto de subclase Pikinim::Amarillo
     * @param cyan : Recibe un objeto de subclase Pikinim::Cyan
     * @param magenta : Recibe un objeto de subclase Pikinim::Magenta
     * @return bool : Retorna true si los Pikinim logran derribar la muralla.
     */
    boolean TryRomper(Pikinim yellow,Pikinim cyan, Pikinim magenta){
        int pikinim_dmg = yellow.get_quan() * yellow.get_dmg() + cyan.get_quan() * cyan.get_dmg() + magenta.get_quan() * magenta.get_dmg();
        set_hp(get_hp() - pikinim_dmg);
        if(get_hp() <= 0){
            set_hp(0);
            System.out.println("La mano de obra de los pikinim surte efecto y logran derribar la muralla con éxito. Lomiar finalmente puede pasar esta zona-");
            return true;
        }
        System.out.println("Los pikinim no logran derribar la muralla, pero se ve que al menos le hicieron daño.");
        return false;
    }
    /**
     * Función que ejecuta la interacción con la zona.
     * Activar la interacción de la zona causará daño a la muralla.
     * @param yellow : Recibe un objeto de subclase Pikinim::Amarillo
     * @param cyan : Recibe un objeto de subclase Pikinim::Cyan
     * @param magenta : Recibe un objeto de subclase Pikinim::Magenta
     */
    void Interactuar(Pikinim yellow, Pikinim cyan, Pikinim magenta){

        System.out.println("Una gran muralla tapa el camino del Capitán Lomiar. Sin ningún camino que pueda rodear la muralla, lo mejor sería destruirla antes de continuar.\n"+
            "Tras analizar el muro, Lomiar encontró la siguiente estadística:\n\nVida: "+get_hp()+"\n");

        if(TryRomper(yellow, cyan, magenta)){
            set_status(true);
        }
    }
    /**
     * Función que llama a Interactuar(...) de la clase padre.
     * @param yellow : Recibe un objeto de subclase Pikinim::Amarillo
     * @param cyan : Recibe un objeto de subclase Pikinim::Cyan
     * @param magenta : Recibe un objeto de subclase Pikinim::Magenta */
    void soupact(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        super.Interactuar(yellow, cyan, magenta);
    }

    void flavor_text(){
        String flavor[] = {"Lomiar se acerca a la muralla, pero la muralla ni se inmuta.",
        "Lomiar se acerca a la muralla a observarla más de cerca. Por un momento, pareciera que la muralla lo observa.",
        "Oh, te acercas al muro? En vez de rodearlo, vas directo a él? Lomiar no puede destruir la muralla sin acercarse más a esta.",
        "El Capitán analiza otro poco la muralla. Él realmente espera que esta no sea la cuarta pared...",
        "Lomiar intenta escalar la muralla. Por alguna razón, esta es muy resbaladiza para ser escalada."};
        int randint = (int)(Math.random()*flavor.length);
        System.out.println(flavor[randint]);
    }
}