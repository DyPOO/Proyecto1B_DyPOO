package clases;

import java.util.ArrayList;

public class Pensum {
	private String creditos;
	private int cantidadMaterias;
	private String requisitosAdicionales;
	private ArrayList<Curso> cursos;
	private Cronograma cronograma;
	
	Pensum(String creditos, int cantidadMaterias, String requisitosAdicionales, ArrayList<Curso> cursos,Cronograma cronograma){
		this.creditos = creditos;
		this.cantidadMaterias = cantidadMaterias;
		this.requisitosAdicionales = requisitosAdicionales;
		this.cursos = cursos;
		this.cronograma = cronograma;
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

	public Cronograma getCronograma() {
		return cronograma;
	}
	
}
