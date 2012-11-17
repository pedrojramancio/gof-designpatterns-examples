package SIM.dp04.Bridge.bottle;

import SIM.dp04.Bridge.soda.SodaBottleAbstraction;
import SIM.dp04.Bridge.soda.SodaImplementator;

public class SuperSizeSodaBottle extends SodaBottleAbstraction {  
   public SuperSizeSodaBottle() {
       setSodaImp();
   }
   
   public void pourSoda() {
       SodaImplementator sodaImp = this.getSodaImp();
       for (int i = 0; i < 5; i++) {
           System.out.print("...glug...");
           sodaImp.pourSodaImp();
       }
       System.out.println(" ");       
   }
}
