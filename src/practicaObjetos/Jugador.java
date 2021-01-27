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
		
	/*"Acosta", "Acu�a", "Aguilar", 
	"Aguirre", "Agust�n", "Ahumada", 
	"Alanis", "Alarc�n", "Alay�n", 
	"Alc�zar", "Alcocer", "Alfaro",
 	"Almend�rez", "Altamirano", 
 	"�lvarez", "Alzate", "Amador", 
 	"Anaya", "Arg�elles", "Arjona", 
 	"Arriaga", "Arrollo", "Ayala",
 	"Baca", "B�ez", "Ba�os", 
 	"Barba", "Barrera", "Barrientos", 
 	"Barriga", "Bastida", "Batalla", 
 	"Bautista", "Baz�n", "Becerra", 
 	"Becerril", "Bello", "Beltr�n", 
 	"Ben�tez", "Bernal", "Bola�os", 
 	"Bonilla", "Borges", "Bustamante", 
 	"Busto", "Caballero", "Cabeza", 
 	"Cabrera", "Cadenas", "Caldera", 
 	"Calleja", "Calles", "Camacho", 
 	"Camareno", "Camarillo", "Campos", 
 	"C�rdenas", "Cardoso", "Carranza", 
 	"Carrillo", "Carvajal", "Carvallo",
 	 "Casas", "Castellanos", "Casta�eda", 
 	 "Cepeda", "Cerda", "Cervantes",  
 	 "Cevallos", "Cevedo", "Ch�vez",  
 	 "Cisneros", "Collado", "Cordero", 
 	 "Cornejo", "Correa", "Corro", 
 	 "Cu�llar", "Cuervo", "Cuesta", 
 	 "Cuevas", "Chavira", "C�spedes",
 	 "Daniel", "Dar�o", "D�vila", 
 	 "De Aguilar", "De Alba", "De la Cruz", 
 	 "De la Cuesta", "De la Fuente", "De la Rosa", 
 	 "Del Castillo", "Doblado", "Dom�nguez", 
 	 "Donato", "Dorado", "Duarte",
 	 "Due�as", "Echeverilla", "Enr�quez"
*/
