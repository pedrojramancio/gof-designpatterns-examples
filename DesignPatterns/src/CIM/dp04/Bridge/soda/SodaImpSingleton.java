package CIM.dp04.Bridge.soda;

public class SodaImpSingleton {  
    private static SodaImplementator sodaImp;
   
    public SodaImpSingleton(SodaImplementator sodaImpIn) {
        this.sodaImp = sodaImpIn;
    }
    
    public static SodaImplementator getTheSodaImp() {
        return sodaImp;
    }
}