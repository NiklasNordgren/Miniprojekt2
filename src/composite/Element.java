package composite;

import java.util.List;

public abstract class Element {

	protected String text;
	protected List<Element> elements;

	public void print() {
		System.out.println(text);
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public void addElement(int index, Element element) {
	}

	public List<Element> getElements() {
		return this.elements;
	}

}
