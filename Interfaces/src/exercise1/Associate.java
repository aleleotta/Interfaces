package exercise1;

public class Associate {
	private int id;
	private String name = "";
	private int age = 0;
	
	public Associate(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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