import java.util.List;

import composite.Element;

public class Main {

	public static void main(String[] args) {

		Document document = new Document();

		Element paragraph = document.createElement("paragraph");
		paragraph.setText("Test paragraph");
		
		Element header = document.createElement("header");
		header.setText("Test header");
		
		Element compositeElement = document.createElement("compositeelement");
		compositeElement.setText("Test");
		
		compositeElement.addElement(paragraph);
		compositeElement.addElement(header);
		
		document.printAll();

	}

}
