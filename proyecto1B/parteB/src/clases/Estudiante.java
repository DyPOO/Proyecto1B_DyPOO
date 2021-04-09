package clases;

import java.util.ArrayList;

public class Estudiante extends Usuario{
	private String nombre;
	private String apellido;
	private String codigoEstudiante;
	private int creditosAprobados;
	private ArrayList<Curso> cursosTomados;
	private ArrayList<Curso> cursosFuturos;
	private ArrayList<Curso> requisitosCumplidos;
	
	Estudiante(String nombre, String apellido, String codigoEstudiante, int creditosAprobados, ArrayList<Curso> cursosTomados,ArrayList<Curso> cursosFuturos,ArrayList<Curso> requisitosCumplidos){
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigoEstudiante = codigoEstudiante;
		this.creditosAprobados = creditosAprobados;
		this.cursosTomados = cursosTomados;
		this.cursosFuturos = cursosFuturos;
		this.requisitosCumplidos = requisitosCumplidos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public int getCreditosAprobados() {
		return creditosAprobados;
	}

	public ArrayList<Curso> getCursosFuturos() {
		return cursosFuturos;
	}

	public ArrayList<Curso> getCursosTomados() {
		return cursosTomados;
	}

	public ArrayList<Curso> getRequisitosCumplidos() {
		return requisitosCumplidos;
	}
	
	
}
