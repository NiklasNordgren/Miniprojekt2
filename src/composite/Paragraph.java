package composite;

public class Paragraph extends Element {

	private String text;

	public Paragraph() {
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void print() {
		System.out.println(this.text);
	}

}
