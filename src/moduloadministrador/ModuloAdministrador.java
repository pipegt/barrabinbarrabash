package moduloadministrador;
import moduloadministrador.Clases.Administrador;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author felip
 */
public class ModuloAdministrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            SwingUtilities.invokeLater(() -> {
            LoginFrame loginFrame = new LoginFrame();
            if (inicioSesionExitoso) {
                loginFrame.dispose(); // Cierra la ventana de inicio de sesión
                AdminFrame adminFrame = new AdminFrame();
                // Aquí puedes implementar la lógica para la ventana principal del administrador
            }
        });
    }
        
        Scanner scanner = new Scanner(System.in);
        
        // Crear un administrador
        Administrador admin = new Administrador(1, "Nombre", "usuario", "contraseña");
        
        // Inicio de sesión
        System.out.println("Ingrese su usuario: ");
        String usuario = scanner.nextLine();
        
        System.out.println("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();
        
        if (usuario.equals(admin.getUsuario()) && contraseña.equals(admin.getContraseña())) {
            System.out.println("Inicio de sesión exitoso.");
    }
        
    // Establecer conexión a la base de datos
        Connection connection = null;
        try {
            // Establece los detalles de la conexión (URL de la base de datos, usuario y contraseña)
            String url = "jdbc:mysql://localhost:3306/nombre_basedatos";
            String user = "usuario";
            String password = "contraseña";
            
            // Crea la conexión
            connection = DriverManager.getConnection(url, user, password);
            
            System.out.println("Conexión exitosa a la base de datos.");
            
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    } 
}
