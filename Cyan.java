class Cyan extends Pikinim {
    Cyan(){
        this.ataque = 1;
        this.capacidad = 1;
    }
    void multiplicar(int cantidad){
        this.cantidad += cantidad * 3;
    }
}