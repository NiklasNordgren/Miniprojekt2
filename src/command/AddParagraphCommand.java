package command;

import facade.Document;

public class AddParagraphCommand implements Command {

	private Document document;

	public AddParagraphCommand(Document document) {
		this.document = document;
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
