package great;

public class Aeropuerto {

    private final int cap = 10;
    private int num = 0;
    private final Queue aviones = new Queue();

    public void entrar(Avion x) {
        aviones.Queue(x);
        num++;
    }

    public int getCap() {
        return cap;
    }

    public Object salir() {
        num--;
        return aviones.Dequeue();
    }
    
    public void Abord(Ilegal x) {
        ((Avion)aviones.Peek()).abordar(x);
        num++;
    }

    
    public Object ver() {
        num--;
        return aviones.Peek();
    }
    
    public boolean isFull(){
        return num == cap;
    }
}
