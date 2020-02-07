package command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {

	private List<Command> commands;

	public MacroCommand() {
		this.commands = new ArrayList<Command>();
	}

	public MacroCommand add(Command c) {
		this.commands.add(c);
		return this;
	}

	@Override
	public boolean redo() {
		for (Command c : commands)
			c.redo();
		return true;
	}

	@Override
	public boolean undo() {
		for (Command c : commands)
			c.undo();
		return true;
	}

}
