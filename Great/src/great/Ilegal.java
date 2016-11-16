package great;

import java.io.Serializable;
import java.util.Objects;


public class Ilegal implements Serializable{
    private static final long SerialVersionUID = 636L;
    private String nombre;
    private String nacionalidad;
    private String nacimiento;
    private String raza;
    private String origen;
    private boolean deportado;

    public Ilegal() {
    }
    
    public Ilegal(String nombre, String nacionalidad, String nacimiento, String raza, String origen, boolean deportado) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.nacimiento = nacimiento;
        this.raza = raza;
        this.origen = origen;
        this.deportado = deportado;
    }
    
    public void changeStatus(boolean x){
        deportado = x;
    }

    public boolean isDeported(){
        return deportado;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ilegal) {
            Ilegal rhs = (Ilegal)obj;
            if (rhs.nacimiento.equals(this.nacimiento) && rhs.nacionalidad.equals(this.nacionalidad)
                && rhs.nombre.equals(this.nombre) && rhs.origen.equals(this.origen) && rhs.raza.equals(this.raza) 
                && rhs.deportado == this.deportado){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.nacionalidad);
        hash = 71 * hash + Objects.hashCode(this.nacimiento);
        hash = 71 * hash + Objects.hashCode(this.raza);
        hash = 71 * hash + Objects.hashCode(this.origen);
        hash = 71 * hash + (this.deportado ? 1 : 0);
        return hash;
    }

    
    @Override
    public String toString() {
        return nombre;
    }
    
    
}
