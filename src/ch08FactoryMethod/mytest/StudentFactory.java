package ch08FactoryMethod.mytest;

public class StudentFactory implements CreateLeiFengFactory {

	@Override
	public LeiFeng createLeiFeng() {
		// TODO Auto-generated method stub
		return new Student();
	}

}
