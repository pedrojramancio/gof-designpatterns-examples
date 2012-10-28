package CIM.dp07.Mediator;

class TestDvdMediator {            
    
   public static void main(String[] args) {
	   String title = "Matrix Reloaded";
       DvdMediator dvdMediator = new DvdMediator();
       DvdLowercaseTitle dvdLower = 
         new DvdLowercaseTitle(title, dvdMediator);
       DvdUpcaseTitle dvdUp = 
         new DvdUpcaseTitle(title, dvdMediator);
       
       System.out.println("Lowercase LC title :" + 
                           dvdLower.getLowercaseTitle());
       System.out.println("Lowercase super title :" + 
                           dvdLower.getTitle());   
       System.out.println("Upcase UC title :" + 
                           dvdUp.getUpcaseTitle());
       System.out.println("Upcase super title :" + 
                           dvdUp.getTitle());   
       
       dvdLower.setSuperTitleLowercase();
       
       System.out.println(" ");
       System.out.println("After Super set to LC");
       System.out.println("Lowercase LC title :" + 
                           dvdLower.getLowercaseTitle());
       System.out.println("Lowercase super title :" + 
                           dvdLower.getTitle());
       System.out.println("Upcase UC title :" + 
                           dvdUp.getUpcaseTitle());
       System.out.println("Upcase super title :" + 
                           dvdUp.getTitle());
   }
}      