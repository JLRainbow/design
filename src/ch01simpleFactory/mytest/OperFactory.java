package ch01simpleFactory.mytest;

public class OperFactory {

	public static Operation createOperation(String mark){
		Operation op = null;
		switch (mark) {
		case "+":
			op =new Add();
			break;
		case "-":
			op =new Sub();	
			break;
		case "*":
			op =new Mul();
			break;
		case "/":
			op =new Div();
			break;
		default :
			op =new OtherMark();
			break;
		}
		return op;
		
	}
}
