package vehicleclassifier;

class Vehicle{
	public void start() {
		System.out.println("Vehicle Started");
	}
	public void stop() {
		System.out.println("Vehicle Stop");
	}
}

class Car extends Vehicle{
	public void start() {
		System.out.println("Car Started");
	}
	public void stop() {
		System.out.println("Car Stop");
	}
}

class MotorCycle extends Vehicle{
	public void start() {
		System.out.println("MotorCycle Started");
	}
	public void stop() {
		System.out.println("MotorCycle Stop");
	}

}

public class VehicleClassifier {
	public static void main(String[] args) {
		MotorCycle motorcycle =new MotorCycle();
		motorcycle.start();
		motorcycle.stop();
		Car car =new Car();
		//car.start();
		car.stop();
		Vehicle vechile =new Car();
		vechile.start();
	}

}
