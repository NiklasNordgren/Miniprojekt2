package composite;

import visitor.Visitor;

public abstract class Paragraph extends Element {

	public Paragraph() {

	}

	@Override
	public void accept(Visitor v) {
		v.visitParagraph(this);
	}

}
