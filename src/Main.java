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

		compositeElement.addElement(compositeElement.getElements().size(), paragraph);
		compositeElement.addElement(compositeElement.getElements().size(), header);

		document.printAll();

	}

}
