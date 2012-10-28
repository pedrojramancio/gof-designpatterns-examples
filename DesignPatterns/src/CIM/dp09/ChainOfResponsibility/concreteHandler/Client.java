package CIM.dp09.ChainOfResponsibility.concreteHandler;

public class Client {
    public static void main(String[] args) {
    	String text = "Letters: ";
        Processor single, full;
         
        single = new ProcessorA(null);
        full = new ProcessorA(new ProcessorB(new ProcessorC(null)));
        
        System.out.println("Single Processing: " + single.processData(text));
        System.out.println("Full Processing: " + full.processData(text));
        
    }
}