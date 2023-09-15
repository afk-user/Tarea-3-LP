class Pildora extends Zona {
    int cantidad;

    void set_quan(int quantity){
        cantidad = quantity;
    }
    int get_quan(){
        return cantidad;
    }
    Pildora(int quantity){
        set_quan(quantity);
    }
}