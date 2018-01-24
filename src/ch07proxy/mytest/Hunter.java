package ch07proxy.mytest;

public class Hunter implements GiveGift {

	Girl girl;
	
	public Hunter(Girl girl) {
		// TODO Auto-generated constructor stub
		this.girl = girl;
	}

	@Override
	public void giveDolly() {
		// TODO Auto-generated method stub
		System.out.println(girl.getName()+",这是给你的洋娃娃");
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(girl.getName()+",这是给你的鲜花");
	}

	@Override
	public void giveChocolates() {
		// TODO Auto-generated method stub
		System.out.println(girl.getName()+",这是给你的巧克力");
	}

}
