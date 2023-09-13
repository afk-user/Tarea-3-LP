import java.lang.Math;

public class Amarillo extends Pikinim {
    Amarillo(){
        this.ataque = 1;
        this.capacidad = 3;
    }
    void multiplicar(int cantidad){
        this.cantidad += (int)Math.ceil(cantidad * 1.5);
    }
}