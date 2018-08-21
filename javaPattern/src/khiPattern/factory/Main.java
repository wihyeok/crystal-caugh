package khiPattern.factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factory factory = new BBCreamfactory();
		Cosmetic hanskin1	= factory.createCosmetic("한스킨", 1);
		Cosmetic hanskin2	= factory.createCosmetic("한스킨", 2);
		Cosmetic sk2_1	= factory.createCosmetic("sk2", 1);
		Cosmetic sk2_2	= factory.createCosmetic("sk2", 2);
		
		hanskin1.info();
		hanskin2.info();
		sk2_1.info();
		sk2_2.info();
		
	}

}
