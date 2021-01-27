package practicaObjetos;


import java.util.Scanner;

public class Persona {

	protected String nombre;
	protected String apellidos;
	protected String DNI;
	protected int sueldo;
	protected int edad;
	
	public void imprimir() {
		System.out.println("Nombre: " +this.nombre+ " " +this.apellidos);
		System.out.println("DNI: "+this.DNI + " Edad: "+this.edad);
		System.out.println("Sueldo bruto: " + this.sueldo);
	}
	

	protected void setDatos() {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombre: ");
		this.nombre = sc.nextLine();
		System.out.print("Apellidos: ");
		this.apellidos = sc.nextLine();
		System.out.print("DNI: ");
		this.DNI = sc.nextLine();
		System.out.print("Edad: ");
		this.edad = sc.nextInt();
		System.out.print("Sueldo: ");
		this.sueldo = sc.nextInt();
	}
	
}