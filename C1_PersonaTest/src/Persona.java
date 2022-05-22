import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate edad;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String calcularNombreCompleto(){
        return this.nombre+", "+this.apellido;
    }

    public Boolean esMayorDeEdad(){
        return Period.between(this.edad, LocalDate.of(2022, 5, 16)).getYears()>=18;
    }
}
