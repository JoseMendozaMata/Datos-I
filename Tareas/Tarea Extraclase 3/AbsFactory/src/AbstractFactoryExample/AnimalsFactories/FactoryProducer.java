package AbstractFactoryExample.AnimalsFactories;

//Fábrica de fábricas
public class FactoryProducer {

	public static AnimalFactory getFactory(String factoryType) {
		
		if(factoryType == "Herbivoro") {
			return new HerbivorousFactory();
		}else if(factoryType == "Carnivoro") {
			return new CarnivorousFactory();
		}else {
			System.out.println("La fabrica solicitada no existe");
		}
		
		return null;
	}
	
}
