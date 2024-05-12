package pe.edu.cibertec.ProyectoGestionEmpleados.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.cibertec.ProyectoGestionEmpleados.model.bd.Empleado;
import pe.edu.cibertec.ProyectoGestionEmpleados.service.IEmpleadoService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

    private IEmpleadoService iEmpleadoService;

    @GetMapping("/listar")
    public String listarEmpleados(Model model){
        model.addAttribute("empleados", iEmpleadoService.listarEmpleados() );
        return "backoffice/empleado/frmempleado";
    }

    @GetMapping("/get")
    @ResponseBody
    public List<Empleado> listarEmpleados(){
        return iEmpleadoService.listarEmpleados();
    }

}
