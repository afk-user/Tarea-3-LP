class Magenta extends Pikinim {
    Magenta(int quantity){
        set_dmg(2);
        set_cap(1);
        set_quan(quantity);
    }
    void multiplicar(int cantidad){
        set_quan(get_quan() + cantidad * get_dmg());
    }
}