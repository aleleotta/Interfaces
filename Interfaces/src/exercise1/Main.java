package exercise1;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int id = 0;
		String name = "";
		int age = 0;
		int option = 0;
		Associate[] roster = new Associate[10];
		Scanner sc =  new Scanner(System.in);
		Associate person;
		for(int i = 0; i < roster.length; i++) {
			person = new Associate();
			roster[i] = person;
		}
		option = 0;
		while(option != 6) {
			Associate.menu();
			option = sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1: //CREATE
				System.out.print("Introduce an ID: ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.print("Introduce a name: ");
				name = sc.nextLine();
				System.out.print("Introduce an age: ");
				age = sc.nextInt();
				sc.nextLine();
				person = new Associate(id, name, age);
				roster = Arrays.copyOf(roster, roster.length+1);
				for(int i = 0; i < roster.length; i++) {
					if(roster[i].getId() == 0) {
						roster[i] = person;
					}
				}
				break;
			case 2: //READ
				for(Associate per: roster) {
					System.out.println("\nID: " + per.getId()
					+ "\nName: " + per.getName()
					+ "\nAge: " + per.getAge() + "\n");
				}
				break;
			case 3: //UPDATE
				System.out.println("Which ID would you like to update?");
				id = sc.nextInt();
				sc.nextLine();
				for(int i = 0; i < roster.length; i++) {
					int option1 = 0;
					if(roster[i].getId() == id) {
						System.out.print("Choose an attribute to modify: ");
						option1 = sc.nextInt();
						sc.nextLine();
						switch(option1) {
						case 1: //ID
							System.out.print("ID: ");
							id = sc.nextInt();
							sc.nextLine();
							break;
						case 2: //NAME
							break;
						case 3: //AGE
							break;
						}
					}
				}
				break;
			case 4: //DELETE
				break;
			case 5: //ORDER
				for(Associate per: roster) {
					for(Associate per1: roster) {
						if(per.compareTo(per1) == -1) {
							for(int i = 0; i < roster.length; i++) {}
						} else if (per.compareTo(per1) == 1) {
							for(int i = 0; i < roster.length; i++) {}
						}
					}
				}
				break;
			case 6: //EXIT
				System.out.println("\nExiting program...\n\n\nProgram terminated,");
				break;
			default: //ERROR
				System.out.println("\nERROR!");
				break;
			}
		}
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