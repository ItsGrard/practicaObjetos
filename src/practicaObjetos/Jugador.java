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
		
	/*"Acosta", "Acuña", "Aguilar", 
	"Aguirre", "Agustín", "Ahumada", 
	"Alanis", "Alarcón", "Alayón", 
	"Alcázar", "Alcocer", "Alfaro",
 	"Almendárez", "Altamirano", 
 	"Álvarez", "Alzate", "Amador", 
 	"Anaya", "Argüelles", "Arjona", 
 	"Arriaga", "Arrollo", "Ayala",
 	"Baca", "Báez", "Baños", 
 	"Barba", "Barrera", "Barrientos", 
 	"Barriga", "Bastida", "Batalla", 
 	"Bautista", "Bazán", "Becerra", 
 	"Becerril", "Bello", "Beltrán", 
 	"Benítez", "Bernal", "Bolaños", 
 	"Bonilla", "Borges", "Bustamante", 
 	"Busto", "Caballero", "Cabeza", 
 	"Cabrera", "Cadenas", "Caldera", 
 	"Calleja", "Calles", "Camacho", 
 	"Camareno", "Camarillo", "Campos", 
 	"Cárdenas", "Cardoso", "Carranza", 
 	"Carrillo", "Carvajal", "Carvallo",
 	 "Casas", "Castellanos", "Castañeda", 
 	 "Cepeda", "Cerda", "Cervantes",  
 	 "Cevallos", "Cevedo", "Chávez",  
 	 "Cisneros", "Collado", "Cordero", 
 	 "Cornejo", "Correa", "Corro", 
 	 "Cuéllar", "Cuervo", "Cuesta", 
 	 "Cuevas", "Chavira", "Céspedes",
 	 "Daniel", "Darío", "Dávila", 
 	 "De Aguilar", "De Alba", "De la Cruz", 
 	 "De la Cuesta", "De la Fuente", "De la Rosa", 
 	 "Del Castillo", "Doblado", "Domínguez", 
 	 "Donato", "Dorado", "Duarte",
 	 "Dueñas", "Echeverilla", "Enríquez"
*/
