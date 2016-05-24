package basic.AbFactory.listfactory;

import java.util.Iterator;

import basic.AbFactory.factory.Item;
import basic.AbFactory.factory.Tray;

public class ListTray extends Tray {
	
	public ListTray(String caption) {
		super(caption);
	}
	
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>\n");
		buffer.append(caption + "\n");
		buffer.append("<ul>\n");
		Iterator<Item> it = tray.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("</li>\n");
		return buffer.toString();
	}

}
