package ch09prototype;

public class Prototype {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Resume a = new Resume("wangyi");
		a.setPersonalInfo("male", "23");
		a.setWorkExperience("2009", "111");
		
		Resume b = a.clone();
		b.setWorkExperience("2009", "222");
		
		Resume c = a.clone();
		c.setWorkExperience("2009", "333");
		
		a.Display();
		b.Display();
		c.Display();
	}

}
