
package moduloadministrador.Clases;
import java.util.List;
/**
 *
 * @author felip
 */
public class PersonalMedico {
    
    private int id;
    private String nombre;
    private String especialidad;
    private List<String> horarios;

    public PersonalMedico(int id, String nombre, String especialidad, List<String> horarios) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horarios = horarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<String> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<String> horarios) {
        this.horarios = horarios;
    }
    
}
