package practicaObjetos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Jugador{
	private String nombre;
	private String apellidos;
	private String posici�n;
	private int dorsal;
	
	// variables
	
	public Jugador(String nombre, String apellidos, String posici�n, int dorsal) {
		// constructor
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.posici�n = posici�n;
		this.dorsal = dorsal;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setPosicion(String posici�n) {
		this.posici�n = posici�n;
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
		return this.posici�n;
	}
	public int getDorsal() {
		return this.dorsal;
	}
	
	}	// metodo imprimir
		
