package es.david.core.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.david.core.model.Empleado;
import es.david.core.model.TrabajosEnum;

@Component
public class BaseDatosEmpleados_ArrayList {
	
	private List<Empleado> BBDD_EMPLEADOS = new ArrayList<>();
	
	public BaseDatosEmpleados_ArrayList() {
		BBDD_EMPLEADOS.add(new Empleado("David", "Serrano", TrabajosEnum.ITD));
		BBDD_EMPLEADOS.add(new Empleado("Sergio", "Serrano", TrabajosEnum.DBA));
		BBDD_EMPLEADOS.add(new Empleado("Victor", "Izquierdo", TrabajosEnum.UXD));
		BBDD_EMPLEADOS.add(new Empleado("Asier", "Areizaga", TrabajosEnum.WD));
		BBDD_EMPLEADOS.add(new Empleado("Anna", "Moreno", TrabajosEnum.QAT));
		BBDD_EMPLEADOS.add(new Empleado("Manu", "Gomez", TrabajosEnum.ITT));
		BBDD_EMPLEADOS.add(new Empleado("Nem", "Sebastian", TrabajosEnum.DS));
		BBDD_EMPLEADOS.add(new Empleado("Alicia", "Felipe", TrabajosEnum.CSE));
		BBDD_EMPLEADOS.add(new Empleado("Mireia", "Dodes", TrabajosEnum.WD));
		BBDD_EMPLEADOS.add(new Empleado("Noah", "Diago", TrabajosEnum.SE));
	}

	public List<Empleado> getBBDD_EMPLEADOS() {
		return BBDD_EMPLEADOS;
	}
	
}
