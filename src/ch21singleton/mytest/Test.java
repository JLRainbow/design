package ch21singleton.mytest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton2 instance1 = Singleton2.getInstance();
		Singleton2 instance2 = Singleton2.getInstance();
		Test test1 = new Test();
		Test test2 = new Test();
		System.out.println(instance1==instance2);
		System.out.println(test1==test2);
	}

}
