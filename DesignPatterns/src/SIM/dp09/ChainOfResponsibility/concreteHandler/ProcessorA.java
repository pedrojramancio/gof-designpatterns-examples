package SIM.dp09.ChainOfResponsibility.concreteHandler;

public class ProcessorA extends Processor {

	public ProcessorA(Processor p) {
		super(p);
	}

	protected String processData(String data) {
		String out = data + " A ";
        if (next != null) {
            out = next.processData(out);
        }
        return out; 
    }
}