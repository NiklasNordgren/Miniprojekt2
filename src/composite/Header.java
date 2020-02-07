package composite;

import visitor.Visitor;

public abstract class Header extends Element {

	public Header() {

	}

	@Override
	public void accept(Visitor v) {
		v.visitHeader(this);
	}

}
