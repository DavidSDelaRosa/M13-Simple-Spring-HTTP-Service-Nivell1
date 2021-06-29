package es.david.core.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.david.core.model.Empleado;
import es.david.core.repository.BaseDatosEmpleados_ArrayList;
import es.david.core.repository.ICrudBaseDatos;

@Service
public class EmpleadoService implements ICrudBaseDatos{
	
	@Autowired
	BaseDatosEmpleados_ArrayList bbddEmpleados;

	@Override
	public void insert(Empleado empleado) {
		
		bbddEmpleados.getBBDD_EMPLEADOS().add(empleado);
		System.out.println("Insertado empleado con ID: " + empleado.getId());
		
	}

	@Override
	public void deleteById(Integer id) {
		
		for(Empleado empleado: bbddEmpleados.getBBDD_EMPLEADOS()) {
			if(empleado.getId() == id) {
				System.out.println("Eliminando empleado con ID: " + empleado.getId() + " ...");
				bbddEmpleados.getBBDD_EMPLEADOS().remove(empleado);
				System.out.println("Empleado eliminado. ");
				break;
			}//else System.out.println("No se ha encontrado empleado con el ID: " + id);
		}
		
	}

	@Override
	public void update(Empleado empleado) {
		
		System.err.println(empleado.toString());

		for(Empleado empl: bbddEmpleados.getBBDD_EMPLEADOS()) {
			if(empl.getId() == empleado.getId()) {
				System.out.println("Actualizando empleado con ID: " + empl.getId());
				empl.setNombre(empleado.getNombre());
				empl.setApellido(empleado.getApellido());
				System.out.println(empleado.toString());
				empl.setPuesto(empleado.getPuesto());
				
				System.out.println(empl.toString());
				break;
			}//else System.out.println("No se ha encontrado empleado con el ID: " + empleado.getId());
		}
		
	}

	@Override
	public Empleado getEmpleadoById(Integer id) {
		
		Empleado empleadoEncontrado = null;
		
		for(Empleado empleado: bbddEmpleados.getBBDD_EMPLEADOS()) {
			if(empleado.getId() == id) {
				empleadoEncontrado = empleado;
				System.out.println("Encontrado empleado: " + empleadoEncontrado.toString());
				break;
			}//else System.out.println("No se ha encontrado empleado con el ID: " + id);
		}
		return empleadoEncontrado;
	}

	@Override
	public List<Empleado> getAllEmpleados() {

		return bbddEmpleados.getBBDD_EMPLEADOS();
	}
	

	public boolean estaGuardado(Empleado empleado) {
		
		boolean guardado = false;
		
		for(Empleado emp: bbddEmpleados.getBBDD_EMPLEADOS()) {
			
			guardado = emp.getId() == empleado.getId()? true : false;
		}
		
		String respuesta = guardado? "Empleado esta en la lista " : "Empleado NO esta en la lista";
		System.out.println(respuesta);
		return guardado;
	}
	
	public boolean isGuardado(Empleado empleado) {
		
		if(bbddEmpleados.getBBDD_EMPLEADOS().contains(empleado)) {
			System.err.println("Esta en la lista");
			return true;
		}else {
			System.err.println("NO esta en la lista");
			return false;
		}
	}


}
