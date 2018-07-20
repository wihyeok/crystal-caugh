package basic.facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
	private Writer writer;

	public HtmlWriter(Writer writer) {
		this.writer = writer;
	}

	public void title(String title) throws IOException {
		this.writer.write("<html>");
		this.writer.write("<head>");
		this.writer.write("<title>");
		this.writer.write(title);
		this.writer.write("</title>");
		this.writer.write("</head>");
		this.writer.write("<body>\n");
		this.writer.write("<h1>");
		this.writer.write(title);
		this.writer.write("</h1>\n");
	}

	public void paragraph(String msg) throws IOException {
		this.writer.write("<p>");
		this.writer.write(msg);
		this.writer.write("</p>");
	}

	public void link(String href, String caption) throws IOException {
		this.paragraph("<a href=\"" + href + "\">" + caption + "</a>");
	}

	public void mailto(String mailaddr, String username) throws IOException {
		this.link("mailto: " + mailaddr, username);
	}

	public void close() throws IOException {
		this.writer.write("</body>");
		this.writer.write("</html>\n");
		this.writer.close();
	}
}
