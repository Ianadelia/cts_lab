package ro.ase.cts.seminar10.chain;

public abstract class AbstractLogger {

	protected Verbosity level;
	private AbstractLogger nextLogger;
	public void setNextLogger(AbstractLogger logger) {
		this.nextLogger=logger;
	}
	
	public void logMessage(Verbosity level, String message) {
		if(this.level<= level) {
			
		}
	}
	
	abstract void write(String message);
}
