package clases;

public class Cronograma {
	private Estudiante estudiante;
	private int semestre;
	
	Cronograma(Estudiante estudiante, int semestre){
		this.estudiante = estudiante;
		this.semestre = semestre;
	}

	public int getSemestre() {
		return semestre;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

}
