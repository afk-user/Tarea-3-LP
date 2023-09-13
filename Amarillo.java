import java.lang.Math;

class Amarillo extends Pikinim {
    Amarillo(){
        this.ataque = 1;
        this.capacidad = 3;
    }
    void multiplicar(int cantidad){
        this.cantidad += Math.ceil(cantidad * 1.5);
    }
}