package SIM.dp04.Bridge;

import SIM.dp04.Bridge.bottle.MediumSodaBottle;
import SIM.dp04.Bridge.bottle.SuperSizeSodaBottle;
import SIM.dp04.Bridge.flavor.CherrySodaImp;
import SIM.dp04.Bridge.flavor.GrapeSodaImp;
import SIM.dp04.Bridge.flavor.OrangeSodaImp;
import SIM.dp04.Bridge.soda.SodaImpSingleton;

class TestBridge {
	public static void testCherryPlatform() {

		new SodaImpSingleton(new CherrySodaImp());
		System.out.println("testing medium soda on the cherry platform");
		MediumSodaBottle mediumSoda = new MediumSodaBottle();
		mediumSoda.pourSoda();
		System.out.println("testing super size soda on the cherry platform");
		SuperSizeSodaBottle superSizeSoda = new SuperSizeSodaBottle();
		superSizeSoda.pourSoda();
	}

	public static void testGrapePlatform() {

		new SodaImpSingleton(new GrapeSodaImp());
		System.out.println("testing medium soda on the grape platform");
		MediumSodaBottle mediumSoda = new MediumSodaBottle();
		mediumSoda.pourSoda();
		System.out.println("testing super size soda on the grape platform");
		SuperSizeSodaBottle superSizeSoda = new SuperSizeSodaBottle();
		superSizeSoda.pourSoda();
	}

	public static void testOrangePlatform() {

		new SodaImpSingleton(new OrangeSodaImp());
		System.out.println("testing medium soda on the orange platform");
		MediumSodaBottle mediumSoda = new MediumSodaBottle();
		mediumSoda.pourSoda();
		System.out.println("testing super size soda on the orange platform");
		SuperSizeSodaBottle superSizeSoda = new SuperSizeSodaBottle();
		superSizeSoda.pourSoda();
	}

	public static void main(String[] args) {
		testCherryPlatform();
		testGrapePlatform();
		testOrangePlatform();
	}
}