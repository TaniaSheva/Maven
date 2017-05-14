package quadraticEquation;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class QuadraticEquationTest {
	

	@Test
	public void testDIsLessThanZero() {
		ArrayList <Double> result = EquationSolutionFinder.findSolutions(2,2,1);
		assertTrue(result.isEmpty());

	}
	@Test
	public void testDEqualsZero() {
		ArrayList <Double> result = EquationSolutionFinder.findSolutions(1,2,1);
		assertEquals(result.size(), 1);
		assertEquals(result.get(0), -1.0, 0.001);
	}
	
	@Test
	public void testDMoreThanZero() {
		ArrayList <Double> result = EquationSolutionFinder.findSolutions(1,3,-4);
		assertEquals(result.size(), 2);
		assertEquals(result.get(0), 1.0, 0.001);
		assertEquals(result.get(1), -4.0, 0.001);
	}
	
	@Test
	public void testParametersAreZero() {
		ArrayList <Double> result = EquationSolutionFinder.findSolutions(0,0,0);
		assertEquals(result.size(), 1);
		assertEquals(result.get(0), 0.0, 0.001);
	}
}
