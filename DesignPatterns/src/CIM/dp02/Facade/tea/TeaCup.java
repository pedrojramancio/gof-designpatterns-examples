package CIM.dp02.Facade.tea;

public class TeaCup {  
	   boolean teaBagIsSteeped; 
	   Water water;
	   TeaBag teaBag;
	    
	   public TeaCup() {
	       setTeaBagIsSteeped(false);
	       System.out.println("behold the beautiful new tea cup / contemple a bonita x�cara de ch�");
	   }    
	   
	   public void setTeaBagIsSteeped(boolean isTeaBagSteeped) {
	       teaBagIsSteeped = isTeaBagSteeped;
	   }
	   public boolean getTeaBagIsSteeped() {
	       return teaBagIsSteeped;
	   }
	    
	   public void addTeaBag(TeaBag teaBagIn) {
	       teaBag = teaBagIn;
	       System.out.println("the tea bag is in the tea cup / o saco de ch� est� na x�cara de ch�");
	   }
	   
	   public void addWater(Water waterIn) {
	       water = waterIn;
	       System.out.println("the water is in the tea cup /a �gua est� na x�car� de ch�");  
	   }   
	   
	   public void steepTeaBag() {
	       if ( (teaBag != null) && 
	             ( (water != null) && 
	               (water.getWaterIsBoiling()) )
	          ) {
	          System.out.println("the tea is steeping in the cup / o ch� est� embebendo na x�cara");
	          setTeaBagIsSteeped(true);
	       } else {
	          System.out.println("the tea is not steeping in the cup/ o ch� n�o est� embebendo na x�cara");
	          setTeaBagIsSteeped(false);
	       }           
	   }
	   
	   public String toString() {
	       if (this.getTeaBagIsSteeped()) {
	           return ("A nice cuppa tea! / Uma agrad�vel x�cara de ch�!");
	       } else {
	           String tempString = new String("A cup with (Uma x�cara de ch� com) ");
	           if (water != null) {
	                if (water.getWaterIsBoiling()) {
	                    tempString = (tempString + "boiling water (�gua fervendo) ");
	                } else {
	                    tempString = (tempString + "cold water (�gua fria) ");
	                }
	           } else {
	                tempString = (tempString + "no water (sem �gua)");
	           }
	 
	           if (teaBag != null) {
	                tempString = (tempString + "and a tea bag (e um saco de ch�)");
	           } else {
	                tempString = (tempString + "and no tea bag (e sem saco de ch�)");
	           } 
	           return tempString;
	       }
	                        
	   }
	}
