package autogenerate;

public class Test {

	static{
		System.out.println("static");
	}
	static void call(){
		System.out.println("call");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test;
		System.out.println("something");
		Test.call();
		Test.call();
	}

}
