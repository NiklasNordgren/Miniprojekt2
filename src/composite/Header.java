package composite;

public class Header extends Element {

	String text;

	public Header() {

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
