import java.util.HashMap;

import composite.CompositeElement;
import composite.Element;
import composite.Header;
import composite.Paragraph;
import composite.Table;
import composite.UnorderedList;

public class ElementFactory {

	private static ElementFactory instance = null;
	private HashMap<String, Element> elementMap;

	private ElementFactory() {
		initHashMap();
	}

	public static ElementFactory getInstance() {
		if (instance == null)
			instance = new ElementFactory();

		return instance;
	}

	private void initHashMap() {
		elementMap = new HashMap<String, Element>();
		elementMap.put("paragraph", this.createParagraph());
		elementMap.put("header", this.createHeader());
		elementMap.put("table", this.createTable());
		elementMap.put("unorderedlist", this.createUnorderedList());
		elementMap.put("compositeelement", this.createCompositeElement());
	}

	public Element createElement(String elementType) {
		if (elementMap.containsKey(elementType))
			return elementMap.get(elementType);
		return null;
	}

	public Element createParagraph() {
		return new Paragraph();
	}

	private Element createUnorderedList() {
		return new UnorderedList();
	}

	private Element createTable() {
		return new Table();
	}

	private Element createHeader() {
		return new Header();
	}

	private Element createCompositeElement() {
		return new CompositeElement();
	}

}
