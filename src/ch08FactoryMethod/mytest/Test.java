package ch08FactoryMethod.mytest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateLeiFengFactory clff = new VolunteerFactory();
		LeiFeng leiFeng = clff.createLeiFeng();
		leiFeng.buyRice();
		leiFeng.sweep();
		leiFeng.wash();
	}

}
