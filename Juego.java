/*
 * @(#)Juego.java           2.06
 * 
 * Copyright (c) 2023 Javier Matamala.
 * Todos los derechos reservados.
*/
import pikinim.*;
import zona.*;
import java.util.Scanner;

/**
 * La clase principal, encargada de sostener la función main para ejecutar todo el programa.
 * @version 2.06
 * @author Javier Matamala */
class Juego {
    static public void main(String[] args){
        int turn = 1, pos = 5, lastpos=5, posleft = 4, posright = 6, pieces_left = 0;
        boolean exit = false, win = false, valid_zone;
        String zone,zone_left,zone_right;
        Scanner scanner = new Scanner(System.in);
        Zona zone_array[] = new Zona[11];
        
        zone_array[0] = new Pieza(50);
        
        zone_array[1] = new Enemigo(130, 20, 25);
        
        zone_array[2] = new Enemigo(50, 10, 15);

        zone_array[3] = new Pildora(25);

        zone_array[4] = new Muralla(50);

        zone_array[5] = new Pieza(100);

        zone_array[6] = new Enemigo(45, 8, 10);

        zone_array[7] = new Pieza(35);

        zone_array[8] = new Pildora(15);

        zone_array[9] = new Enemigo(75,15, 20);

        zone_array[10] = new Muralla(150);

        pieces_left = 3;
        Amarillo yellow_pikinim = new Amarillo(10);
        Cyan cyan_pikinim = new Cyan(10);
        Magenta magenta_pikinim = new Magenta(10);
        
        zone_left = String.valueOf(zone_array[posleft].getClass());
        zone = String.valueOf(zone_array[pos].getClass());
        zone_right = String.valueOf(zone_array[posright].getClass());

        System.out.println("\nBitácora de viaje del Capitán Lomiar, Día 293:\n"+
            "Choqué con un asteroide en un viaje de rutina y ahora me encuentro solo en un planeta extraño.\n"+
            "Mi nave está destrozada y no sé a dónde fueron a parar sus piezas.\n"+
            "Por suerte he encontrado unas criaturas curiosas, a lo mejor pueden ayudarme a volver a casa.\n"+
            "Se ven emocionados de conocerme, a decir verdad, y tampoco han demostrado signos de hostilidad contra mi.\n"+
            "Pero mejor vuelvo al grano. Debo ser veloz, ya me quedan menos de 30 horas para que se acabe el tanque de oxígeno...\n");

        while(!exit){
            valid_zone = true;

            System.out.println("Turno " + turn + ": " + yellow_pikinim.get_quan() + " Amarillos, " + cyan_pikinim.get_quan() + " Cians, " + magenta_pikinim.get_quan() + " Magentas.\n");
            System.out.println("Zona Actual: " + zone.substring(11,zone.length()) +"\nPiezas Restantes: "+ pieces_left +
            "\nOpciones:\n1.Ir a izquierda ("+ zone_left.substring(11,zone_left.length()) +")  2.Quedarse aquí  3.Ir a derecha ("+ zone_right.substring(11,zone_right.length()) +")\n");
            System.out.print("Input: ");
            String input = scanner.nextLine();
            System.out.println();
            switch (input){
                case "1":
                    if(zone_array[pos] instanceof Muralla && lastpos != posleft && !zone_array[pos].get_status()){
                        if(zone_array[pos] instanceof Muralla && !zone_array[pos].get_status())
                            Muralla.flavor_text();
                        valid_zone = false;
                    } else {
                        lastpos = pos--;
                    }
                    break;
                case "2":
                    System.out.println("Lomiar decide quedarse en donde se encuentra y recuperar el aliento.");
                    break;
                case "3":
                    if(zone_array[pos] instanceof Muralla && lastpos != posright && !zone_array[pos].get_status()){
                        if(zone_array[pos] instanceof Muralla && !zone_array[pos].get_status())
                            Muralla.flavor_text();
                        valid_zone = false;
                    } else {
                        lastpos = pos++;
                    }
                    break;
                default:
                    System.out.println("Ese no es un input válido, intenta de nuevo");
                    valid_zone = false;
            }

            posleft = pos-1; posright = pos+1;
            if(pos < 0) pos+=11; else if(pos > 10) pos-=11;
            if(posleft < 0) posleft+=11; else if(posleft > 10) posleft-=11;
            if(posright < 0) posright+=11; else if(posright > 10) posright-=11;
            zone_left = String.valueOf(zone_array[posleft].getClass());
            zone = String.valueOf(zone_array[pos].getClass());
            zone_right = String.valueOf(zone_array[posright].getClass());

            if(valid_zone){
                if(!zone_array[pos].get_status()){
                    zone_array[pos].Interactuar(yellow_pikinim, cyan_pikinim, magenta_pikinim);
                    if(zone_array[pos] instanceof Pieza && zone_array[pos].get_status()) pieces_left--;
                }else{
                    zone_array[pos].soupact(yellow_pikinim, cyan_pikinim, magenta_pikinim);
                }
                turn++;
            }
            System.out.println();

            if(turn > 30 || yellow_pikinim.get_quan() + cyan_pikinim.get_quan() + magenta_pikinim.get_quan() == 0) exit = true;
            else if(pieces_left == 0) {exit=true; win = true;}
        }
        scanner.close();
        if(win){
            System.out.println("Gracias a la colaboración de los Pikinim, el Capitán Lomiar logró encontrar todas las piezas de su nave.\nFeliz de poder retornar a casa, Lomiar le ofrece a los Pikinim volver con él a su planeta natal.");
        }else{
            System.out.println("A pesar de todos sus esfuerzos, el Capitán Lomiar ha perdido su rumbo y no será capaz de volver a su hogar.\nSi tan solo hubiese sido más cuidadoso...");
        }
        return;
    }
}