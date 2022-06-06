import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Paseo implements Serializable{

    public static void main(String[] args) {

        Perro p1 = new Perro("Firulais", "Caniche", 3, "Av 123");
        Perro p2 = new Perro("Fifi", "Ovejero", 4, "Av 456");
        Perro p3 = new Perro("Toby", "Cocker", 1, "Calle 123");
        Perro p4 = new Perro("Mimi", "Chihuahua", 5, "Calle 456");

        List<Perro> lunes = new ArrayList<>();
        List<Perro> martes = new ArrayList<>();
        List<Perro> miercoles = new ArrayList<>();
        List<Perro> jueves = new ArrayList<>();
        List<Perro> viernes = new ArrayList<>();

        lunes.add(p1);
        miercoles.add(p1);
        jueves.add(p1);

        lunes.add(p2);
        martes.add(p2);
        miercoles.add(p2);
        jueves.add(p2);

        lunes.add(p3);
        miercoles.add(p3);
        jueves.add(p3);
        viernes.add(p3);

        lunes.add(p4);
        martes.add(p4);
        miercoles.add(p4);
        jueves.add(p4);
        viernes.add(p4);

        try {
            FileOutputStream fos = new FileOutputStream("paseo_semanal.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(lunes);
            oos.writeObject(martes);
            oos.writeObject(miercoles);
            oos.writeObject(jueves);
            oos.writeObject(viernes);

            fos.close();
            oos.close();

            FileInputStream fis = new FileInputStream("paseo_semanal.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Perro> dia;

            for(int i=0; i<5; i++){
                System.out.println("Días: " + ((Integer) i+1));
                System.out.println("***********************");
                dia = (ArrayList<Perro>) ois.readObject();
                for (Perro p: dia){
                    System.out.println(p);
                }
            }

            fis.close();
            ois.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
