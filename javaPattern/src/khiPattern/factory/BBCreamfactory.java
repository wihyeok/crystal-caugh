package khiPattern;

public class BBCreamfactory extends Factory{

 
	@Override
	BBcream createCosmetic(String name,int bright) {
		// TODO Auto-generated method stub
		return new BBcream(name,bright);
	}
	
}
