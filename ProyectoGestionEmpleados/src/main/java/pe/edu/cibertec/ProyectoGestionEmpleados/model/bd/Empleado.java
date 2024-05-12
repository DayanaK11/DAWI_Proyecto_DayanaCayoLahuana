package pe.edu.cibertec.ProyectoGestionEmpleados.model.bd;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="nombre")
    private String nombre;
    @Column(name ="cargo")
    private String cargo;
    @Column(name ="telefono")
    private String telefono;
    @Column(name ="direccion")
    private String direccion;
    @Column(name ="sueldo")
    private Double sueldo;
}
