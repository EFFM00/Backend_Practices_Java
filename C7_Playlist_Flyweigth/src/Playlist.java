import java.util.HashMap;
import java.util.Map;

public class Playlist {

    private static final HashMap<Cancion, Cancion> playlist = new HashMap<>();
    private String nombrePlaylist;

    public Playlist(String nombrePlaylist) {
        this.nombrePlaylist = nombrePlaylist;
    }

    public void agregarCancion(Cancion cancion) {
        CancionFactory factory = CancionFactory.getInstance();

        if (factory.obtenerCancion(cancion)==null) {
            System.out.println("Canción no encontrada. Se creará");
            factory.obtenerCancion(cancion);
            System.out.println("Canción creada desde Playlist");
            playlist.put(cancion, cancion);
        } else {
            System.out.println("Canción encontrada y se agregará a la lista");
            factory.obtenerCancion(cancion);
        }
    }

    public void eliminarCancion(Cancion cancion) {
        if (playlist.containsKey(cancion)) {
            playlist.remove(cancion);
            System.out.println("Canción " + cancion.getNombre() + " eliminada de la playlist " + this.nombrePlaylist);
        }
    }
}