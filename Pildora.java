import java.util.Scanner;

class Pildora extends Zona {
    int cantidad;

    void set_quan(int quantity){
        cantidad = quantity;
    }
    int get_quan(){
        return cantidad;
    }
    Pildora(int quantity){
        set_quan(quantity);
        set_status(false);
    }
    void soupact(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        super.Interactuar(yellow, cyan, magenta);
    }
    void Interactuar(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        Scanner scanner = new Scanner(System.in);
        int pik_quan = yellow.get_quan() + cyan.get_quan() + magenta.get_quan();
        System.out.println("Los "+ pik_quan +" pikinim recogen las pildoras.\n\nCuales pikinim deberían multiplicarse?");
        System.out.print("\n1.Amarillo ("+yellow.get_quan()+")  2.Cyan ("+cyan.get_quan()+")  3.Magenta ("+magenta.get_quan()+")\n\nInput: ");
        String input = scanner.nextLine();

        switch (input) {
            case "1":
                yellow.multiplicar(cantidad);
                System.out.println("Los pikinim amarillos han aumentado su cantidad");
                break;
            case "2":
                cyan.multiplicar(cantidad);
                System.out.println("Los pikinim cyan han aumentado su cantidad");
                break;
            case "3":
                magenta.multiplicar(cantidad);
                System.out.println("Los pikinim magenta han aumentado su cantidad");
                break;
        }
        set_status(true);
    }
}