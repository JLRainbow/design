package ch01simpleFactory.mytest;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try {
			Scanner sc =new Scanner(System.in);
			
			System.out.println("请输入第一个数字：");
			String numA = sc.nextLine();
			System.out.println("请输入计算符号：");
			String mark = sc.nextLine();
			System.out.println("请输入第二个数字：");
			String numB = sc.nextLine();

			Operation operation = OperFactory.createOperation(mark);
			operation.setNumA(numA);
			operation.setNumB(numB);
			
			System.out.println("计算结果："+operation.getResult());
			
			
		} catch (NumberFormatException e) {
			System.out.println("输入有误："+e.getMessage());

		}
		
	}
}


