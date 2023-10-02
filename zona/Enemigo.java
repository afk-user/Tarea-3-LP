/*
 * @(#)Enemigo.java         2.06
 * 
 * Copyright (c) 2023 Javier Matamala.
 * Todos los derechos reservados.
*/
package zona;
import pikinim.*;
import java.lang.Math;
import java.util.Scanner;
/**
 * Zona donde se encuentra un enemigo.
 * La clase contiene el código para el correcto funcionamiento de la zona.
 * @version 2.06
 * @author Javier Matamala */
public class Enemigo extends Zona implements ILevantable {
    private int vida;
    private int peso;
    private int ataque;
    private Scanner scanner = new Scanner(System.in);

    /**
     * Setter de vida de un objeto tipo Enemigo.
     * @param health : Recibe la vida a establecer.*/
    public void set_hp(int health){
        vida = health;
    }
    /**
     * Getter de vida de un objeto tipo Enemigo.
     * @return int : Retorna la vida del enemigo.*/
    public int get_hp(){
        return vida;
    }
    /**
     * Setter de peso de un objeto tipo Enemigo.
     * @param weight : Recibe el peso a establecer.*/
    public void set_weight(int weight){
        peso = weight;
    }
    /**
     * Getter de peso de un objeto tipo Enemigo.
     * @return int : Retorna el peso del enemigo.*/
    public int get_weight(){
        return peso;
    }
    /**
     * Setter de ataque de un objeto tipo Enemigo.
     * @param damage : Recibe el ataque a establecer.*/
    public void set_dmg(int damage){
        ataque = damage;
    }
    /**
     * Getter de ataque de un objeto tipo Enemigo.
     * @return int : Retorna el ataque del enemigo.*/
    public int get_dmg(){
        return ataque;
    }

    /**
     * Constructor de la clase Enemigo.<p>
     * Establece todas las características pertinentes al enemigo.
     * @param health : Ingresa el stat de vida del enemigo.
     * @param weight : Ingresa el stat de peso del enemigo.
     * @param damage : Ingresa el stat de ataque del enemigo.
     */
    public Enemigo(int health, int weight, int damage){
        set_hp(health);
        set_weight(weight);
        set_dmg(damage);
    }

    /**
     * Función que ejecuta la acción de levantar al enemigo derrotado.
     * @param yellow : Recibe un objeto de subclase Pikinim::Amarillo
     * @param cyan : Recibe un objeto de subclase Pikinim::Cyan
     * @param magenta : Recibe un objeto de subclase Pikinim::Magenta */
    public void Levantar(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        if(get_weight() <= yellow.get_quan() * yellow.get_cap() + cyan.get_quan() * cyan.get_cap() + magenta.get_quan() * magenta.get_cap()){
            int pik_quan = yellow.get_quan() + cyan.get_quan() + magenta.get_quan();
            System.out.println("Los "+ pik_quan +" pikinim ganan y recogen al enemigo. Cuales pikinim deberían multiplicarse?");
            System.out.print("\n1.Amarillo ("+yellow.get_quan()+")  2.Cyan ("+cyan.get_quan()+")  3.Magenta ("+magenta.get_quan()+")\n\nInput: ");
            String input = scanner.nextLine();
            System.out.println();

            switch (input) {
                case "1":
                    yellow.multiplicar(peso);
                    pik_quan = yellow.get_quan() + cyan.get_quan() + magenta.get_quan() - pik_quan;
                    System.out.println("Los pikinim amarillos han aumentado su cantidad en "+pik_quan);
                    break;
                case "2":
                    cyan.multiplicar(peso);
                    pik_quan = yellow.get_quan() + cyan.get_quan() + magenta.get_quan() - pik_quan;
                    System.out.println("Los pikinim cyan han aumentado su cantidad en "+pik_quan);
                    break;
                case "3":
                    magenta.multiplicar(peso);
                    pik_quan = yellow.get_quan() + cyan.get_quan() + magenta.get_quan() - pik_quan;
                    System.out.println("Los pikinim magenta han aumentado su cantidad en "+pik_quan);
                    break;
            }
        }else{
            System.out.println("Los pikinim logran ganarle al enemigo, pero no recogerlo, dejándolo tirado en donde lo encontraron");
        }
    }
    /**
     * Función que ejecuta un turno de pelea entre el Enemigo y los Pikinim.
     * @param yellow : Recibe un objeto de subclase Pikinim::Amarillo.
     * @param cyan : Recibe un objeto de subclase Pikinim::Cyan.
     * @param magenta : Recibe un objeto de subclase Pikinim::Magenta.
     * @return boolean : Retorna true si los Pikinim logran derrotar al Enemigo.*/
    boolean Pelear(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        int pikinim_dmg = yellow.get_quan() * yellow.get_dmg() + cyan.get_quan() * cyan.get_dmg() + magenta.get_quan() * magenta.get_dmg();
        set_hp(get_hp() - pikinim_dmg);
        int randint; boolean no_pik = true;
        while(no_pik){
            randint = (int)(Math.random()*3+1);
            switch (randint) {
                case 1:
                    if(yellow.get_quan()==0) break;
                    no_pik = false;
                    yellow.disminuir(get_dmg());
                    if(yellow.get_quan()<0) yellow.set_quan(0);
                    break;
                case 2:
                    if(cyan.get_quan()==0) break;
                    no_pik = false;
                    cyan.disminuir(get_dmg());
                    if(cyan.get_quan()<0) cyan.set_quan(0);
                    break;
                case 3:
                    if(magenta.get_quan()==0) break;
                    no_pik = false;
                    magenta.disminuir(get_dmg());
                    if(magenta.get_quan()<0) magenta.set_quan(0);
                    break;
            }
        }
        if(get_hp() <= 0){
            set_hp(0);
            return true;
        }
        return false;
    }
    /**
     * Función que ejecuta la interacción con la zona.<p>
     * El hecho de derrotar al enemigo marca la zona como completada, independiente de si pudieron levantarlo o no.
     * @param yellow : recibe un objeto de subclase Pikinim::Amarillo
     * @param cyan : recibe un objeto de subclase Pikinim::Cyan
     * @param magenta : recibe un objeto de subclase Pikinim::Magenta */
    public void Interactuar(Pikinim yellow, Pikinim cyan, Pikinim magenta){

        System.out.println("El Capitán nota que a medida que avanza, la tierra tiembla más y más.\n"+
            "Lo que antes parecía un champiñón ahora parece una bestia con dos antenas que parecieran sostener sus ojos.\n"+
            "Como si el leviatán pudiese olerlos a semejante distancia, se da vuelta para encarar al Capitán y su tropa de Pikinim\n"+
            "Después de escabullirse y analizar al monstruo, el Capitán Lomiar logra extraer las siguientes estadísticas del animal:\n\n"+
            "Vida: "+get_hp()+"\nPeso: "+get_weight()+"\nATK: "+get_dmg()+"\n");

        if(Pelear(yellow, cyan, magenta)){
            set_status(true);
            Levantar(yellow, cyan, magenta);
        }else{
            System.out.print("Los pikinim no pudieron hacerle frente al enemigo. ");
            if(yellow.get_quan() == 0) System.out.print("Lomiar se quedó sin pikinim amarillos. ");
            else if(cyan.get_quan() == 0) System.out.print("Lomiar se quedó sin pikinim cyan. ");
            else if(magenta.get_quan() == 0) System.out.print("Lomiar se quedó sin pikinim magenta.");
            System.out.println();
        }
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