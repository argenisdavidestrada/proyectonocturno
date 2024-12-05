public class Tarea {
    private String titulo;
    private String descripcion;
    private String fecha;


    public Tarea(String titulo, String descripcion, String fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }


    public String getTitulo() {
        return titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public String getFecha() {
        return fecha;
    }


    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';

    }
}
