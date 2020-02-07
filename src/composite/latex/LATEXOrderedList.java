package composite.latex;

import composite.CompositeElement;
import visitor.Visitor;

public class LATEXOrderedList extends CompositeElement {

	@Override
	public void accept(Visitor v) {
		v.visitOrderedList(this);
	}

}
