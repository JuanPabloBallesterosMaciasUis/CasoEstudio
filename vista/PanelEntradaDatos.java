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
    private JLabel lbOperadores;
    private JComboBox<String> cbOperadores;

    private JLabel lbNombre;
    private JTextField tfNombre;
    private JLabel lbAutor;
    private JTextField tfAutor;
    private JLabel lbAnioEdicion;
    private JTextField tfAnioEdicion;
    private JLabel lbEdicionLujo;
    private JTextField tfEdicionLujo;

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

        lbEdicionLujo = new JLabel("Edicion de lujo: ");
        lbEdicionLujo.setBounds(40, 155, 140, 20);
        this.add(lbEdicionLujo);

        
        tfEdicionLujo = new JTextField();
        tfEdicionLujo.setBounds(150, 155, 100, 25);
        this.add(tfEdicionLujo);


    }

    //Metodos de acceso

    public String getTxtOperadores()
    {
        return (String) cbOperadores.getSelectedItem();
    }

    public void setTxtOperadores(String sal)
    {
        cbOperadores.addItem(sal);
    }

    public void setIndexOperadores(int index)
    {
        cbOperadores.setSelectedIndex(index);
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

    public String getTxtEdicionLujo()
    {
        return tfEdicionLujo.getText();
    }

    public void setTxtEdicionLujo(String edicionLujo)
    {
        tfEdicionLujo.setText(edicionLujo);
    }

}
