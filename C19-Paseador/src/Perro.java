import java.io.Serializable;

public class Perro implements Serializable {
    private String nombre;
    private String raza;
    private Integer edad;
    private String direccion;

    public Perro(String nombre, String raza, Integer edad, String direccion) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\n" +
                "Perro" + "\n" +
                "- Nombre: " + this.nombre + "\n" +
                "- Raza: " + this.raza + "\n" +
                "- Edad: " + this.edad + " años" + "\n" +
                "- Dirección: " + this.direccion + "\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
