package clases;

public abstract class Usuario {
	String codigo;
	String nombre;
	String apellido;
	
	Usuario(String codigo, String nombre, String apellido){
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
}
