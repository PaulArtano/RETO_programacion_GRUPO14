import java.util.HashMap;
import java.util.Map;

public class SISTEMAPUNTOS {
    private Map<String, Integer> puntosUsuarios;

    public SISTEMAPUNTOS() {
        this.puntosUsuarios = new HashMap<>();
    }

    public void agregarPuntos(String usuario, int puntos) {
        puntosUsuarios.put(usuario, puntosUsuarios.getOrDefault(usuario, 0) + puntos);
    }

    public void gastarPuntos(String usuario, int puntos) {
        int puntosActuales = puntosUsuarios.getOrDefault(usuario, 0);
        if (puntosActuales >= puntos) {
            puntosUsuarios.put(usuario, puntosActuales - puntos);
            System.out.println(usuario + " ha gastado " + puntos + " puntos.");
        } else {
            System.out.println("No hay puntos suficientes para el gasto.");
        }
    }

    public int obtenerPuntos(String usuario) {
        return puntosUsuarios.getOrDefault(usuario, 0);
    }

    public void mostrarHistoricoPuntos(String usuario) {
        System.out.println("Historial de puntos de " + usuario + ":");
        // Puedes personalizar esta parte según cómo almacenes el historial
        // Por ejemplo, podrías tener una lista de transacciones con fechas y puntos
        // para mostrarlas aquí.
    }

    public static void main(String[] args) {
        SISTEMAPUNTOS sistemaPuntos = new SISTEMAPUNTOS();

        String usuario = "Usuario1";
        sistemaPuntos.agregarPuntos(usuario, 50);
        System.out.println("Puntos actuales de " + usuario + ": " + sistemaPuntos.obtenerPuntos(usuario));

        sistemaPuntos.gastarPuntos(usuario, 20);
        System.out.println("Puntos después de gastar: " + sistemaPuntos.obtenerPuntos(usuario));

        sistemaPuntos.mostrarHistoricoPuntos(usuario);
    }
}
