import composite.Element;

public class ElementFactory {

	private static ElementFactory instance = null;

	private ElementFactory() {
		initHashMap();
	}

	public static ElementFactory getInstance() {
		if (instance == null)
			instance = new ElementFactory();

		return instance;
	}

	private void initHashMap() {

	}

	public Element createElement(String elementType) {

	}

}
