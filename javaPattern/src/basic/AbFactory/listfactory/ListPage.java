package basic.AbFactory.listfactory;

import java.util.Iterator;

import basic.AbFactory.factory.Item;
import basic.AbFactory.factory.Page;

public class ListPage extends Page{
	
	public ListPage(String title, String author) {
		super(title, author);
	}
	
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>" + title + "</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("<h1>" + title + "</h1>\n");
		buffer.append("<ul>\n");
		Iterator<Item> it = content.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("<hr><address>" + author + "</adress>");
		buffer.append("</bofy></html>\n");
		
		return buffer.toString();
	}

}
