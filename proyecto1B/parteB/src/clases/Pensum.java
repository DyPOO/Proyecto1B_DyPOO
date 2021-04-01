package clases;

import java.util.ArrayList;

public class Pensum {
	private String creditos;
	private int cantidadMaterias;
	private String requisitosAdicionales;
	private ArrayList<Curso> cursos;
	// private *tipo* cronograma;
	
	Pensum(String creditos, int cantidadMaterias, String requisitosAdicionales, ArrayList<Curso> cursos){
		this.creditos = creditos;
		this.cantidadMaterias = cantidadMaterias;
		this.requisitosAdicionales = requisitosAdicionales;
		this.cursos = cursos;
	}

	public String getCreditos() {
		return creditos;
	}

	public int getCantidadMaterias() {
		return cantidadMaterias;
	}

	public String getRequisitosAdicionales() {
		return requisitosAdicionales;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	
}
