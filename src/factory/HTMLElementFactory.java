package factory;

import composite.Element;
import composite.html.HTMLHeader;
import composite.html.HTMLOrderedList;
import composite.html.HTMLParagraph;
import composite.html.HTMLUnorderedList;

public class HTMLElementFactory extends ElementFactory {

	private static HTMLElementFactory instance;

	private HTMLElementFactory() {
		super();
	}

	public static HTMLElementFactory getInstance() {
		if (instance == null)
			instance = new HTMLElementFactory();
		return instance;
	}

	@Override
	public Element createElement(String elementType) {
		if (elementType.equalsIgnoreCase("paragraph"))
			return createParagraph();
		else if (elementType.equalsIgnoreCase("header"))
			return createHeader();
		else if (elementType.equalsIgnoreCase("unorderedlist"))
			return createUnorderedList();
		else if (elementType.equalsIgnoreCase("orderedlist"))
			return createOrderedList();
		else
			return null;
	}

	@Override
	protected Element createParagraph() {
		return new HTMLParagraph();
	}

	@Override
	protected Element createHeader() {
		return new HTMLHeader();
	}

	@Override
	protected Element createUnorderedList() {
		return new HTMLUnorderedList();
	}

	@Override
	protected Element createOrderedList() {
		return new HTMLOrderedList();
	}

}
