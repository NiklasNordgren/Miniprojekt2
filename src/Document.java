import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import composite.Element;

public class Document {

	private List<Element> elements;

	public Document() {
		this.elements = new ArrayList<Element>();
	}

	public void addElement(Element e) {
		this.elements.add(e);
	}

	public Iterator<Element> getIterator() {
		return this.elements.iterator();
	}

}
