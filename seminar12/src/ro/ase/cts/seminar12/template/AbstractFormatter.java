package ro.ase.cts.seminar12.template;

public abstract class AbstractFormatter {
	//template method
		public void displayOutput(int input) {
			int userInput=getInput(input);
			String formattedInput=formatInput(userInput);
			display(formattedInput);
		}
		
		public int getInput(int fakeInput) {
			System.out.println("getting input from user");
			return fakeInput;
		}
		
		public abstract String formatInput(int input);
		
		public void display(String input) {
			System.out.println(input);
		}
}
