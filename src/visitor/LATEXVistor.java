package visitor;

import composite.CompositeElement;
import composite.Header;
import composite.Paragraph;

public class LATEXVistor implements Visitor {

	public LATEXVistor() {
	}

	@Override
	public void visitParagraph(Paragraph p) {
		p.setStartTag("<LATEXparagraph>");
		p.setEndTag("</LATEXparagraph>");
	}

	@Override
	public void visitHeader(Header h) {
		h.setStartTag("<LATEXheader>");
		h.setEndTag("</LATEXheader>");
	}

	@Override
	public void visitUnorderedList(CompositeElement ce) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitOrderedList(CompositeElement ce) {
		// TODO Auto-generated method stub

	}

}
