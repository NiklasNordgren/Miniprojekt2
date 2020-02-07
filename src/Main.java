import command.AddHeaderCommand;
import command.AddParagraphCommand;
import command.Command;
import command.MacroCommand;
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

		Document document1 = new Document(htmlElementFactory);

		Command c1 = new AddHeaderCommand(document1, "This is a html header.");
		Command c2 = new AddParagraphCommand(document1, "This is a html paragraph.");

		MacroCommand macroCommand = new MacroCommand();
		macroCommand.add(c1);
		macroCommand.add(c2);

		document1.redo(macroCommand);
		document1.undo(macroCommand);
		document1.redo();

		document1.printAll();

		Document document2 = new Document(latexElementFactory);

		Command c3 = new AddHeaderCommand(document2, "This is a LATEX header.");
		Command c4 = new AddParagraphCommand(document2, "This is a LATEX paragraph.");

		document2.redo(c3);
		document2.redo(c4);

		document2.undo();

		document2.printAll();

	}

}
