package archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import sistema.Estudiante;

public class OperacionArchivo {
	//crea el archivo en disco, recibe como par�metro la lista de estudiantes
		public static void crearArchivo(ArrayList lista) {
			FileWriter flwriter = null;
			try {
				//crea el flujo para escribir en el archivo
				flwriter = new FileWriter("C:\\archivos\\estudiantes.txt");
				//crea un buffer o flujo intermedio antes de escribir directamente en el archivo
				BufferedWriter bfwriter = new BufferedWriter(flwriter);
				for (Estudiante estudiante : lista) {
					//escribe los datos en el archivo
					bfwriter.write(estudiante.getCodigo() + ";" + estudiante.getNombre() + ";" + estudiante.getApellido()
							+ "\n");
				}
				//cierra el buffer intermedio
				bfwriter.close();
				System.out.println("Archivo creado satisfactoriamente.");
	 
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (flwriter != null) {
					try {//cierra el flujo principal
						flwriter.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		//crea el archivo en disco, retorna la lista de estudiantes
		public static ArrayList leerArchivo() {
			// crea el flujo para leer desde el archivo
			File file = new File("C:\\archivos\\estudiantes.txt");
			ArrayList listaEstudiantes= new ArrayList<>();	
			Scanner scanner;
			try {
				//se pasa el flujo al objeto scanner
				scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					// el objeto scanner lee linea a linea desde el archivo
					String linea = scanner.nextLine();
					Scanner delimitar = new Scanner(linea);
					//se usa una expresi�n regular
					//que valida que antes o despues de una coma (,) exista cualquier cosa
					//parte la cadena recibida cada vez que encuentre una coma				
					delimitar.useDelimiter("\\s*;\\s*");
					Estudiante e= new Estudiante();
					e.setCodigo(delimitar.next());
					e.setNombre(delimitar.next());
					e.setApellido(delimitar.next());
					listaEstudiantes.add(e);
				}
				//se cierra el ojeto scanner
				scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return listaEstudiantes;
		}
		
		//a�adir m�s estudiantes al archivo
		public static void aniadirArchivo(ArrayList lista) {
			FileWriter flwriter = null;
			try {//adem�s de la ruta del archivo recibe un par�metro de tipo boolean, que le indican que se va a�adir m�s registros 
				flwriter = new FileWriter("C:\\archivos\\estudiantes.txt", true);
				BufferedWriter bfwriter = new BufferedWriter(flwriter);
				for (Estudiante estudiante : lista) {
					//escribe los datos en el archivo
					bfwriter.write(estudiante.getCodigo() + ";" + estudiante.getNombre() + ";" + estudiante.getApellido()
					+ "\n");
				}
				bfwriter.close();
				System.out.println("Archivo modificado satisfactoriamente..");
	 
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (flwriter != null) {
					try {
						flwriter.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
}
