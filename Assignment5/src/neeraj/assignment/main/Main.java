package neeraj.assignment.main;

import neeraj.assignment.data.Variable;
import neeraj.assignment.singleton.Singleton;

public class Main {
	public static void main(String[] args) {
		Variable var = new Variable();
		var.printVariables();
		var.printLocalVar();
		
		Singleton sing = Singleton.initializeStr("sing"); //Static methods can be called directly through Class
		sing.printStr();
	}	
}
