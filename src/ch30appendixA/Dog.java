package ch30appendixA;

public class Dog  extends Animal{

	public Dog(String name) {
		this.name = name;
	}
	public Dog() {
	}
	 
	@Override
	protected String getShout() {
		return "Íô";
	}
	
	
}
