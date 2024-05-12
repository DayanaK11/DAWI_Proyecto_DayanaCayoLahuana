package pe.edu.cibertec.ProyectoGestionEmpleados.model;

import jakarta.persistence.*;
import lombok.Data;
import pe.edu.cibertec.ProyectoGestionEmpleados.model.bd.Empleado;

@Data
@Entity
@Table(name = "ventas")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "empleadoid")
    private Empleado empleadoid;
    @Column(name = "monto_total")
    private Double monto_total;
}

