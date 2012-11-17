package SIM.dp12.FactoryMethod.fluffy;

class TestSoupFactoryMethod {

	public static void main(String[] args) {

		buildSoup(new SoupFactoryMethod());
		buildSoup(new BostonSoupFactoryMethodSubclass());
		buildSoup(new HonoluluSoupFactoryMethodSubclass());

	}

	private static void buildSoup(SoupFactoryMethod soupFactoryMethod) {
		SoupBuffet soupBuffet = soupFactoryMethod.makeSoupBuffet();
		soupBuffet.setSoupBuffetName(soupFactoryMethod.makeBuffetName());
		soupBuffet.setChickenSoup(soupFactoryMethod.makeChickenSoup());
		soupBuffet.setClamChowder(soupFactoryMethod.makeClamChowder());
		soupBuffet.setFishChowder(soupFactoryMethod.makeFishChowder());
		soupBuffet.setMinnestrone(soupFactoryMethod.makeMinnestrone());
		soupBuffet.setPastaFazul(soupFactoryMethod.makePastaFazul());
		soupBuffet.setTofuSoup(soupFactoryMethod.makeTofuSoup());
		soupBuffet.setVegetableSoup(soupFactoryMethod.makeVegetableSoup());
		System.out.println("At the  " + soupBuffet.getSoupBuffetName()
				+ soupBuffet.getTodaysSoups());

	}

}