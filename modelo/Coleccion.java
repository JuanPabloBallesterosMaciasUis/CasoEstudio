package modelo;

public class Coleccion extends Libro{

    // Atributos
    private String nombreColeccion;
    private int numeroColeccion;

    // Metodos

    // Constructor
    public Coleccion(String nombre, String autor, String anioEdicion, String edicionLujo, String nombreColeccion, int numeroColeccion) {
        super(nombre, autor, anioEdicion, edicionLujo);
        this.nombreColeccion = nombreColeccion;
        this.numeroColeccion = numeroColeccion;
    }

    // Getters

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public int getNumeroColeccion() {
        return numeroColeccion;
    }

    // Setters

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void setNumeroColeccion(int numeroColeccion) {
        this.numeroColeccion = numeroColeccion;
    }

    // Metodo para saber si el libro tiene edicion de lujo
    public String edicionLujo() {
        if (super.isEdicionLujo().equals("si")) {
            return "El libro tiene edición de lujo";
        } else {
            return "El libro no tiene edición de lujo";
        }
    }
    
    

    // toString
    @Override
    public String toString() {
        return "_____________________" + super.toString() + "\nNombre de la colección: " + nombreColeccion + "\nNúmero de la colección: " + numeroColeccion;
        
    }
    
    
}
