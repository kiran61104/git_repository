
public class Test {

	/**
	 * Sample Main Method
	 * */
	public static void main(String[] args) {
		
		System.out.println("Hi Start Coding");
		Test test = new Test();
		test.initGit();
		test.pushToGit();
		
		
	}
	
	public void initGit(){
		System.out.println("Started using Git ");
	}
	
	public void pushToGit(){
		System.out.println("Push to Git ");
		System.out.println("After Push");
		System.out.println("Before fetching the previous pull ");
	}

}
