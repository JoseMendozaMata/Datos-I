import AbstractFactoryExample.clientObjects.*;
import AbstractFactoryExample.AnimalsFactories.*;

public class Test {
	public static void main(String[]args) {
		
	AnimalFactory CFactory = FactoryProducer.getFactory("Carnivoro"); 
	//Obtener un cocodrilo de la factory de carnivoros
	Animals crocodile = CFactory.getAnimal("Crocodile");
	crocodile.getOnomatopeia();

	//Obtener un le�n de la factory de carnivoros
	Animals lion = CFactory.getAnimal("Lion");
	lion.getOnomatopeia();

	//Obtener f�brica de herv�boros
	AnimalFactory HFactory = FactoryProducer.getFactory("Herbivoro");

	//Obtenemos un conejo de la fabrica de herb�voros
	Animals rabbit = HFactory.getAnimal("Rabbit");
	rabbit.getOnomatopeia();

	//Obtener un caballo de la factory de carnivoros
	Animals horse = HFactory.getAnimal("Horse");
	horse.getOnomatopeia();
	}
}
