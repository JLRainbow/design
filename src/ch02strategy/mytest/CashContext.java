package ch02strategy.mytest;

public class CashContext {

	private CashSuper cashSuper;

	public CashContext(String activityType) {
		switch (activityType) {
		case "�����շ�":
			cashSuper = new Normal();
			break;
		case "����":
			cashSuper = new Rebate("0.8");
			break;
		case "��300��50":
			cashSuper = new  Return("300","50");
			break;
		default:
			break;
		}
	}
	
	public double getResult(double money){
		return cashSuper.acceptCash(money);
		
	}
}
