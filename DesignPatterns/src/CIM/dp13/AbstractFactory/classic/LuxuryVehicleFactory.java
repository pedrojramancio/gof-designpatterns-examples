package CIM.dp13.AbstractFactory.classic;

class LuxuryVehicleFactory extends VehicleFactory {

	public Car getCar() {
		return new LuxuryCar("Bentley");
	}

	public SUV getSUV() {
		return new LuxurySUV("Porsche Cayenne");
	}
} // End of class
