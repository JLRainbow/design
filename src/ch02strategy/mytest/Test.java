package ch02strategy.mytest;

public class Test {
	private static double total = 0.0d;
	public static void main(String[] args) {
		int num =2 ;
		String onePrice = "300";
//		CashSuper cashAccept = CashActivityFactory.createCashAccept("Âú300¼õ50");
		CashContext CashContext =new CashContext("Âú300¼õ50");
//		total = total+cashAccept.acceptCash(num * Double.parseDouble(onePrice));
		System.out.println("×Ü¼Æ£º"+CashContext.getResult(num * Double.parseDouble(onePrice)));
	}
	
}
