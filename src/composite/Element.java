package composite;

import java.util.Iterator;
import java.util.List;

public class Element {

	private List<Element> elements;

	public Element() {
		this.elements = null;
	}

	public void print() {

	}

	public void setText(String text) {
	}

	public String getText() {
		return null;
	}

	public Iterator<Element> getIterator() {
		return elements.iterator();
	}

}
