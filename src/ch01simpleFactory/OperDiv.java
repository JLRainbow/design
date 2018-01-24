package ch01simpleFactory;

public class OperDiv extends Operation{
	
	public int GetResult()
	{
		int result = 0;
		if(numB == 0)
			try {
				throw new Exception("0!!!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		result = numA / numB;
		return result;
	}
}
