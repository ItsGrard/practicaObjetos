package practicaObjetos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Jugador{
	private String nombre;
	private String apellidos;
	private String posición;
	private int dorsal;
	
	// variables
	
	public Jugador(String nombre, String apellidos, String posición, int dorsal) {
		// constructor
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.posición = posición;
		this.dorsal = dorsal;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setPosicion(String posición) {
		this.posición = posición;
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
		return this.posición;
	}
	public int getDorsal() {
		return this.dorsal;
	}
	
	}	// metodo imprimir
		
