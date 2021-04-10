package clases;

import java.util.ArrayList;

public class Coordinador extends Usuario{
	ArrayList<Estudiante> listaEstudiantes;
	
	Coordinador(String codigo, String nombre, String apellido,ArrayList<Estudiante> listaEstudiantes){
		super(codigo,nombre,apellido);
		this.listaEstudiantes = listaEstudiantes;
	}

	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}
	
	public void asignarNotaEstudiante(String codigo) {
		
	}
	
	public void generarReporte(String codigo) {
		
	}
}
