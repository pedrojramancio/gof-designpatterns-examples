package CIM.dp13.AbstractFactory.classic;

abstract class VehicleFactory {
	public static final String LUXURY_VEHICLE = "Luxury";

	public static final String NON_LUXURY_VEHICLE = "Non-Luxury";

	public abstract Car getCar();

	public abstract SUV getSUV();

	public static VehicleFactory getVehicleFactory(String type) {
		if (type.equals(VehicleFactory.LUXURY_VEHICLE))
			return new LuxuryVehicleFactory();
		else if (type.equals(VehicleFactory.NON_LUXURY_VEHICLE))
			return new NonLuxuryVehicleFactory();
		else
			return new LuxuryVehicleFactory();
	}

} // End of class
