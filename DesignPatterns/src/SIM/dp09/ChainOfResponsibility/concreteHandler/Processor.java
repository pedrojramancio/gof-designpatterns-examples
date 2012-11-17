package SIM.dp09.ChainOfResponsibility.concreteHandler;

public abstract class Processor {
	protected Processor next;

	public Processor(Processor p) {
		setNextProcessor(p);
	}

	public void setNextProcessor(Processor p) {
		next = p;
	}

	abstract protected String processData(String data);
}