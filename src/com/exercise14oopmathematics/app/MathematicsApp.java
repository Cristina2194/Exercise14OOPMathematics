package com.exercise14oopmathematics.app;
import java.util.Scanner;
import com.exercise14oopmathematics.model.MathematicsOperations;


public class MathematicsApp {

	public static void main(String[] args) {
		// varibles declaration
		double base=0;
		double height=0;
		double radio=0;
		double side=0;
		double result=0;	
		
		//Object contruction
		Scanner input = new Scanner(System.in);
		
		//MathematicsOperations myOperations = new MathematicsOperations();
		
		System.out.println("Input base: ");
		base=input.nextDouble();
		
		System.out.println("Input height: ");
		height = input.nextDouble();
		result = MathematicsOperations.areaTriangle(base, height);
		System.out.println("Traingle area:" +result);
	
		//

	}

}
