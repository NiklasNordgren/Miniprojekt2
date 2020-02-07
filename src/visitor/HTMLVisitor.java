package visitor;

import composite.CompositeElement;
import composite.Header;
import composite.Paragraph;

public class HTMLVisitor implements Visitor {

	public HTMLVisitor() {
	}

	@Override
	public void visitParagraph(Paragraph p) {
		p.setStartTag("<p>");
		p.setEndTag("</p>");
	}

	@Override
	public void visitHeader(Header h) {
		h.setStartTag("<h1>");
		h.setEndTag("</h1>");
	}

	@Override
	public void visitUnorderedList(CompositeElement ce) {
		// TODO :)
	}

	@Override
	public void visitOrderedList(CompositeElement ce) {
		// TODO :)
	}

}
