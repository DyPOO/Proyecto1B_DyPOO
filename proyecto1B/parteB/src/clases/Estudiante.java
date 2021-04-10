package clases;

import java.util.ArrayList;

public class Estudiante extends Usuario{
	ArrayList<Materia> materiasVistas;
	int semestreActual;
	float promedioSemestre;
	float promedioPonderado;
	Grado requisitosDeGrado;
	
	Estudiante(String codigo, String nombre, String apellido, ArrayList<Materia> materiasVistas, int semestreActual,float promedioSemestre, float promedoPonderado, Grado requisitosDeGrado){
		super(codigo,nombre,apellido);
		this.materiasVistas = materiasVistas;
		this.semestreActual = semestreActual;
		this.promedioSemestre = promedioSemestre;
		this.promedioPonderado = promedoPonderado;
		this.requisitosDeGrado = requisitosDeGrado;
	}

	public ArrayList<Materia> getMateriasVistas() {
		return materiasVistas;
	}

	public int getSemestreActual() {
		return semestreActual;
	}

	public float getPromedioSemestre() {
		return promedioSemestre;
	}

	public float getPromedioPonderado() {
		return promedioPonderado;
	}

	public Grado getRequisitosDeGrado() {
		return requisitosDeGrado;
	}

	
	
}
