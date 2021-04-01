package clases;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String codigoEstudiante;
	private int creditosAprobados;
	// private *tipo* cursosTomados;
	// private *tipo* cursosFuturos;
	// private *tipo* requisitosCumplidos;
	
	Estudiante(String nombre, String apellido, String codigoEstudiante, int creditosAprobados){
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigoEstudiante = codigoEstudiante;
		this.creditosAprobados = creditosAprobados;
	}
}
