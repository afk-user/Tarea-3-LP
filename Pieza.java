class Pieza extends Zona {
    private int peso;

    Pieza(int num){
        this.peso = num;
    }
    int get_weight(){
        return this.peso;
    }
}