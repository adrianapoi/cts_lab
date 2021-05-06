package ro.ase.cts.seminar10.chain;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(Verbosity verbosity) {
		super(verbosity);
		// TODO Auto-generated constructor stub
	}

	@Override
	void write(String message) {
		System.err.println(ErrorLogger.class.getName()+" : "+message);
		
	}
}
