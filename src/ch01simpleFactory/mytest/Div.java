package ch01simpleFactory.mytest;

public class Div extends Operation{

	@Override
	public String getResult() {
		if(!"0".equals(numB)){
			result = String.valueOf(Double.parseDouble(numA) / Double.parseDouble(numB));
		}else{
			result = "��������Ϊ0����";
		}
		return result;
	}
}
