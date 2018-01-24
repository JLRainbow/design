package ch09prototype.mytest;


public class Resume implements Cloneable{
	
	private String name;
	private String sex;
	private int age;
	private WorkExperience we;
	


	public void setPersonInfo(String sex,int age){
		this.sex = sex;
		this.age = age;
	}
	
	

	public Resume(String name) {
		this.name = name;
		we = new WorkExperience();
	}

	public void setWorkExperience(String date,String company){
		we.setDate(date);
		we.setCompany(company);
	}
	/**
	 * ���¡
	 */
//	@Override
//	protected Resume clone() throws CloneNotSupportedException {
//	    String name = this.name;
//		String sex = this.sex;
//		int age = this.age;
//		Resume resume = new Resume();
//		resume.setPersonInfo(sex, age);
//		resume.setWorkExperience(this.we.getDate(), this.we.getCompany());
//		return resume;
//	}
	/**
	 * ǳ��¡
	 */
//	@Override
//	protected Resume clone() throws CloneNotSupportedException {
//		return (Resume) super.clone();
//	}
	public Resume clone() throws CloneNotSupportedException {
		return (Resume) super.clone();
	}
	
	public void show(){
		System.out.println("name:"+this.name+" sex:"+this.sex+" age:"+this.age);
		System.out.println("����ʱ��:"+this.we.getDate());
		System.out.println("���ڹ�˾:"+this.we.getCompany());
	}
}
