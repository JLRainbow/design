package ch08FactoryMethod.mytest;

public class Student implements LeiFeng {

	@Override
	public void sweep() {
		// TODO Auto-generated method stub
		System.out.println("大学生扫地");
	}

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		System.out.println("大学生洗衣服");
	}

	@Override
	public void buyRice() {
		// TODO Auto-generated method stub
		System.out.println("大学生买米");
	}

}
