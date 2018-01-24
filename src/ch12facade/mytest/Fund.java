package ch12facade.mytest;

public class Fund {
	private Stock1 s1;
	private Stock2 s2;
	private Stock3 s3;
	private RealEstate re;
	private NationalDebt nd;
	
	
	
	public Fund() {
		this.s1 = new Stock1();
		this.s2 = new Stock2();
		this.s3 = new Stock3();
		this.re = new RealEstate();
		this.nd = new NationalDebt();
	}

	public void buyFund(){
		s1.Buy();
		s2.Buy();
		s3.Buy();
		re.Buy();
		nd.Buy();
	}
	
	public void sellFund(){
		s1.Sell();
		s2.Sell();
		s3.Sell();
		re.Sell();
		nd.Sell();
	}
}
