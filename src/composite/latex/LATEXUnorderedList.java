package composite.latex;

import composite.CompositeElement;
import visitor.Visitor;

public class LATEXUnorderedList extends CompositeElement {

	@Override
	public void accept(Visitor v) {
		v.visitUnorderedList(this);
	}

}
