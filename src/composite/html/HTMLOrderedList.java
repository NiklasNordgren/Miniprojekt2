package composite.html;

import composite.CompositeElement;
import visitor.Visitor;

public class HTMLOrderedList extends CompositeElement {

	@Override
	public void accept(Visitor v) {
		v.visitOrderedList(this);
	}

}
