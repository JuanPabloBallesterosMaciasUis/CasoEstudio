package modelo;

public class Coleccion {

    // Atributos
    private String nombre;
    private String autor;
    private String anioEdicion;
    private boolean edicionLujo;
    private String nombreColeccion;
    private int numeroColeccion;

    // Metodos

    // Constructor
    public Coleccion(String nombre, String autor, String anioEdicion, boolean edicionLujo, String nombreColeccion, int numeroColeccion) {
        this.nombre = nombre;
        this.autor = autor;
        this.anioEdicion = anioEdicion;
        this.edicionLujo = edicionLujo;
        this.nombreColeccion = nombreColeccion;
        this.numeroColeccion = numeroColeccion;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnioEdicion() {
        return anioEdicion;
    }

    public boolean isEdicionLujo() {
        return edicionLujo;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public int getNumeroColeccion() {
        return numeroColeccion;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioEdicion(String anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public void setEdicionLujo(boolean edicionLujo) {
        this.edicionLujo = edicionLujo;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void setNumeroColeccion(int numeroColeccion) {
        this.numeroColeccion = numeroColeccion;
    }

    
}
