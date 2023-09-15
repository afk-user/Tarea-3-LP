class Muralla extends Zona {
    int vida;
    
    void set_hp(int health){
        vida = health;
    }
    int get_hp(){
        return vida;
    }

    Muralla(int health){
        set_hp(health);
    }

    boolean TryRomper(Pikinim yellow,Pikinim cyan, Pikinim magenta){
        return false;
    }
}