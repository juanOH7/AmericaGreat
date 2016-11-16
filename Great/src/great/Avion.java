package great;

import java.util.Objects;

public class Avion {

    private int numero = 0;
    private final int cap = 5;
    private Stack pasajeros = new Stack();

    public Avion(int numero) {
        this.numero = numero;
    }

    public void abordar(Ilegal x) {
        pasajeros.Push(x);
        numero++;
    }

    public Object desabordar(int x) {
        numero--;
        return pasajeros.Pop();
    }

    public boolean isFull() {
        return numero == cap;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.numero;
        hash = 29 * hash + this.cap;
        hash = 29 * hash + Objects.hashCode(this.pasajeros);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Avion other = (Avion) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.cap != other.cap) {
            return false;
        }
        if (!Objects.equals(this.pasajeros, other.pasajeros)) {
            return false;
        }
        return true;
    }

}
