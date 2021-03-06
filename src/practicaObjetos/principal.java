// Gerardo Mar�n Jaime
// Alejandro Vicente Jarnald

package practicaObjetos;

import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class principal {

	// Main methid shows the menu, asks for input and enter the switch statement where different methods are called
	public static void main(String[] args) {
		Jugador[] equipo = null;
		Scanner sc = new Scanner(System.in);
		int res = 0;
		System.out.println("Numero de jugadores: ");
		int num = sc.nextInt();
		System.out.println("�Qu� quiere hacer?");
		System.out.println("1 - Generar Equipo");
		System.out.println("2 - Desordenar Equipo");
		System.out.println("3 - Buscar jugador");
		System.out.println("4 - Ordenar Equipo (Bubble)");
		System.out.println("5 - Ordenar Equipo (Quick)");
		System.out.println("6 - Comparar Algortimos de Orden");
		System.out.println("7 - Salir");
		do {
			res = sc.nextInt();
			if (res < 1 && res > 7) {
			System.out.println("El n�mero debe estar entre 1 y 7 inclusive.");
			res = sc.nextInt();
			}
			switch (res) {
			
			case 1 :
				System.out.println("Generando equipo...");
				equipo = Generate(num);
				System.out.println("Equipo Generado");
				for (int i = 0; i < equipo.length; i++)  System.out.println(Imprimir (equipo[i]));
			break;
			case 2 :
				System.out.println("Desordenando equipo...");
				if (equipo != null) {
					DesordenarEquipo(equipo);
					System.out.println("Equipo desordenado");
					for (int i = 0; i < equipo.length; i++)  System.out.println(Imprimir(equipo[i]));
				
				}
				else System.out.println("No existen jugadores en el equipo.");
			
				
			break;
			case 3 :
				System.out.println("Inserte nombre, apellido o dorsal");
				String jug = sc.next();
				Jugador buscado = BuscarJugador(jug, equipo);
				if (buscado == null) System.out.println("No se ha encontrado el jugador");
				else {
				System.out.println("Jugador encontrado");
				System.out.println(Imprimir(buscado));
				}
			break;
			case 4 :
				System.out.println("Ordenando equipo(Bubble)...");
				if(equipo != null) {OrdenarEquipoBubble(equipo);
				System.out.println("Equipo Ordenado");
				for (int i = 0; i < equipo.length; i++)  System.out.println(Imprimir(equipo[i]));
				}
				else System.err.println("No existe el equipo");
			break;
			case 5 :
				System.out.println("Ordenando equipo(Quick)...");
				Jugador [] jugQuick = OrdenarEquipoQuick(equipo, 0, equipo.length-1);
				for (int i = 0; i < jugQuick.length-1; i++) {
					if (jugQuick[i] != null) System.out.println(Imprimir(jugQuick[i]));
					else break;
				}
				System.out.println("Equipo ordenado");
			break;
			case 6 :
				System.out.println("Comparando algoritmos de orden...");
				AlgComparados(equipo);
				System.out.println("Algoritmos comparados");
			break;	
			
			
			}
			System.out.println();
			System.out.println("�Qu� quiere hacer?");
			System.out.println("1 - Generar Equipo");
			System.out.println("2 - Desordenar Equipo");
			System.out.println("3 - Buscar jugador");
			System.out.println("4 - Ordenar Equipo (Bubble)");
			System.out.println("5 - Ordenar Equipo (Quick)");
			System.out.println("6 - Comparar Algortimos de Orden");
			System.out.println("7 - Salir");
		} while(res != 7);
	
	}
	
	// This method calls both sorting algorithms and uses the execution time difference to check their efficiency 
	private static void AlgComparados(Jugador [] equipo) {
		
		//Bubble
		Jugador [] miArr = Arrays.copyOf(equipo, equipo.length);
		Jugador [] bub = DesordenarEquipo(miArr);
		
		long inicio = System.nanoTime();
		OrdenarEquipoBubble(bub);
		long fin = System.nanoTime();
		double res = (double) (fin - inicio) / 1e+9;
		System.out.println("Bubblesort ha tardado: " + res + ".");

		//Quick
		Jugador [] miArr2 = Arrays.copyOf(equipo, equipo.length);
		Jugador [] qu = DesordenarEquipo(miArr2);
		
		long inicio2 = System.nanoTime();
		OrdenarEquipoQuick(qu, 0, qu.length-1 );
		long fin2 = System.nanoTime();
		double res2 = (double) (fin2 - inicio2) / 1e+9;
		System.out.println("Quicksort ha tardado: " + res2 + ".");
		
		if (res < res2) System.out.println("El ganador es Bubblesort!");
		else System.out.println("El ganador es Quicksort!");
		
	}
	
	
	private static Jugador [] OrdenarEquipoQuick(Jugador[] equipo, int izq, int der) {
	
			Jugador pivot = equipo[izq];
			int i = izq;
			int j = der;
			Jugador temp;
			
			while (i<j) {
				while (equipo[i].getDorsal() <= pivot.getDorsal() && i < j) i++;
				while (equipo[j].getDorsal() > pivot.getDorsal()) j--;
					if (i < j) {
						temp = equipo[i];
						equipo[i] = equipo[j];
						equipo[j] = temp;
					}
			}
			equipo[izq] = equipo[j];
			equipo[j]=pivot;
			
			if (izq < j-1) OrdenarEquipoQuick(equipo, izq, j-1);
			if (der > j+1) OrdenarEquipoQuick(equipo, j+1, der);

		return equipo;
	}

	private static Jugador [] OrdenarEquipoBubble(Jugador[] equipo) {
		
		Jugador temp;
		boolean ordenado = false;
		for (int i = 0; i < equipo.length-1; i++) {
			if (ordenado) {
			return equipo;
			}
			ordenado = true;
			for (int j = 0; j < equipo.length-1 -i -1; j++) {
				if (equipo[j].getDorsal() > equipo[j+1].getDorsal()) { 
                    temp = equipo[j];
                    equipo[j] = equipo[j+1];
                    equipo[j+1] = temp;
                    ordenado = false;
				}
			}
		}
		return equipo;
	}
	
	
	private static String Imprimir (Jugador jugador) {
		return jugador.getNombre() + " " +jugador.getApellidos() + " " + jugador.getPosicion() + " " + jugador.getDorsal() + ".";
	}
	
	// Searchs player, if the first character of jugador is a number it'll call the method which searchs by dorsal using binary search
	private static Jugador BuscarJugador(String jugador, Jugador [] equipo) {
		Jugador [] candidatos = null;
		Jugador res = null;
		if (jugador.charAt(0) == '0' || jugador.charAt(0) == '1' || jugador.charAt(0) == '2' || jugador.charAt(0) == '3' || jugador.charAt(0) == '4' || jugador.charAt(0) == '5' || jugador.charAt(0) == '6' || jugador.charAt(0) == '7' || jugador.charAt(0) == '8' || jugador.charAt(0) == '9') {
			int dorsal = Integer.parseInt(jugador);
			res = BuscarDorsalBinaria(dorsal, equipo);
		}else {
			candidatos = BuscarNombre(jugador, equipo);
			System.out.println("resultados");
			for (Jugador jug : candidatos) System.out.println(Imprimir(jug));
			
		}
		return res;
	}

	
	// Searchs player by name, known error not fixed yet. Kind of working though
	@SuppressWarnings("null") 

	private static Jugador [] BuscarNombre(String jugador, Jugador[] equipo) {
		
		Jugador [] miEquipo = new Jugador[equipo.length];
		int j = 0;
		 for (int i = 0; i < equipo.length; i++) {
			 System.out.println("en el for: " +  equipo[i].getNombre().toUpperCase());
			 System.out.println("jugador: "+ jugador.toUpperCase());
			 if (equipo[i].getNombre().equalsIgnoreCase(jugador)) {
				 System.out.println("encontrado");
				 miEquipo[j] = equipo[i];
				 j++;
			 }
		 }
		return miEquipo;
	}
	
// Old dorsal search, dumped 'cause we had to do a binary search
	private static Jugador BuscarDorsal(int dorsal, Jugador [] equipo) {
		int i = 0;
		int j = equipo.length -1;
		boolean found = false;
		
		while(i < j && j > i && !found ) {
			if (equipo[i].getDorsal() == dorsal || equipo[j].getDorsal() == dorsal) found = true;
			else {
				i++;
				j--;
			}
		}
		if (found) {
			if (equipo[i].getDorsal() == dorsal) return equipo[i];
			else return equipo[j];
		}
		
		return null;
	}
	
	// Binary search using dorsal value
	private static Jugador BuscarDorsalBinaria (int dorsal, Jugador [] equipo) {
		int l = 0;
		int r = equipo.length -1;
		int m = (l+r)/2;
		
		while (l <= r) {
			m = (l+r)/2; 
			  
	            if ( dorsal == (equipo[m].getDorsal())) return equipo[m]; 
	            
	            if (dorsal > equipo[m].getDorsal()) l = m + 1;
	            
	            else r = m - 1; 
	        } 
			
		return null;
	}


	private static Jugador [] DesordenarEquipo(Jugador [] equipo) {
		Jugador aux;
		Random rPos = new Random();
		int last, anterior;
		// get a range from 0 to a random number being it maximum value three times the team length
		for (int i = 0; i < Math.random() * (equipo.length*3 - equipo.length +1) + equipo.length; i++) { 
			last = rPos.nextInt(equipo.length-1); //get a random number within the range of the array
			aux = equipo[last]; //copy the content of that random index
			anterior = rPos.nextInt(equipo.length-1); //get another random index
			equipo[last] = equipo[anterior]; //copy the content of the index into the one we had copied to the aux variable
			equipo[anterior] = aux; //get that last index and replace it with aux, thus switching both indexes together
			//repeat
		}
		return equipo;
	}

	//Generates a new team and returns it
	private static Jugador[] Generate(int num) {
		
		Jugador [] equipito = new Jugador [num];
		
		for (int i = 0; i < num; i++) {
			equipito[i] = new Jugador(nombreRand(), apellidoRand(), posicionRand(), i);
		}
		return equipito;
	}

	private static String posicionRand() {
		Random random = new Random();
		String [] posiciones = {"portero","defensa", "centrocampista", "delantero"};
		return posiciones[random.nextInt(4)];
	}


	private static String apellidoRand() {
		Random random = new Random();
		
		String apellidos [] = {"Acosta", "Acu�a", "Aguilar", 
				"Aguirre", "Agust�n", "Ahumada", 
				"Alanis", "Alarc�n", "Paredes", 
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
			 	 "Daniel", "Dar�o", "Jones", 
			 	 "De Aguilar", "De Alba", "De la Cruz", 
			 	 "De la Cuesta", "De la Fuente", "De la Rosa", 
			 	 "Del Castillo", "Doblado", "Dom�nguez", 
			 	 "Donato", "Dorado", "Duarte",
			 	 "Due�as", "Echeverilla", "Enr�quez"};
		return apellidos[random.nextInt(100)];
	}


	private static String nombreRand() {
		Random random = new Random();
		String nombres [] = {"Aar�n", "Ander", "Armando",
				"Abel", "Andr�s", "Joel",
				"Abelardo", "�ngel", "Jon",
				"Abraham", "An�bal", "Jordi",
				"Adalberto", "Antonio", "Jorge",
				"Adam", "Arnau", "Jos�",
				"Ad�n", "Arturo", "Marco", "Antonio",
				"Adiran", "Asier", "Jose", "Luis",
				"Adolfo", "Augusto", "Jose", "Manuel",
				"Adri�", "Aurelio", "Jose", "Maria",
				"Adri�n", "Baltasar", "Juan",
				"Agust�n", "Bartolom�", "Blas",
				"Aimar", "Basilio", "Juan", "Antonio",
				"Aitor", "Benito", "Boris",
				"Alano", "Benjam�n", "Juan", "Carlos",	
				"Alberto", "Bernardo", "Borja",
				"Aldo", "Bienvenido", "Brahim",
				"Aleix", "Blas", "Brais",
				"Alejandro", "Boris", "Bruno",
				"Alejo", "Borja", "Calisto",
				"Alex", "Brahim", "Juan", "Jos�",
				"Alfonso", "Brais", "Camilo",
				"Alfredo", "Bruno", "Juan", "Manuel",
				"Alonso", "Calisto", "Carlos",
				"�lvaro", "Camilo", "Julio",
				"Amadeo", "Carlos", "Cayetano",
				"Amado", "Cayetano", "C�sar",
				"Amando", "C�sar", "Christian",
				"Ambrosio", "Christian", "Claudio",
				"Amin", "Claudio", "Clemente",
				"Anastasio", "Clemente", "Conrado",
				"Ander", "Conrado", "Constantino"};
		return nombres[random.nextInt(100)];
	}
	
	
}
