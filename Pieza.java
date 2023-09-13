class Pieza extends Zona {
    private int peso;

    Pieza(int weight){
        this.peso = weight;
    }
    int get_weight(){
        return this.peso;
    }
}