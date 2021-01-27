package practicaObjetos;

import java.util.Scanner;
import java.util.Random;

public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		switch (sc.nextInt()) {
		
		case 1 :
			System.out.println("Generando equipo...");
			Jugador[] equipo = Generate(num);
			System.out.println("Equipo Generado");
		break;
		case 2 :
		
		break;
			
			
		
		
		}
		System.out.println("Generando equipo...");
		Jugador[] equipo = Generate(num);
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
		
		String apellidos [] = {"Acosta", "Acu�a", "Aguilar", 
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
			 	 "Due�as", "Echeverilla", "Enr�quez"};
		return apellidos[random.nextInt(100)];
	}


	private static String nombreRand() {
		Random random = new Random();
		String nombres [] = {"Aar�n", "Ander", "Joaqu�n",
				"Abel", "Andr�s", "Joel",
				"Abelardo", "�ngel", "Jon",
				"Abraham", "An�bal", "Jordi",
				"Adalberto", "Antonio", "Jorge",
				"Adam", "Arnau", "Jos�",
				"Ad�n", "Arturo", "Jose", "Antonio",
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
