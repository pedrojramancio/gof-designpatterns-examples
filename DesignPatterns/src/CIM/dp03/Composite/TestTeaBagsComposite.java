package CIM.dp03.Composite;

class TestTeaBagsComposite {

	public static void main(String[] args) {
		System.out.println("Creating tinOfTeaBags");
		ComponentTeaBags tinOfTeaBags = new CompositeTinOfTeaBags("tin of tea bags");
		System.out.println("The tinOfTeaBags has "
				+ tinOfTeaBags.countTeaBags() + " tea bags in it.");

		System.out.println(" ");

		System.out.println("Creating teaBag1");
		ComponentTeaBags teaBag1 = new LeafOneTeaBag("tea bag 1");
		System.out.println("The teaBag1 has " + teaBag1.countTeaBags()
				+ " tea bags in it.");

		System.out.println(" ");

		System.out.println("Creating teaBag2");
		ComponentTeaBags teaBag2 = new LeafOneTeaBag("tea bag 2");
		System.out.println("The teaBag2 has " + teaBag2.countTeaBags()
				+ " tea bags in it.");

		System.out.println(" ");

		System.out.println("Putting teaBag1 and teaBag2 in tinOfTeaBags");
		if (tinOfTeaBags.add(teaBag1)) {
			System.out.println("teaBag1 added successfully to tinOfTeaBags");
		} else {
			System.out.println("teaBag1 not added successfully tinOfTeaBags");
		}
		if (tinOfTeaBags.add(teaBag2)) {
			System.out.println("teaBag2 added successfully to tinOfTeaBags");
		} else {
			System.out.println("teaBag2 not added successfully tinOfTeaBags");
		}
		System.out.println("The tinOfTeaBags now has "
				+ tinOfTeaBags.countTeaBags() + " tea bags in it.");

		System.out.println(" ");

		System.out.println("Creating smallTinOfTeaBags");
		ComponentTeaBags smallTinOfTeaBags = new CompositeTinOfTeaBags("small tin of tea bags");
		System.out.println("The smallTinOfTeaBags has "
				+ smallTinOfTeaBags.countTeaBags() + " tea bags in it.");
		System.out.println("Creating teaBag3");
		ComponentTeaBags teaBag3 = new LeafOneTeaBag("tea bag 3");
		System.out.println("The teaBag3 has " + teaBag3.countTeaBags()
				+ " tea bags in it.");
		System.out.println("Putting teaBag3 in smallTinOfTeaBags");
		if (smallTinOfTeaBags.add(teaBag3)) {
			System.out
					.println("teaBag3 added successfully to smallTinOfTeaBags");
		} else {
			System.out
					.println("teaBag3 not added successfully to smallTinOfTeaBags");
		}
		System.out.println("The smallTinOfTeaBags now has "
				+ smallTinOfTeaBags.countTeaBags() + " tea bags in it.");

		System.out.println(" ");

		System.out.println("Putting smallTinOfTeaBags in tinOfTeaBags");
		if (tinOfTeaBags.add(smallTinOfTeaBags)) {
			System.out
					.println("smallTinOfTeaBags added successfully to tinOfTeaBags");
		} else {
			System.out
					.println("smallTinOfTeaBags not added successfully to tinOfTeaBags");
		}
		System.out.println("The tinOfTeaBags now has "
				+ tinOfTeaBags.countTeaBags() + " tea bags in it.");

		System.out.println(" ");

		System.out.println("Removing teaBag2 from tinOfTeaBags");
		if (tinOfTeaBags.remove(teaBag2)) {
			System.out
					.println("teaBag2 successfully removed from tinOfTeaBags");
		} else {
			System.out
					.println("teaBag2 not successfully removed from tinOfTeaBags");
		}
		System.out.println("The tinOfTeaBags now has "
				+ tinOfTeaBags.countTeaBags() + " tea bags in it.");
	}
}