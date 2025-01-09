package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_Triangle {
	Triangle_classifacation tester=new Triangle_classifacation();
	
	
	@Test
	public void Path1() {
		String result = tester.classifyTriangle(10,3,20);
		String expected ="nottriangle";
		assertEquals(expected, result);
	}
	
	@Test
	public void Path2() {
		String result = tester.classifyTriangle(16,30,5);
		String expected ="nottriangle";
		assertEquals(expected, result);
	}
	@Test
	public void Path3() {
		String result = tester.classifyTriangle(20,10,4);
		String expected ="nottriangle";
		assertEquals(expected, result);
	}
	@Test
	public void Path4() {
		String result = tester.classifyTriangle(6,6,6);
		String expected ="equilateral";
		assertEquals(expected, result);
	}
	
	@Test
	public void Path5() {
		String result = tester.classifyTriangle(10,12,12);
		String expected ="isosceles";
		assertEquals(expected, result);
	}
	@Test
	public void Path6() {
		String result = tester.classifyTriangle(10,10,8);
		String expected ="isosceles";
		assertEquals(expected, result);
	}
	
	@Test
	public void Path7() {
		String result = tester.classifyTriangle(10,7,10);
		String expected ="isosceles";
		assertEquals(expected, result);
	}
	@Test
	public void Path8() {
		String result = tester.classifyTriangle(14,12,10);
		String expected ="scalene";
		assertEquals(expected, result);
	}
	//@Test
	// public void Path9() {
	//	String result = tester.classifyTriangle(3,3,5);
	//	String expected ="error";
	//	assertEquals(expected, result);
	//}


}
