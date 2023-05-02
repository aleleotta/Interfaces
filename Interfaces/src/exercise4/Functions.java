package exercise4;

public class Functions {
}

/*
Define la interfaz Animal que tiene los métodos comer, dormir y hacerRuido, que son comunes a todos los animales. 
Define la clase AnimalDomestico que implementa la interfaz Animal, pero que además añade los siguientes elementos:
	Los atributos nombre, raza, peso y color.
	Los métodos vacunar y hacerCaso.
	Los métodos vacunar, dormir y comer son comunes para todos los animales domésticos.
	Los métodos hacerRuido y hacerCaso son diferentes para cada animal.
Define las clases Perro y Gato que heredan de AnimalDomestico. En estas clases se sobreescribirán los métodos hacerRuido y hacerCaso.
A continuación se explica cómo se comporta cada animal en cada caso:
Perro:
	hacerRuido: emite un ladrido.
	hacerCaso: método boolean que devuelve true el 90% de las veces.
Gato:
	hacerRuido: emite un maullido.
	hacerCaso: método boolean que devuelve true el 5% de las veces.
A su vez, la clase Perro tiene un método particular: sacarPaseo.
Los gatos tendrán otro método propio que será toserBolaPelo.
*/