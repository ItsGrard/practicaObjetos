// Gerardo Marín Jaime
// Alejandro Vicente Jarnald


package practicaObjetos;

import java.util.Scanner;

public class Jugador{
	// variables
	private String nombre;
	private String apellidos;
	private String posicion;
	private int dorsal;
	

	// constructor
	public Jugador(String nombre, String apellidos, String posición, int dorsal) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.posicion = posición;
		this.dorsal = dorsal;
	}
	
	//setters
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
			System.err.println("Error esas posiciones no están disponibles");
			System.out.println("Por favor, inserte una posición válida, estas son: Portero, Defensa, Centrocampista, Delantero");
			setPosicion(sc.next());
		}
		
	}
	
	public void setDorsal(int dorsal) {
		this.dorsal=dorsal;
	}
	//getters
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
	
	}	

