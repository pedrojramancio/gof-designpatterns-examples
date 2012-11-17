package SIM.dp04.Bridge.soda;

/**
 * @author pedro.delima
 * 
 * Esta classe representa a abstração da interface que se quer utilizar,
 * no caso da garrafa de soda
 */


public abstract class SodaBottleAbstraction {  
   SodaImplementator sodaImp; 
   
   public void setSodaImp() {
       this.sodaImp = SodaImpSingleton.getTheSodaImp();
   }
   public SodaImplementator getSodaImp() {
       return this.sodaImp;
   }
   
   public abstract void pourSoda();
}
