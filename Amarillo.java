import java.lang.Math;

public class Amarillo extends Pikinim {
    Amarillo(int quantity){
        this.set_dmg(1);
        this.set_cap(3);
        this.set_quan(quantity);
    }
    void multiplicar(int cantidad){
        this.set_quan(this.get_quan() + (int)Math.ceil(cantidad * 1.5));
    }
}