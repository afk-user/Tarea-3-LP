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
        set_status(false);
    }

    boolean TryRomper(Pikinim yellow,Pikinim cyan, Pikinim magenta){
        int pikinim_dmg = yellow.get_quan() * yellow.get_dmg() + cyan.get_quan() * cyan.get_dmg() + magenta.get_quan() * magenta.get_dmg();
        set_hp(get_hp() - pikinim_dmg);
        if(get_hp() <= 0){
            set_hp(0);
            System.out.println("Los pikinim logran derribar la muralla con éxito");
            return true;
        }
        System.out.println("Los pikinim no logran derribar la muralla");
        return false;
    }
    void Interactuar(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        if(TryRomper(yellow, cyan, magenta)){
            set_status(true);
        }
    }
    void soupact(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        super.Interactuar(yellow, cyan, magenta);
    }
}