package basic;

public class FieldAndMethod {
	/* 필드(field) */
	
	/**
	* -privateField
	* cannot access class out.
	* only can access in class
	*/
	private int privateField;
	
	/**
	* #protectedField
	* only can access that same class and
	* extended child class or same package class
	*/
	protected int protectedField;
	
	/**
	* +publicField
	* can access all.
	*/
	public int publicField;
	
	/**
	* only can access in same package
	*/
	int packageField;

	/* 메소드(method) 메소드 역시 동일함. */
}
