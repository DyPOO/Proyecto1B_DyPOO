package clases;

public class Coordinador {
	private Estudiante estudiante;
	private String nombre;
	private String apellido;
	private String departamento;
	
	
	Coordinador(Estudiante estudiante, String nombre, String apellido, String departamento){
		this.estudiante = estudiante;
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = departamento;
	}
	
	public Estudiante getEstudiante() {
		return estudiante;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public String getDepartamento() {
		return departamento;
	}
}
