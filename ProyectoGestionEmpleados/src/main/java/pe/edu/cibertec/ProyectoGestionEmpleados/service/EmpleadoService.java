package pe.edu.cibertec.ProyectoGestionEmpleados.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoGestionEmpleados.model.bd.Empleado;
import pe.edu.cibertec.ProyectoGestionEmpleados.repository.EmpleadoRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class EmpleadoService implements IEmpleadoService {

    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }
}
