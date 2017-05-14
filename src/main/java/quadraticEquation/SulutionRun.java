package quadraticEquation;

import java.util.ArrayList;

public class SulutionRun {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		
		ArrayList <Double> results = EquationSolutionFinder.findSolutions(a,b,c);
		EquationSolutionFinder.printSolutions(results);
		
		}
	}

