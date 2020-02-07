package command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {

	private List<Command> commands;

	public MacroCommand() {
		this.commands = new ArrayList<Command>();
	}

	@Override
	public boolean redo() {
		return false;
	}

	@Override
	public boolean undo() {
		return false;
	}

}
