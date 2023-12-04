import java.util.ArrayList;

public class TRABAJADOR {
    private String nombreApellidos;
    private String fechaNacimiento;
    private String fotoUrl;
    private String puesto;
    private String localizacion;
    private ArrayList<String> cursos;

    public TRABAJADOR(String nombreApellidos, String fechaNacimiento, String fotoUrl, String puesto, String localizacion) {
        this.nombreApellidos = nombreApellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.fotoUrl = fotoUrl;
        this.puesto = puesto;
        this.localizacion = localizacion;
        this.cursos = new ArrayList<>();
    }

    public void mostrarPerfil() {
        System.out.println("Nombre y Apellidos: " + nombreApellidos);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Foto URL: " + fotoUrl);
        System.out.println("Puesto: " + puesto);
        System.out.println("Localización: " + localizacion);
        System.out.println("Cursos: " + cursos);
    }

    public void modificarDatos(String nombreApellidos, String fechaNacimiento, String fotoUrl, String puesto, String localizacion) {
        this.nombreApellidos = nombreApellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.fotoUrl = fotoUrl;
        this.puesto = puesto;
        this.localizacion = localizacion;
    }


    public void visualizarCursos() {
        System.out.println("Cursos: " + cursos);
    }

    public void anadirCurso(String nombreCurso) {
        cursos.add(nombreCurso);
        System.out.println("Curso añadido: " + nombreCurso);
    }

    public void borrarCurso(String nombreCurso) {
        if (cursos.contains(nombreCurso)) {
            cursos.remove(nombreCurso);
            System.out.println("Curso borrado: " + nombreCurso);
        } else {
            System.out.println("El curso no existe en la lista.");
        }
    }
}