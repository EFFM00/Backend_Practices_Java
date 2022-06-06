package com.dh.contactosFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactoTest {

    public static void main(String[] args) {

        Contacto c1 = new Contacto("Fabian", "fabian@mail.com", "8507103123");
        Contacto c2 = new Contacto("Juanito", "juancito@mail.com", "4623123550");
        Contacto c3 = new Contacto("Milaneso", "milaneso@mail.com", "3432565678");
        Contacto c4 = new Contacto("Pepito", "pepito@mail.com", "9582378593");
        Contacto c5 = new Contacto("Menganito", "menganito@mail.com", "1783948547");

        List<Contacto> agenda = new ArrayList<>();

        agenda.add(c1);
        agenda.add(c2);
        agenda.add(c3);
        agenda.add(c4);
        agenda.add(c5);

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("contactos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(agenda);

            fos.close();

            FileInputStream fi = new FileInputStream("contactos.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);

            List<Contacto> nuevaAgenda;

            nuevaAgenda = (List<Contacto>) ois.readObject();

            for(Contacto contacto:nuevaAgenda){
                System.out.println(contacto.toString());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
