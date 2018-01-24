package ch08FactoryMethod.mytest;

public class VolunteerFactory implements CreateLeiFengFactory {

	@Override
	public LeiFeng createLeiFeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}
