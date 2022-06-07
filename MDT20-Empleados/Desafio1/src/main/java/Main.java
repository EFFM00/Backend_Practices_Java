import java.io.*;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ana", "Sánchez", "21242321", 23.000);
        Empleado e2 = new Empleado("José","Pérez", "84593847", 24.000);
        Empleado e3 = new Empleado("Romina", "García", "27384950", 25.000);
        Empleado e4 = new Empleado("Ramón", "Morales", "16492723", 25.000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        Empresa empresa = new Empresa("219482932", "DH Inc.");

        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);
        empresa.agregarEmpleado(e4);

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("nomina_empleados.txt");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(empresa.toString());

            fos.close();

            FileInputStream fis = new FileInputStream("nomina_empleados.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println(ois);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
