import java.util.Scanner;

class Juego {
    static public void main(String[] args){
        int turn = 1, pos = 5, lastpos=5, posleft = 4, posright = 6, pieces_left = 0;
        boolean exit = false, valid_zone;
        String zone;
        Scanner scanner = new Scanner(System.in);
        Zona zone_array[] = new Zona[11];
        
        Zona piece1 = new Pieza(50);
        zone_array[0] = piece1;

        Zona enemy1 = new Enemigo(130, 20, 25);
        zone_array[1] = enemy1;
        
        Zona enemy2 = new Enemigo(50, 10, 15);
        zone_array[2] = enemy2;

        Zona pill1 = new Pildora(25);
        zone_array[3] = pill1;

        Zona wall1 = new Muralla(50);
        zone_array[4] = wall1;

        Zona piece2 = new Pieza(100);
        zone_array[5] = piece2;

        Zona enemy3 = new Enemigo(45, 8, 10);
        zone_array[6] = enemy3;

        Zona piece3 = new Pieza(35);
        zone_array[7] = piece3;

        Zona pill2 = new Pildora(15);
        zone_array[8] = pill2;

        Zona enemy4 = new Enemigo(75,15, 20);
        zone_array[9] = enemy4;

        Zona wall2 = new Muralla(150);
        zone_array[10] = wall2;

        pieces_left = 3;
        Amarillo yellow_pikinim = new Amarillo(10);
        Cyan cyan_pikinim = new Cyan(10);
        Magenta magenta_pikinim = new Magenta(10);

        zone = String.valueOf(zone_array[pos].getClass());
        while(!exit){ // za game loop
            valid_zone = true;

            System.out.println("Turno " + turn + ": " + yellow_pikinim.get_quan() + " Amarillos, " + cyan_pikinim.get_quan() + " Cians, " + magenta_pikinim.get_quan() + " Magentas.\n");
            System.out.println("Zona Actual: " + zone.substring(6,zone.length()) +"\nPiezas Restantes: "+ pieces_left +"\nOpciones:\n1.Ir a derecha  2.Ir a izquierda  3.Quedarse aquí\n");
            System.out.print("Input: ");
            String input = scanner.nextLine();
            switch (input){
                case "1":
                    if(pos>=zone_array.length-1 || (zone_array[pos] instanceof Muralla && lastpos != posright && !zone_array[pos].get_status())){
                        System.out.println("Can't go any further");
                        valid_zone = false;
                    } else {
                        lastpos = pos++;
                    }
                    break;
                case "2":
                    if(pos<=0 || (zone_array[pos] instanceof Muralla && lastpos != posleft && !zone_array[pos].get_status())){
                        System.out.println("Can't go any further");
                        valid_zone = false;
                    } else {
                        lastpos = pos--;
                    }
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Not a valid input");
                    valid_zone = false;
            }
            zone = String.valueOf(zone_array[pos].getClass());
            posleft = pos-1; posright = pos+1;

            if(valid_zone){
                switch (zone.substring(6,zone.length())){
                    case "Muralla":
                        System.out.println("Vida: "+((Muralla)zone_array[pos]).get_hp());
                        break;
                    case "Pildora":
                        System.out.println("Cant: "+((Pildora)zone_array[pos]).get_quan());
                        break;
                    case "Pieza":
                        System.out.println("Peso: "+((Pieza)zone_array[pos]).get_weight());
                        break;
                    case "Enemigo":
                        System.out.println("Vida: "+((Enemigo)zone_array[pos]).get_hp()+"\nPeso: "+((Enemigo)zone_array[pos]).get_weight()+"\nATK: "+((Enemigo)zone_array[pos]).get_dmg());
                        break;
                    default:
                        System.out.println("Not a valid Zone");
                        break;
                }
                if(!zone_array[pos].get_status()){
                    zone_array[pos].Interactuar(yellow_pikinim, cyan_pikinim, magenta_pikinim);
                    if(zone_array[pos] instanceof Pieza && zone_array[pos].get_status()) pieces_left--;
                }else{
                    zone_array[pos].soupact(yellow_pikinim, cyan_pikinim, magenta_pikinim);
                }
                turn++;
            }
            System.out.println();

            if(turn > 30 || yellow_pikinim.get_quan() + cyan_pikinim.get_quan() + magenta_pikinim.get_quan() == 0 || pieces_left == 0) exit=true;
        }
        scanner.close();
        return;
    }
}