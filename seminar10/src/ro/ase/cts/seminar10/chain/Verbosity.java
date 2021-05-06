package ro.ase.cts.seminar10.chain;

public enum Verbosity {
	INFO(1), DEBUG(2), ERROR(3);

	public int verbosity;

	private Verbosity(int i) {
		// TODO Auto-generated constructor stub
	}

	public int getVerbosity() {
		return verbosity;
	}

}
