class Muralla extends Zona {
    int vida;

    Muralla(int health){
        this.vida = health;
    }

    boolean TryRomper(Pikinim aPikinim, Pikinim cPikinim, Pikinim mPikinim){
        return false;
    }
}