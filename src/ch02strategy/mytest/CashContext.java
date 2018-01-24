package ch02strategy.mytest;

public class CashContext {

	private CashSuper cashSuper;

	public CashContext(String activityType) {
		switch (activityType) {
		case "正常收费":
			cashSuper = new Normal();
			break;
		case "八折":
			cashSuper = new Rebate("0.8");
			break;
		case "满300减50":
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
