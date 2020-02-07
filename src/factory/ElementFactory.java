package factory;

import composite.Element;

public abstract class ElementFactory {

	public static ElementFactory getInstance() {
		return null;
	};

	abstract public Element createElement(String elementType);

	protected abstract Element createParagraph();

	protected abstract Element createHeader();

	protected abstract Element createUnorderedList();

	protected abstract Element createOrderedList();

}
