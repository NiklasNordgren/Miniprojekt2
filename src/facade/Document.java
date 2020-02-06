package facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import command.AddParagraphCommand;
import command.Command;
import composite.Element;
import factory.ElementFactory;

public class Document {

	private List<Element> elements;
	private ElementFactory elementFactory;

	private Stack<Command> redoStack = new Stack<Command>();
	private Stack<Command> undoStack = new Stack<Command>();

	public Document(ElementFactory elementFactory) {
		this.elementFactory = elementFactory;
		this.elements = new ArrayList<Element>();
	}

	public Element createElement(String elementType) {
		Element element = this.elementFactory.createElement(elementType);
		this.elements.add(element);
		return element;
	}

	public void addParagraph(String paragraphText) {
		new AddParagraphCommand(this, paragraphText).redo();
	}

	public void undoParagraph() {
		this.popFromUndoStack();
	}

	public List<Element> getElements() {
		return this.elements;
	}

	public void printAll() {
		for (Element e : elements)
			e.print();
	}

	public void pushToUndoStack(Command command) {
		undoStack.push(command);
	}

	public Command popFromUndoStack() {
		if (!undoStack.isEmpty())
			return undoStack.pop();
		return null;
	}

	public void pushToRedoStack(Command command) {
		redoStack.push(command);
	}

	public Command popFromRedoStack() {
		if (!redoStack.isEmpty())
			return redoStack.pop();
		return null;
	}
}
