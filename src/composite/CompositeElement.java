package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeElement extends Element {
	
	public CompositeElement() {
		this.elements = new ArrayList<Element>();
	}
	
	@Override
	public void print() {
		for(Element e : elements)
			System.out.println(e.text);
	}

	@Override
	public void addElement(Element element) {
		this.elements.add(element);
	}
	
	@Override
	public List<Element> getElements() {
		return this.elements;
	}
	
	@Override
	public void setText(String text) {
	}

}
