package clases;

import java.util.ArrayList;

public class Reporte {
	private ArrayList<Usuario> usuarios;
	Reporte (ArrayList<Usuario> usuarios){
		this.usuarios = usuarios;
	}
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
}
