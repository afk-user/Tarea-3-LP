class Enemigo extends Zona implements ILevantable {
    int vida;
    int peso;
    int ataque;

    Enemigo(int health, int weight, int damage){
        this.vida = health;
        this.peso = weight;
        this.ataque = damage;
    }

    public void Levantar(Pikinim yel_pik,Pikinim cyan_pik,Pikinim mag_pik){
        if(this.ataque == yel_pik.get_quan() * yel_pik.get_cap() + cyan_pik.get_quan() * cyan_pik.get_cap() + mag_pik.get_quan() * mag_pik.get_cap()){
            // hacer elegir al jugador que color de pikmin quiere multiplicar
        }
    }
    boolean Pelear(Pikinim aPikinim, Pikinim cPikinim, Pikinim mPikinim){

        return false;
    }
    void Interactuar(Pikinim aPikinim, Pikinim cPikinim, Pikinim mPikinim){}
}