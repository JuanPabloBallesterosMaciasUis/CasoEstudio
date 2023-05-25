package ejecutable;

import javax.swing.JOptionPane;
import modelo.Coleccion;
import modelo.Libro;

public class Test {

    public static void main(String[] args) {

        // Libro
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del libro");

        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro");

        String anioEdicion = JOptionPane.showInputDialog("Ingrese el año de edición del libro");

        String edicionLujo = JOptionPane.showInputDialog("Ingrese (si) o (no) es edición de lujo del libro");

        Libro libro = new Libro(nombre, autor, anioEdicion, edicionLujo);

        
        System.out.println(libro.toString());

        // Coleccion
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del libro");

        autor = JOptionPane.showInputDialog("Ingrese el autor del libro");

        anioEdicion = JOptionPane.showInputDialog("Ingrese el año de edición del libro");

        edicionLujo = JOptionPane.showInputDialog("Ingrese (si) o (no) es edición de lujo del libro");

        String nombreColeccion = JOptionPane.showInputDialog("Ingrese el nombre de la colección del libro");

        int numeroColeccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la colección del libro"));

        Coleccion coleccion = new Coleccion(nombre, autor, anioEdicion, edicionLujo, nombreColeccion, numeroColeccion);
        

        System.out.println(coleccion.toString());

        
    }
    
}
