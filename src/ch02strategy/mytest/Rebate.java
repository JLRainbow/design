package ch02strategy.mytest;

public class Rebate extends CashSuper {

	private double moneyRebate = 1d;
	
	public Rebate(String moneyRebate) {
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}

	@Override
	public double acceptCash(double money) {
		return money*moneyRebate;
	}

}
