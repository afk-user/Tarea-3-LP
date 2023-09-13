class Enemigo extends Zona implements ILevantable {
    int vida;
    int peso;
    int ataque;

    public void Levantar(Pikinim yel_pik,Pikinim cyan_pik,Pikinim mag_pik){
        if( this.ataque == yel_pik.cantidad * yel_pik.capacidad + cyan_pik.cantidad * cyan_pik.capacidad + mag_pik.cantidad * mag_pik.capacidad){
            // hacer elegir al jugador que color de pikmin quiere multiplicar
        }
    }
    boolean Pelear(Pikinim aPikinim, Pikinim cPikinim, Pikinim mPikinim){

        return false;
    }
    void Interactuar(Pikinim aPikinim, Pikinim cPikinim, Pikinim mPikinim){}
}