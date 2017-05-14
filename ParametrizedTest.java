package quadraticEquation;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class ParametrizedTest {
	
	private ArrayList <Double> expected;
	private ArrayList <Double> value;
	    
	@Parameters
	public static Collection data() {
		ArrayList<Double> expected1 = new ArrayList<Double>();
		ArrayList<Double> value1 = new ArrayList<Double>();
		value1.add(2.0);
		value1.add(2.0);
		value1.add(1.0);

		ArrayList<Double> expected2 = new ArrayList<Double>();
		expected2.add(-1.0);
		ArrayList<Double> value2 = new ArrayList<Double>();
		value2.add(1.0);
		value2.add(2.0);
		value2.add(1.0);
		
		ArrayList<Double> expected3 = new ArrayList<Double>();
		expected3.add(1.0);
		expected3.add(-4.0);
		ArrayList<Double> value3 = new ArrayList<Double>();
		value3.add(1.0);
		value3.add(3.0);
		value3.add(-4.0);
		
		ArrayList<Double> expected4 = new ArrayList<Double>();
		expected4.add(-0.0);
		ArrayList<Double> value4 = new ArrayList<Double>();
		value4.add(0.0);
		value4.add(0.0);
		value4.add(0.0);
		
		return Arrays.asList( new Object[ ][ ] { 
			{ expected1, value1 }, 
			{ expected2, value2 }, 
			{ expected3, value3 }, 
			{ expected4, value4 } });
	}

	 public ParametrizedTest(ArrayList <Double> expected, ArrayList <Double> value) { 
	        this.expected = expected;
	        this.value = value;    
	 } 
	 
	 @Test
	 public void test() {
		 assertEquals(expected, EquationSolutionFinder.findSolutions(value.get(0), value.get(1), value.get(2)));    
	 }

}
