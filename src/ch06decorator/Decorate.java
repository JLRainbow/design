package ch06decorator;

public class Decorate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person xc = new Person("wangyi");
		
		System.out.println("\n the first decorate:\n");
		
		TShirts dtx = new TShirts();
		BigTrouser kk = new BigTrouser();
		Sneakers pqx = new Sneakers();
		
		dtx.Decorate(xc);
		kk.Decorate(dtx);
		pqx.Decorate(kk);
		pqx.Show();
		
		System.out.println("\n the second decorate:\n");
		
		Suit xz = new Suit();
		Tie ld = new Tie();
		LeatherShoes px = new LeatherShoes();
		
		xz.Decorate(xc);
		ld.Decorate(xz);
		px.Decorate(ld);
		px.Show();

	}

}
