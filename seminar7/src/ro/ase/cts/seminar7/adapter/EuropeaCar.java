package ro.ase.cts.seminar7.adapter;

public abstract class EuropeaCar {
	private String model;

	public EuropeaCar(String model) {
		super();
		this.model = model;
	}

	public abstract int getMaxSpeed();
}
