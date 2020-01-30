import java.util.List;

import composite.Element;

public class Main {

	public static void main(String[] args) {

		Document document = new Document();

		Element paragraph = document.createElement("paragraph");
		paragraph.setText("hej");
		Element header = document.createElement("header");
		header.setText("mursice");

		List<Element> elements = document.getElements();

		for (Element e : elements) {
			System.out.println(e.getText());
		}

	}

}
