package AbstractFactoryExample.AnimalsFactories;

import AbstractFactoryExample.clientObjects.*;

public class HerbivorousFactory extends AnimalFactory{

	@Override
	public Animals getAnimal(String animalType) {
		
		if(animalType == "Rabbit") {
			return new Rabbit();
		}else if(animalType == "Horse") {
			return new Horse(); 
		}else {
			System.out.println("No se puede fabricar este herbívoro");
		}
		return null;
	}

}