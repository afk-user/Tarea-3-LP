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
        set_status(false);
    }

    public void Levantar(Pikinim yellow ,Pikinim cyan, Pikinim magenta){
        if(get_weight() <= yellow.get_quan() * yellow.get_cap() + cyan.get_quan() * cyan.get_cap() + magenta.get_quan() * magenta.get_cap()){
            set_status(true);
        }
        return;
    }
    void Interactuar(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        Levantar(yellow, cyan, magenta);
        if(get_status()){
            System.out.println("Los pikinim recogieron exitosamente la pieza de la nave");
        }else{
            System.out.println("Los pikinim no pudieron llevarse la pieza");
        }
        return;
    }
    void soupact(Pikinim yellow, Pikinim cyan, Pikinim magenta){
        super.Interactuar(yellow, cyan, magenta);
    }
}