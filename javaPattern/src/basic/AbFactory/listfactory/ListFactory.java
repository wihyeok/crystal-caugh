package basic.AbFactory.listfactory;

import basic.AbFactory.factory.Factory;
import basic.AbFactory.factory.Link;
import basic.AbFactory.factory.Page;
import basic.AbFactory.factory.Tray;

/**
 * @author hyeok
 *
 */
public class ListFactory extends Factory {
	
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}
	
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}
	
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}

}
