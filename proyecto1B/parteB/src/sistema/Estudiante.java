package sistema;

import java.util.ArrayList;

public class Estudiante extends Usuario{
	ArrayList<Materia> materiasVistas = new ArrayList<>();
	int semestreActual;
	float promedioSemestre;
	float promedioPonderado;
	Grado requisitosDeGrado;
	
	public Estudiante(){
		
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

	public void setMateriasVistas(ArrayList<Materia> materiasVistas) {
		this.materiasVistas = materiasVistas;
	}

	public void setSemestreActual(int semestreActual) {
		this.semestreActual = semestreActual;
	}

	public void setPromedioSemestre(float promedioSemestre) {
		this.promedioSemestre = promedioSemestre;
	}

	public void setPromedioPonderado(float promedioPonderado) {
		this.promedioPonderado = promedioPonderado;
	}

	public void setRequisitosDeGrado(Grado requisitosDeGrado) {
		this.requisitosDeGrado = requisitosDeGrado;
	}

	
	
}
