package ch01simpleFactory.mytest;

public class Sub extends Operation{

	@Override
	public String getResult() {
		result = String.valueOf(Double.parseDouble(numA) - Double.parseDouble(numB));
		return result;
	}
}
