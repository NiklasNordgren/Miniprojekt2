package composite.html;

import composite.Paragraph;

public class HTMLParagraph extends Paragraph {

	public HTMLParagraph() {
		this.setStartTag("<p>");
		this.setEndTag("</p>");
	}

}
