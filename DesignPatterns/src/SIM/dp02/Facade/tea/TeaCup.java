package SIM.dp02.Facade.tea;

public class TeaCup {  
	   boolean teaBagIsSteeped; 
	   Water water;
	   TeaBag teaBag;
	    
	   public TeaCup() {
	       setTeaBagIsSteeped(false);
	       System.out.println("behold the beautiful new tea cup / contemple a bonita xícara de chá");
	   }    
	   
	   public void setTeaBagIsSteeped(boolean isTeaBagSteeped) {
	       teaBagIsSteeped = isTeaBagSteeped;
	   }
	   public boolean getTeaBagIsSteeped() {
	       return teaBagIsSteeped;
	   }
	    
	   public void addTeaBag(TeaBag teaBagIn) {
	       teaBag = teaBagIn;
	       System.out.println("the tea bag is in the tea cup / o saco de chá está na xícara de chá");
	   }
	   
	   public void addWater(Water waterIn) {
	       water = waterIn;
	       System.out.println("the water is in the tea cup /a água está na xícará de chá");  
	   }   
	   
	   public void steepTeaBag() {
	       if ( (teaBag != null) && 
	             ( (water != null) && 
	               (water.getWaterIsBoiling()) )
	          ) {
	          System.out.println("the tea is steeping in the cup / o chá está embebendo na xícara");
	          setTeaBagIsSteeped(true);
	       } else {
	          System.out.println("the tea is not steeping in the cup/ o chá não está embebendo na xícara");
	          setTeaBagIsSteeped(false);
	       }           
	   }
	   
	   public String toString() {
	       if (this.getTeaBagIsSteeped()) {
	           return ("A nice cuppa tea! / Uma agradável xícara de chá!");
	       } else {
	           String tempString = new String("A cup with (Uma xícara de chá com) ");
	           if (water != null) {
	                if (water.getWaterIsBoiling()) {
	                    tempString = (tempString + "boiling water (água fervendo) ");
	                } else {
	                    tempString = (tempString + "cold water (água fria) ");
	                }
	           } else {
	                tempString = (tempString + "no water (sem água)");
	           }
	 
	           if (teaBag != null) {
	                tempString = (tempString + "and a tea bag (e um saco de chá)");
	           } else {
	                tempString = (tempString + "and no tea bag (e sem saco de chá)");
	           } 
	           return tempString;
	       }
	                        
	   }
	}
