package ch06decorator.mytest;

public class Test {

	public static void main(String[] args) {
		System.out.println("��һ��װ�磺");
		Person person = new Person("xiaoming");
		
		Tshirts tshirts = new Tshirts();
		Suit suit = new Suit();
		
		tshirts.setDecorate(person);
		suit.setDecorate(tshirts);
		suit.Show();
		
	}
}
