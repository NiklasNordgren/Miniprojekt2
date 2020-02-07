import composite.Element;
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

		document.addParagraph("test");
		document.addParagraph("test2");

		document.undoParagraph();
		document.undoParagraph();

		document.redoParagraph();
		document.redoParagraph();

		for (Element e : document.getElements())
			e.accept(visitor2);

		for (Element e : document.getElements())
			e.accept(visitor1);

		document.printAll();

	}

}
