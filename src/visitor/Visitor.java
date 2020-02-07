package visitor;

import composite.CompositeElement;
import composite.Header;
import composite.Paragraph;

public interface Visitor {

	public void visitParagraph(Paragraph p);

	public void visitHeader(Header h);

	public void visitUnorderedList(CompositeElement ce);

	public void visitOrderedList(CompositeElement ce);

}
