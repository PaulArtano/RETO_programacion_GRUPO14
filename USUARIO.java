import java.util.ArrayList;
import java.util.List;

public class USUARIO {
    private String nombre;
    private int puntos;

    int TiempoEstimado;
    private List<VIAJE> viajesRealizados;

    public USUARIO(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.viajesRealizados = new ArrayList<>();
    }

    public void verViajesRealizados() {
        System.out.println("Viajes realizados por " + nombre + ":");
        for (VIAJE viaje : viajesRealizados) {
            System.out.println("- Fecha: " + viaje.getFecha() + ", Puntualidad: " + viaje.getPuntualidadRetraso() +
                    ", Ocupación: " + viaje.getOcupacionEstimada());
        }
    }

    public void recogerInformacionViaje(VIAJE viaje) {
        System.out.println("Información del viaje realizado por " + nombre + ":");
        System.out.println("- Fecha: " + viaje.getFecha());
        System.out.println("- Tiempo estimado: " + viaje.getTiempoEstimado());
        System.out.println("- Ocupación: " + viaje.getOcupacionEstimada());
    }

    public void valorarViaje(VIAJE viaje, int valoracion) {
        viaje.setValoracionPuntualidad(valoracion);
        System.out.println("Viaje valorado por " + nombre + ". Puntualidad: " + valoracion);
    }

    public void visualizarPuntos() {
        System.out.println("Puntos acumulados por " + nombre + ": " + puntos);
    }

    public void ganarPuntos(int cantidad) {
        puntos += cantidad;
        System.out.println(nombre + " ha ganado " + cantidad + " puntos.");
    }

    public void intercambiarPuntos(int cantidad) {
        if (puntos >= cantidad) {
            puntos -= cantidad;
            System.out.println(nombre + " ha intercambiado " + cantidad + " puntos.");
        } else {
            System.out.println("No hay puntos suficientes para el intercambio.");
        }
    }

    public static void main(String[] args) {
        USUARIO usuario = new USUARIO("Usuario1");
    }
}