package practicaObjetos;

import java.util.Scanner;

public class Jugador{
	private String nombre;
	private String apellidos;
	private String posicion;
	private int dorsal;
	
	// variables
	
	public Jugador(String nombre, String apellidos, String posici�n, int dorsal) {
		// constructor
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.posicion = posici�n;
		this.dorsal = dorsal;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setPosicion(String posicion) {
		this.posicion = "noValida";
		Scanner sc = new Scanner(System.in);
		String [] posiciones= {"Portero", "Defensa", "Centrocampista", "Delantero"};
		for (String pos:posiciones) {
			if (posicion.equalsIgnoreCase(pos)) {
				this.posicion=posicion;
			}	
		}
		if (this.posicion.equals("noValida")) {
			System.err.println("Error esas posiciones no est�n disponibles");
			System.out.println("Por favor, inserte una posici�n v�lida, estas son: Portero, Defensa, Centrocampista, Delantero");
			setPosicion(sc.next());
		}
		
	}
	
	public void setDorsal(int dorsal) {
		this.dorsal=dorsal;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public String getPosicion() {
		return this.posicion;
	}
	public int getDorsal() {
		return this.dorsal;
	}
	
	}	// metodo imprimir

