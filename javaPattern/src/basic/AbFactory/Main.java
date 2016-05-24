package basic.AbFactory;

import basic.AbFactory.factory.Factory;
import basic.AbFactory.factory.Link;
import basic.AbFactory.factory.Page;
import basic.AbFactory.factory.Tray;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java Main class.name.of.ConcreteFactory");
			System.out.println("Example1: java Main listfactory.ListFactory");
			System.out.println("Example2: java Main tablefactory.TableFactory");
			System.exit(0);
		}
		Factory factory = Factory.getFactory(args[0]);
		
		Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
		Link chosun = factory.createLink("조선일보", "http://www.chosun.com");
		Link kr_yahoo = factory.createLink("Yahoo!Korea", "http://www.yahoo.co.kr");
		Link excite = factory.createLink("Excite", "http://www.excite.com");
		Link google = factory.createLink("Google", "http://www.google.co.kr");
		
		Tray traynews = factory.createTray("News!");
		traynews.add(joins);
		traynews.add(chosun);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(joins);
		trayyahoo.add(chosun);

		Tray traysearch = factory.createTray("Search engine!");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "REAL");
		page.add(traynews);
		page.add(traysearch);;
		page.output();
	}

}
