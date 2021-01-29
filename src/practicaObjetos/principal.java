package practicaObjetos;

import java.util.Scanner;
import java.util.Random;

public class principal {

	public static void main(String[] args) {
		Jugador[] equipo = null;
		Scanner sc = new Scanner(System.in);
		int res = 0;
		System.out.println("Numero de jugadores: ");
		int num = sc.nextInt();
		System.out.println("¿Qué quiere hacer?");
		System.out.println("1 - Generar Equipo");
		System.out.println("2 - Desordenar Equipo");
		System.out.println("3 - Buscar jugador");
		System.out.println("4 - Ordenar Equipo (Bubble)");
		System.out.println("5 - Ordenar Equipo (Quick)");
		System.out.println("6 - Comparar Algortimos de Orden");
		System.out.println("7 - Salir");
		do {
			res = sc.nextInt();
			switch (res) {
			
			case 1 :
				System.out.println("Generando equipo...");
				equipo = Generate(num);
				System.out.println("Equipo Generado");
				for (int i = 0; i < equipo.length; i++) {
					System.out.print(equipo[i].getNombre() + " ");
					System.out.print(equipo[i].getApellidos()+ " ");
					System.out.print(equipo[i].getPosicion()+ " ");
					System.out.println(equipo[i].getDorsal()+ " ");
				}
			break;
			case 2 :
				System.out.println("Desordenando equipo...");
				if (equipo != null) {
					DesordenarEquipo(equipo);
					System.out.println("Equipo desordenado");
					for (int i = 0; i < equipo.length; i++) {
						System.out.print(equipo[i].getNombre() + " ");
						System.out.print(equipo[i].getApellidos()+ " ");
						System.out.print(equipo[i].getPosicion()+ " ");
						System.out.println(equipo[i].getDorsal()+ " ");
					}
				}
				else System.out.println("No existen jugadores en el equipo.");
			
				
			break;
			case 3 :
				System.out.println("Inserte nombre, apellido o dorsal");
				if (BuscarJugador(sc.next(), equipo) == null) System.out.println("No se ha encontrado el jugador"); 
				System.out.println("Jugador encontrado");
			break;
			case 4 :
				System.out.println("Ordenando equipo(Bubble)...");
			//	OrdenarEquipoBubble();
				System.out.println("Equipo Ordenado");
			break;
			case 5 :
				System.out.println("Ordenando equipo(Quick)...");
			//	OrdenarEquipoQuick();
				System.out.println("Equipo ordenado");
			break;
			case 6 :
				System.out.println("Comparando algoritmos de orden...");
			//	AlgComparados();
				System.out.println("Algoritmos comparados");
			break;	
			
			
			}
			System.out.println();
			System.out.println("¿Qué quiere hacer?");
			System.out.println("1 - Generar Equipo");
			System.out.println("2 - Desordenar Equipo");
			System.out.println("3 - Buscar jugador");
			System.out.println("4 - Ordenar Equipo (Bubble)");
			System.out.println("5 - Ordenar Equipo (Quick)");
			System.out.println("6 - Comparar Algortimos de Orden");
			System.out.println("7 - Salir");
		} while(res != 7);
		System.out.println("test");
	
	}

	
	private static Jugador BuscarJugador(String jugador, Jugador [] equipo) {
		Jugador [] candidatos;
		
		if (jugador.charAt(0) <= '9' || jugador.charAt(0) >= '0') {
			int dorsal = Integer.parseInt(jugador);
			for (Jugador num : equipo) {
				if (num.getDorsal() == dorsal) return num;
			}
		}else {
			for (Jugador nombre : equipo) {
				if (nombre.getNombre().equalsIgnoreCase(jugador)) return nombre ;
				else if (nombre.getApellidos().equalsIgnoreCase(jugador)) return nombre;
			}
		}
		return null;
	}


	private static Jugador [] DesordenarEquipo(Jugador [] equipo) {
		Jugador aux;
		Random rPos = new Random();
		int last, anterior;
		for (int i = 0; i < Math.random() * (equipo.length*3 - equipo.length +1) + equipo.length; i++) {
			last = rPos.nextInt(equipo.length-1);
			aux = equipo[last];
			anterior = rPos.nextInt(equipo.length-1);
			equipo[last] = equipo[anterior];
			equipo[anterior] = aux;
			
		}
		return equipo;
	}


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
		
		String apellidos [] = {"Acosta", "Acuña", "Aguilar", 
				"Aguirre", "Agustín", "Ahumada", 
				"Alanis", "Alarcón", "Paredes", 
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
			 	 "Daniel", "Darío", "Jones", 
			 	 "De Aguilar", "De Alba", "De la Cruz", 
			 	 "De la Cuesta", "De la Fuente", "De la Rosa", 
			 	 "Del Castillo", "Doblado", "Domínguez", 
			 	 "Donato", "Dorado", "Duarte",
			 	 "Dueñas", "Echeverilla", "Enríquez"};
		return apellidos[random.nextInt(100)];
	}


	private static String nombreRand() {
		Random random = new Random();
		String nombres [] = {"Aarón", "Ander", "Armando",
				"Abel", "Andrés", "Joel",
				"Abelardo", "Ángel", "Jon",
				"Abraham", "Aníbal", "Jordi",
				"Adalberto", "Antonio", "Jorge",
				"Adam", "Arnau", "José",
				"Adán", "Arturo", "Marco", "Antonio",
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
		return nombres[random.nextInt(100)];
	}
	
	
}
