import java.util.HashMap;

public class CancionFactory {

    private HashMap<String, Cancion> canciones = new HashMap<String, Cancion>();
    private static CancionFactory instance = new CancionFactory();

    private CancionFactory() {
    }

    public static CancionFactory getInstance() {
        return instance;
    }

    public Cancion obtenerCancion(Cancion cancion) {
        String clave = "nombre: " + cancion.getNombre() + " artista: " + cancion.getArtista() + " género: " + cancion.getGenero();
        if (!canciones.containsKey(clave)) {
            canciones.put(clave, new Cancion(cancion.getNombre(), cancion.getArtista(), cancion.getGenero()));
            System.out.println("Canción creada desde Factory");
            return cancion;
        } else {
            System.out.println("Canción agregada de HashMap");
            return canciones.get(clave);

        }
    }
}
