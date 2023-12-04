public class CURSOS {
    String nombre;
    int duracionHoras;
    boolean activo;
    public CURSOS(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
        this.activo = false;
    }
    public boolean estaActivo() {
        return activo;
    }
    public void cambiarEstado() {
        activo = !activo;
    }
}
