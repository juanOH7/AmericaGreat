package great;


public class Ilegal {
    private String nombre;
    private String nacionalidad;
    private String nacimiento;
    private String raza;
    private String origen;
    private boolean deportado;

    public Ilegal(String nombre, String nacionalidad, String nacimiento, String raza, String origen, boolean deportado) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.nacimiento = nacimiento;
        this.raza = raza;
        this.origen = origen;
        this.deportado = deportado;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", origen=" + origen + ", deportado=" + deportado;
    }
    
    
}
