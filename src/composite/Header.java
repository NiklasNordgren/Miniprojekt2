package composite;

import java.util.ArrayList;

public class Header extends Element {

	private String text;

	public Header() {
		this.elements = new ArrayList<Element>();
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String getText() {
		return text;
	}
}
