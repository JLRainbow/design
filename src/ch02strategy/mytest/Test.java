package ch02strategy.mytest;

public class Test {
	private static double total = 0.0d;
	public static void main(String[] args) {
		int num =2 ;
		String onePrice = "300";
//		CashSuper cashAccept = CashActivityFactory.createCashAccept("��300��50");
		CashContext CashContext =new CashContext("��300��50");
//		total = total+cashAccept.acceptCash(num * Double.parseDouble(onePrice));
		System.out.println("�ܼƣ�"+CashContext.getResult(num * Double.parseDouble(onePrice)));
	}
	
}
