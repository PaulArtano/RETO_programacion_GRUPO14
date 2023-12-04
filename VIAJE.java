import java.util.Date;

public class VIAJE {
    private Date fecha;
    private int tiempoEstimado;
    private int ocupacionEstimada;
    private String puntualidadRetraso;
    private int valoracionPuntualidad;

    public VIAJE(Date fecha, int tiempoEstimado, int ocupacionEstimada, String puntualidadRetraso) {
        this.fecha = fecha;
        this.tiempoEstimado = tiempoEstimado;
        this.ocupacionEstimada = ocupacionEstimada;
        this.puntualidadRetraso = puntualidadRetraso;
        this.valoracionPuntualidad = -1; // -1 indica que no ha sido valorado aún
    }

    public Date getFecha() {
        return fecha;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public int getOcupacionEstimada() {
        return ocupacionEstimada;
    }

    public String getPuntualidadRetraso() {
        return puntualidadRetraso;
    }

    public int getValoracionPuntualidad() {
        return valoracionPuntualidad;
    }

    public void setValoracionPuntualidad(int valoracionPuntualidad) {
        this.valoracionPuntualidad = valoracionPuntualidad;
    }

}