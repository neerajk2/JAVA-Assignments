package neeraj.assignment.data;

public class Variable {
	public int integer;
	public char character;
	
	public void printVariables() {
		System.out.println("Integer: "+integer);
		System.out.println("Character: "+character);
	}
	
	public void printLocalVar() {
		int localInt;
		char localChar;
		/**
		 * System.out.println(localInt);
		 * System.out.println(localChar);
		 * 
		 * Can't print local variables without initialization!
		 */
		
	}
}
