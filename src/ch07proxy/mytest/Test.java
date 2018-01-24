package ch07proxy.mytest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl girl = new Girl();
		girl.setName("xiaohong");
		Proxy proxy = new Proxy(girl);
		proxy.giveDolly();
		proxy.giveFlowers();
		proxy.giveChocolates();
	}

}
