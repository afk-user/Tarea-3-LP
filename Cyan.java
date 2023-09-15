class Cyan extends Pikinim {
    Cyan(int quantity){
        set_dmg(1);
        set_cap(1);
        set_quan(quantity);
    }
    void multiplicar(int cantidad){
        set_quan(get_quan() + cantidad * 3);
    }
}