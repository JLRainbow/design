package ch09prototype.mytest;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume = new Resume("xiaoming");
//		resume.setName("xiaoming");
		resume.setPersonInfo("ÄÐ", 22);
		resume.setWorkExperience("2011", "baidu");
		resume.show();
		Resume resume2 = resume.clone();
//		resume2.setName("xiaohong");
		resume2.setPersonInfo("ÄÐ", 22);
		resume2.setWorkExperience("2014", "google");
		resume2.show();
	}
}
