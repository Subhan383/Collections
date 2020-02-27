package org.collections.generics;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	private int vehicleId;

	public Vehicle(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + "]";
	}

	void info() {
		System.out.println("Vehicle Id is: " + getVehicleId());
	}
}

class Car extends Vehicle {
	private String carModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}

	@Override
	void info() {
		System.out.println("Car Model is: " + getCarModel());
	}
}

public class WildcardsInGenerics {
	public static void main(String[] args) {
		List<Vehicle> list=new ArrayList<>();
		list.add(new Vehicle(1));
		list.add(new Vehicle(2));
		list.add(new Vehicle(3));
		list.add(new Vehicle(4));
		list.add(new Car(1,"Audi"));
		list.add(new Car(1,"XYLO"));
		list.add(new Car(1,"Bugati"));
		list.add(new Car(1,"BMW"));
		display(list);
		
	}

	private static void display(List<? extends Vehicle> list) {
		for(Vehicle element: list) {
			element.info();
		}
		
	}
	
	
	
	
	
	

}
