package CIM.dp13.AbstractFactory.classic;

class LuxurySUV implements SUV {
	private String name;

	public LuxurySUV(String sName) {
		name = sName;
	}

	public String getSUVName() {
		return name;
	}

	public String getSUVFeatures() {
		return "Luxury SUV Features ";
	};

} // End of class
