import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GalleataFortuna {

    private static final String[] MENSAJES ={
            "ganaras el semestre universitario",
            "ganaras el curso de progrtamacion",
            "TENDRAS MUCHAS MUCHA SUERTE ESTE AÑO",
            "TENDRAS SUERTE EN EL AMOR ",
            "TENDRAS UN AUMENTO DE SUELDO ESTE AÑO "






    };


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> crearInterfaz());
    }

    private static void crearInterfaz() {
        JFrame frame = new JFrame("Galletas de la Fortuna");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        JButton botonObtenerMensaje = new JButton("Obtener Mensaje");
        JLabel etiquetaMensaje = new JLabel("Presiona el botón para obtener un mensaje.");

        botonObtenerMensaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMensajeAleatorio(etiquetaMensaje);
            }
        });

        JPanel panel = new JPanel();
        panel.add(botonObtenerMensaje);
        panel.add(etiquetaMensaje);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void mostrarMensajeAleatorio(JLabel etiquetaMensaje) {
        Random random = new Random();
        int indiceMensaje = random.nextInt(MENSAJES.length);
        etiquetaMensaje.setText(MENSAJES[indiceMensaje]);
    }
}




