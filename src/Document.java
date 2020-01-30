import java.util.ArrayList;
import java.util.List;

import composite.Element;

public class Document {

	private List<Element> elements;
	private ElementFactory elementFactory;

	public Document() {
		this.elementFactory = ElementFactory.getInstance();
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

			System.out.println(e.getText());
		}

	}
}
