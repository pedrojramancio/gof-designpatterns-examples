package SIM.dp09.ChainOfResponsibility.concreteHandler;

public class ProcessorB extends Processor {
	
	public ProcessorB(Processor p) {
		super(p);
	}
	   
    protected String processData(String data) {
    	String out = data + " B ";
        if (next != null) {
            out = next.processData(out);
        }
        return out;
    }
}