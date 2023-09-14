class Enemigo extends Zona implements ILevantable {
    private int vida;
    private int peso;
    private int ataque;

    Enemigo(int health, int weight, int damage){
        this.vida = health;
        this.peso = weight;
        this.ataque = damage;
    }

    public void Levantar(Pikinim yellow,Pikinim cyan, Pikinim magenta){
        if(this.ataque == yellow.get_quan() * yellow.get_cap() + cyan.get_quan() * cyan.get_cap() + magenta.get_quan() * magenta.get_cap()){
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