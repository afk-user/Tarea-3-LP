import java.util.Scanner;

class Juego {
    static public void main(String[] args){
        int turn = 1;
        int pos = 5;
        boolean exit = false;
        String zone;
        Zona zone_array[] = new Zona[11];
        
        Pieza piece1 = new Pieza(50);
        zone_array[0] = piece1;

        Enemigo enemy1 = new Enemigo(130, 20, 25);
        zone_array[1] = enemy1;
        
        Enemigo enemy2 = new Enemigo(50, 10, 15);
        zone_array[2] = enemy2;

        Pildora pill1 = new Pildora(25);
        zone_array[3] = pill1;

        Muralla wall1 = new Muralla(50);
        zone_array[4] = wall1;

        Pieza piece2 = new Pieza(100);
        zone_array[5] = piece2;

        Enemigo enemy3 = new Enemigo(45, 8, 10);
        zone_array[6] = enemy3;

        Pieza piece3 = new Pieza(35);
        zone_array[7] = piece3;

        Pildora pill2 = new Pildora(15);
        zone_array[8] = pill2;

        Enemigo enemy4 = new Enemigo(75,15, 20);
        zone_array[9] = enemy4;

        Muralla wall2 = new Muralla(150);
        zone_array[10] = wall2;

        // crear 10 de cada pikmin
        Amarillo yellow_pikinim = new Amarillo(10);
        Cyan cyan_pikinim = new Cyan(10);
        Magenta magenta_pikinim = new Magenta(10);

        zone = String.valueOf(zone_array[pos].getClass());
        while(!exit){ // za game loop
            // plantilla de prueba

            System.out.println("Turno " + turn + ": " + yellow_pikinim.get_quan() + " Amarillos, " + cyan_pikinim.get_quan() + " Cians, " + magenta_pikinim.get_quan() + " Magentas.\n");
            System.out.println("Zona Actual: " + zone.substring(6,zone.length()) +"\nOpciones:\n1.Ir a derecha  2.Ir a izquierda  3.Quedarse aquí\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input: ");
            String input = scanner.nextLine();
            switch (input){
                case "1":
                if(pos<zone_array.length-1){
                        pos++;
                    } else {
                        System.out.println("Can't go any further");
                    }
                    break;
                case "2":
                    if(pos>0){
                        pos--;
                    } else {
                        System.out.println("Can't go any further");
                    }
                    break;
                case "3":
                    break;
                default:
                System.out.println("Not a valid input");
            }
            zone = String.valueOf(zone_array[pos].getClass());

            switch (zone.substring(6,zone.length())){
                case "Muralla":
                    System.out.println(((Muralla)zone_array[pos]).get_hp());
                    break;
                case "Pildora":
                    System.out.println(((Pildora)zone_array[pos]).get_quan());
                    break;
                case "Pieza":
                    System.out.println(((Pieza)zone_array[pos]).get_weight());
                    break;
                case "Enemigo":
                    System.out.println(((Enemigo)zone_array[pos]).get_hp()+"\n"+((Enemigo)zone_array[pos]).get_weight()+"\n"+((Enemigo)zone_array[pos]).get_dmg(pos));
                    break;
                default:
                    System.out.println("Not a valid Zone");
                    break;
            }

            System.out.println("Exit? y/n");
            input = scanner.nextLine();
            switch (input){
                case "y":
                    exit = true;
                    scanner.close();
                    break;
                case "n":
                    break;
                default:
                    System.out.println("Not a valid input");
                    break;
            }
            turn++;
        }
        return;
    }
}