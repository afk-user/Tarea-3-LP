class Magenta extends Pikinim {
    Magenta(){
        this.ataque = 2;
        this.capacidad = 1;
    }
    void multiplicar(int cantidad){
        this.cantidad = cantidad * this.ataque;
    }
}