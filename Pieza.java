class Pieza extends Zona implements ILevantable {
    private int peso;
    
    void set_weight(int weight){
        peso = weight;
    }
    int get_weight(){
        return peso;
    }
    Pieza(int weight){
        set_weight(weight);
    }

    public void Levantar(Pikinim yellow,Pikinim cyan, Pikinim magenta){
        
        return;
    }
    void Interactuar(Pikinim yellow,Pikinim cyan, Pikinim magenta){
        
        return;
    }
}