package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbEdicionLujo;
    private JComboBox<String> cbEdicionLujo;

    private JLabel lbNombre;
    private JTextField tfNombre;
    private JLabel lbAutor;
    private JTextField tfAutor;
    private JLabel lbAnioEdicion;
    private JTextField tfAnioEdicion;
    
    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos del libro");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);

        //Crear y agregar elementos
        lbNombre = new JLabel("Nombre del libro: ");
        lbNombre.setBounds(40,50,140,20);
        this.add(lbNombre);

        tfNombre = new JTextField();
        tfNombre.setBounds(150,50,100, 25);
        this.add(tfNombre);

        lbAutor = new JLabel("Autor del libro: ");
        lbAutor.setBounds(40, 85, 140, 20);
        this.add(lbAutor);

        tfAutor = new JTextField();
        tfAutor.setBounds(150, 85, 100, 25);
        this.add(tfAutor);

        lbAnioEdicion = new JLabel("Valor del minuto: ");
        lbAnioEdicion.setBounds(40, 120, 140, 20);
        this.add(lbAnioEdicion);

        tfAnioEdicion = new JTextField();
        tfAnioEdicion.setBounds(150, 120, 100, 25);
        this.add(tfAnioEdicion);

        //Crear y agregar etiqueta Operadores
        lbEdicionLujo = new JLabel("Edicion de lujo : ", JLabel.RIGHT);
        lbEdicionLujo.setBounds(32,150,100,20);
        this.add(lbEdicionLujo);

        //Crear y agregar combo lista operadores (claro, movistar, tigo, Wom)
        cbEdicionLujo = new JComboBox<String>();
        cbEdicionLujo.setBounds(150,150,100,20);
        cbEdicionLujo.addItem("Incluye");
        cbEdicionLujo.addItem("No incluye");
        this.add(cbEdicionLujo);


    }

    //Metodos de acceso

    public String getTxtOperadores()
    {
        return (String) cbEdicionLujo.getSelectedItem();
    }

    public void setTxtOperadores(String sal)
    {
        cbEdicionLujo.addItem(sal);
    }

    public void setIndexOperadores(int index)
    {
        cbEdicionLujo.setSelectedIndex(index);
    }

    public String getTxtNombre()
    {
        return tfNombre.getText();
    }

    public void setTxtNombre(String nombre)
    {
        tfNombre.setText(nombre);
    }

    public String getTxtAutor()
    {
        return tfAutor.getText();
    }

    public void setTxtAutor(String autor)
    {
        tfAutor.setText(autor);
    }

    public String getTxtAnioEdicion()
    {
        return tfAnioEdicion.getText();
    }

    public void setAnioEdicion(String anioEdicion)
    {
        tfAnioEdicion.setText(anioEdicion);
    }


}
