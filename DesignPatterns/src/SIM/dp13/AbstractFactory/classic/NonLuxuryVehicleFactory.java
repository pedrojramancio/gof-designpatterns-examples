package SIM.dp13.AbstractFactory.classic;

class NonLuxuryVehicleFactory extends VehicleFactory {

	public Car getCar() {
		return new NonLuxuryCar("Fiat 147");
	}

	public SUV getSUV() {
		return new NonLuxurySUV("Kombi");
	}
} // End of class
