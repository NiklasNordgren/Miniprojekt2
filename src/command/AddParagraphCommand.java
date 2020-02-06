package command;

import facade.Document;

public class AddParagraphCommand implements Command {

	private Document document;
	private String paragraphText;

	public AddParagraphCommand(Document document, String paragraphText) {
		this.document = document;
		this.paragraphText = paragraphText;
	}

	@Override
	public boolean redo() {
		document.pushToUndoStack(this);
		document.createElement("paragraph").setText(paragraphText);

		return true;
	}

	@Override
	public boolean undo() {
		document.pushToRedoStack(this);

		return true;
	}

}
