package SIM.dp11.Builder;

class BostonSoupBuffetBuilder extends SoupBuffetBuilder {
	//TODO comente este m�todo, execute novamente e veja o resultado.
	public void buildClamChowder() {
       soupBuffet.clamChowder = new BostonClamChowder();
    }
	//TODO comente este m�todo, execute novamente e veja o resultado.
	public void buildFishChowder() {
       soupBuffet.fishChowder = new BostonFishChowder();
    }    
    
    public void setSoupBuffetName() {
       soupBuffet.soupBuffetName = "Boston Soup Buffet";
    }
}

class BostonClamChowder extends ClamChowder {
    public BostonClamChowder() {
        soupName = "QuahogChowder";
        soupIngredients.clear();        
        soupIngredients.add("1 Pound Fresh Quahogs");
        soupIngredients.add("1 cup corn");    
        soupIngredients.add("1/2 cup heavy cream");
        soupIngredients.add("1/4 cup butter");    
        soupIngredients.add("1/4 cup potato chips");
    }
}

class BostonFishChowder extends FishChowder {
    public BostonFishChowder() {
        soupName = "ScrodFishChowder";
        soupIngredients.clear();        
        soupIngredients.add("1 Pound Fresh Scrod");
        soupIngredients.add("1 cup corn");    
        soupIngredients.add("1/2 cup heavy cream");
        soupIngredients.add("1/4 cup butter");    
        soupIngredients.add("1/4 cup potato chips");
    }
}