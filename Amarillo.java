import java.lang.Math;

class Amarillo extends Pikinim {
    void multiplicar(int cantidad){
        this.cantidad += (int)Math.ceil(cantidad * 1.5);
    }
    Amarillo(){
        this.ataque = 1;
        this.capacidad = 3;
    }
}