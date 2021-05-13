package ro.ase.cts.seminar10.command;

public class IncreaseLightIntensity implements CommandInterface{
	private LightBulb lightBulb;

	public IncreaseLightIntensity(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}

	@Override
	public void execute() {
		lightBulb.increaseLightIntensity();
		
	}
}
