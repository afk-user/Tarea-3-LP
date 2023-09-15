abstract class Pikinim {
    private int ataque;
    private int capacidad;
    private int cantidad;

    // getters & setters
    void set_dmg(int damage){
        ataque = damage;
    }
    int get_dmg(){
        return ataque;
    }
    void set_cap(int capacity){
        capacidad = capacity;
    }
    int get_cap(){
        return capacidad;
    }
    void set_quan(int quantity){
        cantidad = quantity;
    }
    int get_quan(){
        return cantidad;
    }

    void disminuir(int cantidad){
        this.cantidad -= cantidad;
    }
    abstract void multiplicar(int cantidad);
}