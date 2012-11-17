package SIM.dp11.Builder;

 abstract class SoupBuffetBuilder {
    SoupBuffet soupBuffet;
        
    public SoupBuffet getSoupBuffet() {
        return soupBuffet;
    }
    
    public void buildSoupBuffet() {
        soupBuffet = new SoupBuffet();
    }
    
    public abstract void setSoupBuffetName();
        
    public void buildChickenSoup() {
        soupBuffet.chickenSoup = new ChickenSoup();
    }
//	ensopado de marisco
    public void buildClamChowder() {
        soupBuffet.clamChowder = new ClamChowder();
    }
    public void buildFishChowder() {
        soupBuffet.fishChowder = new FishChowder();
    }
    public void buildMinnestrone() {
        soupBuffet.minnestrone = new Minnestrone();
    }
    public void buildPastaFazul() {
        soupBuffet.pastaFazul = new PastaFazul();
    }
    public void buildTofuSoup() {
        soupBuffet.tofuSoup = new TofuSoup();
    }
    public void buildVegetableSoup() {
        soupBuffet.vegetableSoup = new VegetableSoup();
    }
}