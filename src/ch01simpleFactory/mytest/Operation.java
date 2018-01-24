package ch01simpleFactory.mytest;

public class Operation {
	protected String numA;
	protected String numB;
	protected String result;
	
	public String getNumA() {
		return numA;
	}
	public void setNumA(String numA) {
		this.numA = numA;
	}
	public String getNumB() {
		return numB;
	}
	public void setNumB(String numB) {
		this.numB = numB;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	public String getResult(){
		return result;
		
	}
}
