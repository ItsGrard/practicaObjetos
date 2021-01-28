package practicaObjetos;


public class Jugador{
	private String nombre;
	private String apellidos;
	private String posicion;
	private int dorsal;
	
	// variables
	
	public Jugador(String nombre, String apellidos, String posición, int dorsal) {
		// constructor
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.posicion = posición;
		this.dorsal = dorsal;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setPosicion(String posicion) {
		String [] posiciones= {"Portero", "Defensa", "Centrocampista", "Delantero"};
		for (String pos:posiciones) {
			if (posicion.equals(pos)) {
				this.posicion=posicion;
			}
		
		}
		if (this.posicion.equals(null)) {
			System.out.println("Error esas posiciones no están disponibles");
		}
		this.posicion = posicion;
		
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

