package SIM.dp02.Facade.tea;

public class Water {
	boolean waterIsBoiling;

	public Water() {
		setWaterIsBoiling(false);
		System.out.println("behold the wonderous water / contemple a maravilhosa água");
	}

	public void boilWater() {
		setWaterIsBoiling(true);
		System.out.println("water is boiling / a água está fervendo");
	}

	public void setWaterIsBoiling(boolean isWaterBoiling) {
		waterIsBoiling = isWaterBoiling;
	}

	public boolean getWaterIsBoiling() {
		return waterIsBoiling;
	}
}
