package great;

public class Aeropuerto {
    private final int cap = 10;
    private final Queue aviones = new Queue();

    public void entrar(Avion x){
        aviones.Queue(x);
    }
    
    public Object salir(){
        return aviones.Dequeue();
    }
}
