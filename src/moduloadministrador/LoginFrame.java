package moduloadministrador;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends javax.swing.JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtContraseña;

    public LoginFrame() {
        // Configuración de la ventana
        setTitle("Inicio de Sesión");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new FlowLayout());

        // Componentes
        JLabel lblUsuario = new JLabel("Usuario:");
        add(lblUsuario);

        txtUsuario = new JTextField(20);
        add(txtUsuario);

        JLabel lblContraseña = new JLabel("Contraseña:");
        add(lblContraseña);

        txtContraseña = new JPasswordField(20);
        add(txtContraseña);

        JButton btnIniciarSesion = new JButton("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String contraseña = new String(txtContraseña.getPassword());

                // Aquí puedes implementar la lógica para verificar el inicio de sesión
                if (verificarInicioSesion(usuario, contraseña)) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Inicio de sesión exitoso");
                    // Aquí puedes abrir la siguiente ventana o realizar otras acciones
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Credenciales incorrectas");
                }
            }
        });
        add(btnIniciarSesion);

        JButton btnNuevoUsuario = new JButton("Crear Nuevo Usuario");
        btnNuevoUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes implementar la lógica para crear un nuevo usuario
                JOptionPane.showMessageDialog(LoginFrame.this, "Nuevo usuario creado");
            }
        });
        add(btnNuevoUsuario);

        // Mostrar la ventana
        setVisible(true);
    }

    private boolean verificarInicioSesion(String usuario, String contraseña) {
        // Aquí puedes implementar la lógica para verificar el inicio de sesión
        // por ejemplo, comparando los datos ingresados con una base de datos o
        // utilizando valores predefinidos para pruebas
        // Devuelve true si el inicio de sesión es exitoso, de lo contrario, false
        return usuario.equals("admin") && contraseña.equals("admin123");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginFrame();
        });
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
