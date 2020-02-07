package factory;

import composite.Element;
import composite.latex.LATEXHeader;
import composite.latex.LATEXOrderedList;
import composite.latex.LATEXParagraph;
import composite.latex.LATEXUnorderedList;

public class LATEXElementFactory extends ElementFactory {

	private static LATEXElementFactory instance;

	private LATEXElementFactory() {
		super();
	}

	public static LATEXElementFactory getInstance() {
		if (instance == null)
			instance = new LATEXElementFactory();
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
		return new LATEXParagraph();
	}

	@Override
	protected Element createHeader() {
		return new LATEXHeader();
	}

	@Override
	protected Element createUnorderedList() {
		return new LATEXUnorderedList();
	}

	@Override
	protected Element createOrderedList() {
		return new LATEXOrderedList();
	}

}
