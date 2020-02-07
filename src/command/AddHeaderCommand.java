package command;

import composite.Element;
import facade.Document;

public class AddHeaderCommand implements Command {

	private String headerText;
	private Document document;
	private Element element;
	private int headerSize;

	public AddHeaderCommand(Document document, String headerText, int headerSize) {
		this.document = document;
		this.headerText = headerText;
		this.headerSize = headerSize;
	}

	@Override
	public boolean redo() {
		this.element = document.createElement("header").setText(headerText);
		this.element.setStartTag("<h" + this.headerSize + ">");
		this.element.setEndTag("</h" + this.headerSize + ">");
		return true;
	}

	@Override
	public boolean undo() {
		document.removeElement(this.element);
		return true;
	}

}
