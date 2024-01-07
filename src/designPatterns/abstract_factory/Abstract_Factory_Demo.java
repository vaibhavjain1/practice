package designPatterns.abstract_factory;

class Car_Type_Factory{
	public CarFactory getCarType(String carType) {
		if(carType.equals("Suv"))
			return new SUVFactory();
		if(carType.equals("Sedan"))
			return new SedanFactory();
		else 
			return null;
	}
}

interface CarFactory{
	Car getCar(String car);
}

class SUVFactory implements CarFactory{
	public Car getCar(String car) {
		if(car.equals("Kia"))
			return new Kia();
		if(car.equals("Mahindra"))
			return new Mahindra();
		else
			return null;
	}
}

class SedanFactory implements CarFactory{
	public Car getCar(String car) {
		if(car.equals("Kia"))
			return new Kia();
		if(car.equals("Mahindra"))
			return new Mahindra();
		else
			return null;
	}
}

interface Car{
	void drive();
}

class Kia implements Car{
	@Override
	public void drive() {
		System.out.println("Driving Kia");
	}
}

class Mahindra implements Car{
	@Override
	public void drive() {
		System.out.println("Driving Mahindra");
	}
}

public class Abstract_Factory_Demo {

	public static void main(String[] args) {
		Car_Type_Factory fact = new Car_Type_Factory();
		CarFactory carFactory = fact.getCarType("Suv");
		Car car = carFactory.getCar("Kia");
		car.drive();
	}

}

