import java.lang.Math;
import java.util.Scanner;

class Enemigo extends Zona implements ILevantable {
    private int vida;
    private int peso;
    private int ataque;

    void set_hp(int health){
        vida = health;
    }
    int get_hp(){
        return vida;
    }
    void set_weight(int weight){
        peso = weight;
    }
    int get_weight(){
        return peso;
    }
    void set_dmg(int damage){
        ataque = damage;
    }
    int get_dmg(){
        return ataque;
    }

    Enemigo(int health, int weight, int damage){
        set_hp(health);
        set_weight(weight);
        set_dmg(damage);
        set_status(false);
    }

    public void Levantar(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        if(get_weight() <= yellow.get_quan() * yellow.get_cap() + cyan.get_quan() * cyan.get_cap() + magenta.get_quan() * magenta.get_cap()){
            Scanner scanner = new Scanner(System.in);
            int pik_quan = yellow.get_quan() + cyan.get_quan() + magenta.get_quan();
            System.out.println("Los "+ pik_quan +" pikinim ganan y recogen al enemigo.\n\nCuales pikinim deberían multiplicarse?");
            System.out.print("\n1.Amarillo ("+yellow.get_quan()+")  2.Cyan ("+cyan.get_quan()+")  3.Magenta ("+magenta.get_quan()+")\n\nInput: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    yellow.multiplicar(peso);
                    System.out.println("Los pikinim amarillos han aumentado su cantidad");
                    break;
                case "2":
                    cyan.multiplicar(peso);
                    System.out.println("Los pikinim cyan han aumentado su cantidad");
                    break;
                case "3":
                    magenta.multiplicar(peso);
                    System.out.println("Los pikinim magenta han aumentado su cantidad");
                    break;
            }
        }else{
            System.out.println("Los pikinim logran ganarle al enemigo, pero no recogerlo, dejándolo tirado en donde lo encontraron");
        }
    }
    boolean Pelear(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        int pikinim_dmg = yellow.get_quan() * yellow.get_dmg() + cyan.get_quan() * cyan.get_dmg() + magenta.get_quan() * magenta.get_dmg();
        set_hp(get_hp() - pikinim_dmg);
        int randint = (int)(Math.random()*3+1);
        switch (randint) {
            case 1:
                yellow.disminuir(get_dmg());
                if(yellow.get_quan()<0) yellow.set_quan(0);
                break;
            case 2:
                cyan.disminuir(get_dmg());
                if(cyan.get_quan()<0) cyan.set_quan(0);
                break;
            case 3:
                magenta.disminuir(get_dmg());
                if(magenta.get_quan()<0) magenta.set_quan(0);
                break;
        }
        if(get_hp() <= 0){
            set_hp(0);
            return true;
        }
        return false;
    }
    void Interactuar(Pikinim yellow, Pikinim cyan, Pikinim magenta){
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
    void soupact(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        super.Interactuar(yellow, cyan, magenta);
    }
}