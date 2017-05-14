package quadraticEquation;

import java.util.ArrayList;

public class EquationSolutionFinder {
	
	public static ArrayList <Double> findSolutions (double a, double b, double c) {
		ArrayList <Double> result = new ArrayList<>();
		
		double d = b*b - 4*a*c;
		
		if (d>0) {
			
			double x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
			double x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
			result.add(x1);
			result.add(x2);
		}
		else if (d==0) {
			double x = -(b/2*a);
			result.add(x);	
		}
	
		return result;
	}
	public static void printSolutions (ArrayList <Double> solutions) {
		
		if (solutions.isEmpty()) {
			System.out.println("No results");
		}
		else if (solutions.size() == 1) {
			System.out.println("x = " + solutions.get(0));
		}
		else if (solutions.size() == 2) {
			System.out.println("x1 = " + solutions.get(0));
			System.out.println("x2 = " + solutions.get(1));
		}
		else {
			System.out.println("What a fuck");
		}
	}
}
