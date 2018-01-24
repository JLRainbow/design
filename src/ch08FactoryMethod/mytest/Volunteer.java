package ch08FactoryMethod.mytest;

public class Volunteer implements LeiFeng {

	@Override
	public void sweep() {
		// TODO Auto-generated method stub
		System.out.println("志愿者扫地");
	}

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		System.out.println("志愿者洗衣服");
	}

	@Override
	public void buyRice() {
		// TODO Auto-generated method stub
		System.out.println("志愿者买米");
	}

}
