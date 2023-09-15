import java.lang.Math;

public class Amarillo extends Pikinim {
    Amarillo(int quantity){
        set_dmg(1);
        set_cap(3);
        set_quan(quantity);
    }
    void multiplicar(int cantidad){
        set_quan(get_quan() + (int)Math.ceil(cantidad * 1.5));
    }
}