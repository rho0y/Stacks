import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

public class Ventana {
    private JPanel panel;
    private JTextField txtTitulo;
    private JTextArea textMensaje;
    private JButton btnAgregar;
    private JButton btnEliminar;
    private JButton btnCima;
    private JButton btnListar;
    private JTextArea txtListar;
    Pila pila1=new Pila();



    public Ventana() {
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String titulo=txtTitulo.getText();
               String mensaje=textMensaje.getText();
               Publicacion obj=new Publicacion(titulo,mensaje);
               pila1.push(obj);
               JOptionPane.showMessageDialog( null,"SE AGREGÓ CORRECTAMENTE");


            }
        });
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                Publicacion eliminado=pila1.pop();
                txtListar.setText("SE ELIMINO" + eliminado);

                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
        btnCima.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                Publicacion dato=pila1.peek();
                txtListar.setText("EL ELEMENTO EN LA CIMA ACTUAL ES: " +dato);
            } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtListar.setText(pila1.listarTodos());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
