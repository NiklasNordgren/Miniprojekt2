package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeElement extends Element {

	public CompositeElement() {
		this.elements = new ArrayList<Element>();
	}

	@Override
	public void print() {
		for (Element e : elements)
			System.out.println(e.getText());
	}

	@Override
	public void addElement(Element element) {
		this.elements.add(element);
	}

	@Override
	public void addElement(int index, Element element) {
		this.elements.add(index, element);
	}

	@Override
	public void removeElement(int index) {
		this.elements.remove(index);
	}

	@Override
	public void removeElement(Element element) {
		this.elements.remove(element);
	}

	@Override
	public List<Element> getElements() {
		return this.elements;
	}

	@Override
	public Element setText(String text) {
		return this;
	}

}
