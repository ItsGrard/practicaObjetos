package practicaObjetos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Jugador extends Persona{
	
	private int dorsal;
	private String posicion;
	
	public Jugador (String archivo_entrada) throws IOException {
		
		BufferedReader in = null;
		try {
			in = new BufferedReader (new FileReader(archivo_entrada));
			this.nombre = in.readLine();
			this.apellidos = in.readLine();
			this.DNI = in.readLine();
			this.sueldo = Integer.parseInt(in.readLine());
			this.edad = Integer.parseInt(in.readLine());
			this.dorsal = Integer.parseInt(in.readLine());
			this.posicion = in.readLine();
		} finally {
			if (in != null) in.close();
		}
	}
	
	public Jugador() {
		
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Dorsal: "+this.dorsal + " Posicion: "+this.posicion);	
	}
		
}