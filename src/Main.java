import facade.Document;
import factory.ElementFactory;
import factory.HTMLElementFactory;
import factory.LATEXElementFactory;
import visitor.HTMLVisitor;
import visitor.LATEXVistor;
import visitor.Visitor;

public class Main {

	public static void main(String[] args) {

		ElementFactory htmlElementFactory = HTMLElementFactory.getInstance();
		ElementFactory latexElementFactory = LATEXElementFactory.getInstance();

		Visitor visitor1 = new HTMLVisitor();
		Visitor visitor2 = new LATEXVistor();

		Document document = new Document(htmlElementFactory);

		document.createElement("paragraph").setText("paragraph1");
		document.createElement("paragraph").setText("paragraph2");
		document.createElement("paragraph").setText("paragraph3");

		document.createElement("header").setText("header1");
		document.createElement("header").setText("header1");

		// for (Element e : document.getElements())
		// e.accept(visitor2);

		document.printAll();

	}

}
