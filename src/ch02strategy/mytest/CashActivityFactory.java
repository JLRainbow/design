package ch02strategy.mytest;


public class CashActivityFactory {

	public static CashSuper createCashAccept(String activityType){
		CashSuper cs = null;
		switch (activityType) {
			case "�����շ�":
				cs = new Normal();
				break;
			case "����":
				cs = new Rebate("0.8");
				break;
			case "��300��50":
				cs = new  Return("300","50");
				break;
			default:
				break;
			}
		return cs;
		
	}
}
