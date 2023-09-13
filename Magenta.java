class Magenta extends Pikinim {
    Magenta(int quantity){
        this.set_dmg(2);
        this.set_cap(1);
        this.set_quan(quantity);
    }
    void multiplicar(int cantidad){
        this.set_quan(get_quan() + cantidad * get_dmg());
    }
}