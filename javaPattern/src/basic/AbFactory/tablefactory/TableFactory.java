package basic.AbFactory.tablefactory;

import basic.AbFactory.factory.Factory;
import basic.AbFactory.factory.Link;
import basic.AbFactory.factory.Page;
import basic.AbFactory.factory.Tray;

public class TableFactory extends Factory {
	public Link createLink(String caption, String url) {
		return new TableLink(caption, url);
	}
	
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}
	
	public Page createPage(String title, String author) {
		return new TablePage(title, author);
	}

}
