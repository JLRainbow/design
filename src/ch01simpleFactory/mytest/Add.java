package ch01simpleFactory.mytest;

public class Add extends Operation{

	@Override
	public String getResult() {
		result = String.valueOf(Double.parseDouble(numA) + Double.parseDouble(numB));
		return result;
	}
}
