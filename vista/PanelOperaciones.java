package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btAgregarColeccion;
    private JButton btGuardarLibro;
    private JButton btSalir;
   
    private JButton btEleminar;
;
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar boton Agregar plan
        btAgregarColeccion = new JButton("Libro de colección");
        btAgregarColeccion.setBounds(10,40,150,20);
        btAgregarColeccion.setActionCommand("coleccion");
        this.add(btAgregarColeccion);

        //Crear y agregar boton guadar libro
        btGuardarLibro = new JButton("Guardar libro");
        btGuardarLibro.setBounds(10,70,150,20);
        btGuardarLibro.setActionCommand("guardar");
        this.add(btGuardarLibro);

        //Crear y agregar boton Eleminar
        btEleminar = new JButton("Eliminar");
        btEleminar.setBounds(10,100,150,20);
        btEleminar.setActionCommand("eliminar");
        this.add(btEleminar);

        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(10,130,150,20);
        btSalir.setActionCommand("salir");
        this.add(btSalir);
    
    

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Opciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAgregarColeccion.addActionListener(pAL);
        btGuardarLibro.addActionListener(pAL);
        btEleminar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
  
    }


}
