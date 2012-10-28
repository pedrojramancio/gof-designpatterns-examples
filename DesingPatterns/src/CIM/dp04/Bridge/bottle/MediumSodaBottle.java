package CIM.dp04.Bridge.bottle;

import CIM.dp04.Bridge.soda.SodaBottleAbstraction;
import CIM.dp04.Bridge.soda.SodaImplementator;

public class MediumSodaBottle extends SodaBottleAbstraction {  
   public MediumSodaBottle() {
       setSodaImp();
   }
   
   public void pourSoda() {
       SodaImplementator sodaImp = this.getSodaImp();
       for (int i = 0; i < 2; i++) {
           System.out.print("...glug...");
           sodaImp.pourSodaImp();
       }
       System.out.println(" ");
   }
}
