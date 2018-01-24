package ch07proxy.mytest;

public class Proxy implements GiveGift {
	Hunter hunter;
	
	
	public Proxy(Girl girl) {
		hunter = new Hunter(girl);
	}

	@Override
	public void giveDolly() {
		hunter.giveDolly();
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		hunter.giveFlowers();
	}

	@Override
	public void giveChocolates() {
		// TODO Auto-generated method stub
		hunter.giveChocolates();
	}

}
