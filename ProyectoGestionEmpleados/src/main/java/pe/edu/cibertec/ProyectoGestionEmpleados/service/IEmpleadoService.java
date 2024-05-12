package pe.edu.cibertec.ProyectoGestionEmpleados.service;
import pe.edu.cibertec.ProyectoGestionEmpleados.model.bd.Empleado;

import java.util.List;
public interface IEmpleadoService {

    List<Empleado> listarEmpleados();
}
