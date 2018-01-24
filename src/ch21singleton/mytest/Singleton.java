package ch21singleton.mytest;

/**
 * ����
 *
 */
public class Singleton {
	private static Singleton singleton;

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;

	}
	
	private Singleton() {
	}
}

/**
 * ˫����
 *
 */
class Singleton2 {
	private static Singleton2 singleton;

	public static Singleton2 getInstance(){
		if(singleton == null){
			synchronized (Singleton2.class) {
				
				if(singleton == null){
					singleton =new  Singleton2();
				}
			}
		}
		return singleton;
		
	}

	private Singleton2() {
	}
}

/**
 * ����
 *
 */
class Singleton1 {
	private static Singleton1 singleton = new Singleton1();

	public static Singleton1 getInstance() {

		return singleton;
	}

	private Singleton1() {
	}
}
