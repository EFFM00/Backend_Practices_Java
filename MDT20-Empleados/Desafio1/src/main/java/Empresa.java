import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cuit;
    private String razonSocial;
    private List<Empleado> nominaEmpleados;

    public Empresa(String cuit, String razonSocial) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.nominaEmpleados = new ArrayList();
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Empleado> getNominaEmpleados() {
        return nominaEmpleados;
    }

    public void agregarEmpleado(Empleado empleado){
        this.nominaEmpleados.add(empleado);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cuit='" + cuit + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", nominaEmpleados=" + getNominaEmpleados() +
                '}';
    }
}
