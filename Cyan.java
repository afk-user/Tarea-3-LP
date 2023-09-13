class Cyan extends Pikinim {
    Cyan(int quantity){
        this.set_dmg(1);
        this.set_cap(1);
        this.set_quan(quantity);
    }
    void multiplicar(int cantidad){
        this.set_quan(this.get_quan() + cantidad * 3);
    }
}