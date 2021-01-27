package practicaObjetos;

import java.util.Scanner;
import java.util.Random;

public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero de jugadores: ");
		int num = sc.nextInt();
		System.out.println("Generando equipo...");
		Jugador[] equipo = Generate(num);
	}

	
	private static Jugador[] Generate(int num) {
		
		Jugador [] equipito = new Jugador [num];
		
		for (int i = 0; i < num; i++) {
			equipito[i] = new Jugador(nombreRand(), apellidoRand(), posicionRand(), dorsalRand());
		}
		return equipito;
	}


	private static int dorsalRand() {
		// TODO Auto-generated method stub
		return null;
	}


	private static String posicionRand() {
		// TODO Auto-generated method stub
		return null;
	}


	private static String apellidoRand() {
		Random random = new Random();
		
		String apellidos [] = {"Acosta", "Acuña", "Aguilar", 
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
			 	 "Dueñas", "Echeverilla", "Enríquez"};
		return apellidos[random.nextInt()];
	}


	private static String nombreRand() {
		Random random = new Random();
		String nombres [] = {"Aarón", "Ander", "Joaquín",
				"Abel", "Andrés", "Joel",
				"Abelardo", "Ángel", "Jon",
				"Abraham", "Aníbal", "Jordi",
				"Adalberto", "Antonio", "Jorge",
				"Adam", "Arnau", "José",
				"Adán", "Arturo", "Jose", "Antonio",
				"Adiran", "Asier", "Jose", "Luis",
				"Adolfo", "Augusto", "Jose", "Manuel",
				"Adrià", "Aurelio", "Jose", "Maria",
				"Adrián", "Baltasar", "Juan",
				"Agustín", "Bartolomé", "Blas",
				"Aimar", "Basilio", "Juan", "Antonio",
				"Aitor", "Benito", "Boris",
				"Alano", "Benjamín", "Juan", "Carlos",	
				"Alberto", "Bernardo", "Borja",
				"Aldo", "Bienvenido", "Brahim",
				"Aleix", "Blas", "Brais",
				"Alejandro", "Boris", "Bruno",
				"Alejo", "Borja", "Calisto",
				"Alex", "Brahim", "Juan", "José",
				"Alfonso", "Brais", "Camilo",
				"Alfredo", "Bruno", "Juan", "Manuel",
				"Alonso", "Calisto", "Carlos",
				"Álvaro", "Camilo", "Julio",
				"Amadeo", "Carlos", "Cayetano",
				"Amado", "Cayetano", "César",
				"Amando", "César", "Christian",
				"Ambrosio", "Christian", "Claudio",
				"Amin", "Claudio", "Clemente",
				"Anastasio", "Clemente", "Conrado",
				"Ander", "Conrado", "Constantino"};
		return nombres[random.nextInt()];
	}
	
	
}
