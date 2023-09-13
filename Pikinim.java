abstract class Pikinim {
    private int ataque;
    private int capacidad;
    private int cantidad;

    // getters & setters
    void set_dmg(int damage){
        this.ataque = damage;
    }
    int get_dmg(){
        return this.ataque;
    }
    void set_cap(int capacity){
        this.capacidad = capacity;
    }
    int get_cap(){
        return this.capacidad;
    }
    void set_quan(int quantity){
        this.cantidad = quantity;
    }
    int get_quan(){
        return this.cantidad;
    }

    void disminuir(int cantidad){
        this.cantidad -= cantidad;
    }
    abstract void multiplicar(int cantidad);
}