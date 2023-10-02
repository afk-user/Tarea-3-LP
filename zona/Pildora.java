/*
 * @(#)Pildora.java         2.06
 * 
 * Copyright (c) 2023 Javier Matamala.
 * Todos los derechos reservados.
*/
package zona;
import pikinim.*;
import java.util.Scanner;
/**
 * Zona que aumenta la cantidad de un tipo de Pikinim.
 * La clase contiene el código para el correcto funcionamiento de la zona.
 * @version 2.06
 * @author Javier Matamala */
public class Pildora extends Zona {
    private int cantidad;
    private Scanner scanner = new Scanner(System.in);

    /**
     * Setter de cantidad de un objeto tipo Pildora.
     * @param quantity : Recibe la cantidad de pildoras a establecer.
     */
    void set_quan(int quantity){
        cantidad = quantity;
    }
    /**
     * Getter de cantidad de un objeto tipo Pildora.
     * @return int : Retorna la cantidad de pildoras.
     */
    int get_quan(){
        return cantidad;
    }
    /**
     * Constructor de la clase Pildora.
     * @param quantity : Establece el stat de cantidad de pildoras.
     */
    public Pildora(int quantity){
        set_quan(quantity);
    }
    /**
     * Función que ejecuta la interacción con la zona.<p>
     * Activar la interacción de la zona implica multiplicar los Pikinim de un color en específico.
     * @param yellow : Recibe un objeto de subclase Pikinim::Amarillo
     * @param cyan : Recibe un objeto de subclase Pikinim::Cyan
     * @param magenta : Recibe un objeto de subclase Pikinim::Magenta
     */
    public void Interactuar(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        
        System.out.println("Después de mucho caminar, Lomiar se encuentra en un campo de flores cuyos pistilos parecen píldoras.\n"+
            "Los pikinim, atraidos por estas flores, hacen que se caigan los pistilos y se los llevan a Lomiar.\n"+
            "Analizando las píldoras, Lomiar logra encontrar la siguiente estadística:\n\nCant: "+get_quan()+"\n");

        int pik_quan = yellow.get_quan() + cyan.get_quan() + magenta.get_quan();
        System.out.println("Después de analizarlas, Lomiar permite que los "+ pik_quan +" pikinim recojan dichas píldoras. Cuales pikinim deberían multiplicarse?");
        System.out.print("\n1.Amarillo ("+yellow.get_quan()+")  2.Cyan ("+cyan.get_quan()+")  3.Magenta ("+magenta.get_quan()+")\n\nInput: ");
        String input = scanner.nextLine();
        System.out.println();

        switch (input) {
            case "1":
                yellow.multiplicar(cantidad);
                pik_quan = yellow.get_quan() + cyan.get_quan() + magenta.get_quan() - pik_quan;
                System.out.println("Los pikinim amarillos han aumentado su cantidad en "+pik_quan);
                break;
            case "2":
                cyan.multiplicar(cantidad);
                pik_quan = yellow.get_quan() + cyan.get_quan() + magenta.get_quan() - pik_quan;
                System.out.println("Los pikinim cyan han aumentado su cantidad en "+pik_quan);
                break;
            case "3":
                magenta.multiplicar(cantidad);
                pik_quan = yellow.get_quan() + cyan.get_quan() + magenta.get_quan() - pik_quan;
                System.out.println("Los pikinim magenta han aumentado su cantidad en "+pik_quan);
                break;
        }
        set_status(true);
    }
    /**
     * Función que llama a Interactuar(...) de la clase padre.
     * @param yellow : recibe un objeto de subclase Pikinim::Amarillo
     * @param cyan : recibe un objeto de subclase Pikinim::Cyan
     * @param magenta : recibe un objeto de subclase Pikinim::Magenta */
    public void soupact(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        super.Interactuar(yellow, cyan, magenta);
    }
}