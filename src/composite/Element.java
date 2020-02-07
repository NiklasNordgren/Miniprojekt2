package composite;

import java.util.List;

import visitor.Visitable;

public abstract class Element implements Visitable {

	private String text;
	private String startTag;
	private String endTag;
	protected List<Element> elements;

	public void print() {
		System.out.println(startTag + text + endTag);
	}

	public Element setText(String text) {
		this.text = text;
		return this;
	}

	public void setStartTag(String startTag) {
		this.startTag = startTag;
	}

	public void setEndTag(String endTag) {
		this.endTag = endTag;
	}

	public String getText() {
		return this.startTag + this.text + this.endTag;
	}

	public void addElement(Element element) {
	}

	public void addElement(int index, Element element) {
	}

	public void removeElement(int index) {
	}

	public void removeElement(Element element) {
	}

	public List<Element> getElements() {
		return this.elements;
	}

}
