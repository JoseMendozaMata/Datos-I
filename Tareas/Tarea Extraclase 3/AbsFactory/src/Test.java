import AbstractFactoryExample.clientObjects.*;
import AbstractFactoryExample.AnimalsFactories.*;

public class Test {
	public static void main(String[]args) {
		
	AnimalFactory CFactory = FactoryProducer.getFactory("Carnivoro"); 
	//Obtener un cocodrilo de la factory de carnivoros
	Animals crocodile = CFactory.getAnimal("Crocodile");
	crocodile.getOnomatopeia();

	//Obtener un león de la factory de carnivoros
	Animals lion = CFactory.getAnimal("Lion");
	lion.getOnomatopeia();

	//Obtener fábrica de hervíboros
	AnimalFactory HFactory = FactoryProducer.getFactory("Herbivoro");

	//Obtenemos un conejo de la fabrica de herbívoros
	Animals rabbit = HFactory.getAnimal("Rabbit");
	rabbit.getOnomatopeia();

	//Obtener un caballo de la factory de carnivoros
	Animals horse = HFactory.getAnimal("Horse");
	horse.getOnomatopeia();
	}
}
