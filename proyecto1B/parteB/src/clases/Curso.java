package clases;

public class Curso {
	private String nombre;
	private int creditos;
	private String tipo;
	private int duracion;
	private String electivas;
	
	Curso(String nombre, int creditos, String tipo, int duracion, String electivas)
	{
		this.nombre = nombre ;
		this.creditos = creditos;
		this.tipo = tipo;
		this.duracion = duracion;
		this.electivas = electivas;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getCreditos() {
		return creditos;
	}

	public String getTipo() {
		return tipo;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getElectivas() {
		return electivas;
	}
}
