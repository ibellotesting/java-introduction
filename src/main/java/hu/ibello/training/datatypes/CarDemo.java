package hu.ibello.training.datatypes;

import hu.ibello.training.inheritance.ElectronicCar;

public class CarDemo {

	public void testCar() {
		Car car = new Car("Honda", 2005, 5000.0);
		car.displayInfo();
	}

	public void testCarType() {
		System.out.println(CarType.SEDAN.getDescription());
	}
	
	public void testElectronicCar() {
		ElectronicCar car = new ElectronicCar("Tesla", 2020, 30000.0, 50);
		car.displayInfo();
	}
	
	public static void main(String[] args) {
		CarDemo demo = new CarDemo();
		demo.testCar();
		System.out.println("----------------------------------");
		demo.testCarType();
		System.out.println("----------------------------------");
		demo.testElectronicCar();
	}
}
