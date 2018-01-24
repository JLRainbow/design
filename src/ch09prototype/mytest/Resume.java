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
	 * 深克隆
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
	 * 浅克隆
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
		System.out.println("工作时间:"+this.we.getDate());
		System.out.println("所在公司:"+this.we.getCompany());
	}
}
