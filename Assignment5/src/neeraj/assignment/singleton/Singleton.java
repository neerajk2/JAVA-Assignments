package neeraj.assignment.singleton;

public class Singleton {
	public String strVar;
	
	public static Singleton initializeStr (String s) {
		Singleton single = new Singleton();
//		strVar = s; //Can't access a non-static field through a static reference
		
		single.strVar = s;
		return single;
	}
	
	public void printStr() {
		System.out.println(strVar);
	}
}
