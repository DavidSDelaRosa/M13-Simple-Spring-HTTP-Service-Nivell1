package es.david.core.repository;

import java.util.List;

import es.david.core.model.Empleado;

public interface ICrudBaseDatos {

	public void insert(Empleado empleado);
	public void deleteById(Integer id);
	public void update(Empleado empleado);
	public Empleado getEmpleadoById(Integer id);
	public List<Empleado> getAllEmpleados();
}
