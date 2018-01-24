package ch30appendixA;

public class Cat extends Animal{

	public Cat(String name) {
		this.name = name;
	}
	public Cat() {
	}
	 
	
	@Override
	protected String getShout() {
		return "ίχ";
	}
	

}
