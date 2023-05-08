package exercise1;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int id = 0;
		String name = "";
		int age = 0;
		Associate[] roster = new Associate[0];
		Scanner sc =  new Scanner(System.in);
		System.out.print("Introduce an ID: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Introduce a name: ");
		name = sc.nextLine();
		System.out.print("Introduce an age: ");
		age = sc.nextInt();
		sc.nextLine();
		sc.close();
	}
}

/*
Implementa la clase Socio que tiene los siguientes atributos:
	id: número identificativo del socio.
	nombre
	edad
Añade un constructor con parámetros y el método toString.
Haz que Socio implemente la interfaz Comparable e implementa el método compareTo de forma que los socios se ordenen
por los números de identificación (id) crecientes.
Crea un main donde compruebes que la comparación funciona correctamente.
Crea, además, un array de tipo Socio y ordénalo. Comprueba que la ordenación del array es correcta.
*/