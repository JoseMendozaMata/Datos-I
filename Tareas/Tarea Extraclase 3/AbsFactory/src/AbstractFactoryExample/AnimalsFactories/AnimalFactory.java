package AbstractFactoryExample.AnimalsFactories;

import AbstractFactoryExample.clientObjects.*;

public abstract class AnimalFactory {
	
	public abstract Animals getAnimal(String animalType);
	
}
