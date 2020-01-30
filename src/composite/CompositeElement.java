package composite;

import java.util.ArrayList;

public class CompositeElement extends Element {

	public CompositeElement() {
		this.elements = new ArrayList<Element>();
	}

	public void addElement(Element element) {
		this.elements.add(element);
	}

}
