package es.david.core.model;

public class Empleado {

	private Integer id;
	private String nombre;
	private String apellido;
	private TrabajosEnum puesto;
	private static Integer CONTADOR_EMPLEADOS = 1;
	
	public Empleado() {}
	
	public Empleado(String nombre, String apellido, TrabajosEnum puesto) {
		id = CONTADOR_EMPLEADOS;
		this.nombre = nombre;
		this.apellido = apellido;
		this.puesto = puesto;
		CONTADOR_EMPLEADOS++;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public TrabajosEnum getPuesto() {
		return puesto;
	}

	public void setPuesto(TrabajosEnum puesto) {
		
		this.puesto = puesto;
	}

	/*private TrabajosEnum toTrabajosEnum(String puestoTrabajo) {
		System.out.println("Hola aquí");
		return TrabajosEnum.valueOf(puestoTrabajo);
	}*/
	
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto.getNombrePuesto() + "]";
	}
	
}	
