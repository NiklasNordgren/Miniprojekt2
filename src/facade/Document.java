package facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import command.Command;
import composite.Element;
import factory.ElementFactory;

public class Document {

	private List<Element> elements = new ArrayList<Element>();
	private ElementFactory elementFactory;

	private Stack<Command> redoStack = new Stack<Command>();
	private Stack<Command> undoStack = new Stack<Command>();

	public Document(ElementFactory elementFactory) {
		this.elementFactory = elementFactory;
	}

	public Element createElement(String elementType) {
		Element element = this.elementFactory.createElement(elementType);
		this.elements.add(element);
		return element;
	}

	public void removeElement(Element element) {
		this.elements.remove(element);
	}

	public void redo(Command c) {
		this.pushToUndoStack(c);
		c.redo();
	}

	public void undo(Command c) {
		this.pushToRedoStack(c);
		c.undo();
	}

	public void redo() {
		Command c = this.popFromRedoStack();
		c.redo();
		this.pushToUndoStack(c);
	}

	public void undo() {
		Command c = this.popFromUndoStack();
		c.undo();
		this.pushToRedoStack(c);
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
