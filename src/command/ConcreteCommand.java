package command;

public class ConcreteCommand implements Command {

	@Override
	public boolean redo() {
		return false;
	}

	@Override
	public boolean undo() {
		return false;
	}

}
