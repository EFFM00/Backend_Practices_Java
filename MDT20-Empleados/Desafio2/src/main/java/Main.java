import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Empleado e1 = new Empleado("Ana", "Sánchez", "21242321", 23.000);
        Empleado e2 = new Empleado("José","Pérez", "84593847", 24.000);
        Empleado e3 = new Empleado("Romina", "García", "27384950", 25.000);
        Empleado e4 = new Empleado("Ramón", "Morales", "16492723", 25.000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        Empresa empresa = new Empresa("219482932", "DH Inc.");

        File nominaTxt = new File("./nomina_empleados.txt");

        if(!nominaTxt.exists()){
            nominaTxt.createNewFile();
        }

        FileWriter fw = new FileWriter(nominaTxt);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(empresa.toString());
        bw.close();

        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);
        empresa.agregarEmpleado(e4);

        FileReader fr = new FileReader(nominaTxt);
        BufferedReader br = new BufferedReader(fr);

        System.out.println(br.readLine());

    }
}
