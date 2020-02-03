package facade;

import java.util.ArrayList;
import java.util.List;

import composite.Element;
import factory.ElementFactory;

public class Document {

	private List<Element> elements;
	private ElementFactory elementFactory;

	public Document(ElementFactory elementFactory) {
		this.elementFactory = elementFactory;
		this.elements = new ArrayList<Element>();
	}

	public Element createElement(String elementType) {
		Element element = this.elementFactory.createElement(elementType);
		this.elements.add(element);
		return element;
	}

	public List<Element> getElements() {
		return this.elements;
	}

	public void printAll() {
		for (Element e : elements) {
			e.print();
		}

	}

	public void addToUndoStack() {
		// TODO Auto-generated method stub

	}
}
