package AbstractFactoryExample.AnimalsFactories;

import AbstractFactoryExample.clientObjects.*;

public class CarnivorousFactory extends AnimalFactory{

	@Override
	public Animals getAnimal(String animalType) {
		
		if(animalType == "Crocodile") {
			return new Crocodile();
		}else if(animalType == "Lion") {
			return new Lion(); 
		}else {
			System.out.println("No se puede fabricar este carnívoro");
		}
		return null;
	}

}
