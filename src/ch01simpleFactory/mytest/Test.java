package ch01simpleFactory.mytest;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try {
			Scanner sc =new Scanner(System.in);
			
			System.out.println("�������һ�����֣�");
			String numA = sc.nextLine();
			System.out.println("�����������ţ�");
			String mark = sc.nextLine();
			System.out.println("������ڶ������֣�");
			String numB = sc.nextLine();

			Operation operation = OperFactory.createOperation(mark);
			operation.setNumA(numA);
			operation.setNumB(numB);
			
			System.out.println("��������"+operation.getResult());
			
			
		} catch (NumberFormatException e) {
			System.out.println("��������"+e.getMessage());

		}
		
	}
}


