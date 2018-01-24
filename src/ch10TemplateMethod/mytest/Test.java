package ch10TemplateMethod.mytest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPaper testPaperA = new TestPaperA();
		testPaperA.question1();
		testPaperA.question2();
		testPaperA.question3();
		
		TestPaper testPaperB = new TestPaperB();
		testPaperB.question1();
		testPaperB.question2();
		testPaperB.question3();
		
	}

}
