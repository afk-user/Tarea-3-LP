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
    int get_dmg(int damage){
        return ataque;
    }

    Enemigo(int health, int weight, int damage){
        set_hp(health);
        set_weight(weight);
        set_dmg(damage);
    }

    public void Levantar(Pikinim yellow,Pikinim cyan, Pikinim magenta){
        if(ataque == yellow.get_quan() * yellow.get_cap() + cyan.get_quan() * cyan.get_cap() + magenta.get_quan() * magenta.get_cap()){
            // hacer elegir al jugador que color de pikmin quiere multiplicar
        }
    }
    boolean Pelear(Pikinim yellow,Pikinim cyan, Pikinim magenta){

        return false;
    }
    void Interactuar(Pikinim yellow,Pikinim cyan, Pikinim magenta){
        if(Pelear(yellow, cyan, magenta) == true){
            
        }
    }
}