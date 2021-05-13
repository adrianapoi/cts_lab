package ro.ase.cts.seminar10.command;

public class RemoteControll {
CommandInterface lightOnCommand;
CommandInterface lightOffCommand;
CommandInterface dimLightCommand;
CommandInterface increaseLightCommand;
public RemoteControll(CommandInterface lightOnCommand, CommandInterface lightOffCommand,
		CommandInterface dimLightCommand, CommandInterface increaseLightCommand) {
	super();
	this.lightOnCommand = lightOnCommand;
	this.lightOffCommand = lightOffCommand;
	this.dimLightCommand = dimLightCommand;
	this.increaseLightCommand = increaseLightCommand;
}

public void pressLightOn() {
	lightOnCommand.execute();
}

public void pressLightOffButton() {
	lightOffCommand.execute();
}

public void pressDimButton() {
	dimLightCommand.execute();
}

public void pressIncreaseLightCommand() {
	increaseLightCommand.execute();
}

}
