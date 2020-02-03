package composite.html;

import composite.CompositeElement;
import visitor.Visitor;

public class HTMLUnorderedList extends CompositeElement {

	@Override
	public void accept(Visitor v) {
		v.visitUnorderedList(this);
	}

}
