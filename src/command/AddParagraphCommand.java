package command;

import composite.Element;
import facade.Document;

public class AddParagraphCommand implements Command {

	private Document document;
	private String paragraphText;
	private Element element;

	public AddParagraphCommand(Document document, String paragraphText) {
		this.document = document;
		this.paragraphText = paragraphText;
	}

	@Override
	public boolean redo() {
		document.pushToUndoStack(this);
		this.element = document.createElement("paragraph").setText(paragraphText);
		return true;
	}

	@Override
	public boolean undo() {
		document.pushToRedoStack(this);
		document.removeElement(this.element);
		return true;
	}

}
