package command;

import composite.Element;
import facade.Document;

public class AddHeaderCommand implements Command {

	private String headerText;
	private Document document;
	private Element element;

	public AddHeaderCommand(Document document, String headerText) {
		this.document = document;
		this.headerText = headerText;
	}

	@Override
	public boolean redo() {
		this.element = document.createElement("header").setText(headerText);
		return true;
	}

	@Override
	public boolean undo() {
		document.removeElement(this.element);
		return true;
	}

}
