package SIM.dp09.ChainOfResponsibility.concreteHandler;

public class ProcessorC extends Processor {

	public ProcessorC(Processor p) {
		super(p);
	}

	protected String processData(String data) {
		String out = data + " C ";
		if (next != null) {
			out = next.processData(out);
		}
		return out;
	}
}