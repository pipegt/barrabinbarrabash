package moduloadministrador;

import javax.swing.*;

public class AdminFrame extends JFrame {
    private JButton btnPersonalMedico;
    private JButton btnEnfermedades;
    private JButton btnMedicamentos;
    private JButton btnSucursales;
    private JButton btnSalir;
    
    public AdminFrame() {
        // Configuración de la ventana
        setTitle("Administrador");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        // Componentes
        btnPersonalMedico = new JButton("Administrar Personal Médico");
        btnPersonalMedico.setBounds(30, 30, 240, 25);
        add(btnPersonalMedico);
        
        btnEnfermedades = new JButton("Administrar Enfermedades");
        btnEnfermedades.setBounds(30, 70, 240, 25);
        add(btnEnfermedades);
        
        btnMedicamentos = new JButton("Administrar Medicamentos");
        btnMedicamentos.setBounds(30, 110, 240, 25);
        add(btnMedicamentos);
        
        btnSucursales = new JButton("Administrar Sucursales");
        btnSucursales.setBounds(30, 150, 240, 25);
        add(btnSucursales);
        
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(100, 190, 100, 25);
        add(btnSalir);
        
        // Mostrar la ventana
        setVisible(true);
    }
    
    // Agrega getters para los botones
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AdminFrame();
        });
    }   
}
