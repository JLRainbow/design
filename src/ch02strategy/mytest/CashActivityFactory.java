package ch02strategy.mytest;


public class CashActivityFactory {

	public static CashSuper createCashAccept(String activityType){
		CashSuper cs = null;
		switch (activityType) {
			case "正常收费":
				cs = new Normal();
				break;
			case "八折":
				cs = new Rebate("0.8");
				break;
			case "满300减50":
				cs = new  Return("300","50");
				break;
			default:
				break;
			}
		return cs;
		
	}
}
