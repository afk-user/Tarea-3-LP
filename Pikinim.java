abstract class Pikinim {
    protected int ataque;
    protected int capacidad;
    protected int cantidad;

    void disminuir(int cantidad){
        this.cantidad -= cantidad;
    }
    abstract void multiplicar(int cantidad);
}