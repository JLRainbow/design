package ch06decorator.mytest;

public abstract class Finery extends Person{

	private Person person;

	public void setDecorate(Person person) {
		this.person = person;
	}

	@Override
	public void Show() {
		if(person != null){
			person.Show();
		}
	}
	
}
