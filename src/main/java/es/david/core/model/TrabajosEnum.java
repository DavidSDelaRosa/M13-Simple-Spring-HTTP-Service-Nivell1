package es.david.core.model;

public enum TrabajosEnum {

	SE("Ingenierio de Software", 45000),
	DS("Cientifico de Datos", 47000),
	QAT("QA Tester", 30000),
	WD("Desarrollador Web", 34000),
	WA("Administrador Web", 32000),
	ITT("Tecnico IT", 36000),
	UXD("Diseñador UX", 31000),
	DBA("Administrador BD", 40000),
	ITD("Director IT", 67000),
	CSE("Ingeniero de Sistemas en la nube", 55000),
	ERR("Error",0);
	
	
	private String nombrePuesto;
	private double salario;
	
	TrabajosEnum (String nombrePuesto, double salario){
		this.nombrePuesto = nombrePuesto;
		this.salario = salario;
	}

	public String getNombrePuesto() {
		return nombrePuesto;
	}

	public void setNombrePuesto(String nombrePuesto) {
		this.nombrePuesto = nombrePuesto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
