package de.testjenkins1.Testjenkins1;

import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest 
   {
	App adder = new App();
	Minus minus =new Minus();

	@Test
	public void test() {
		 
		assertEquals( 5, adder.add(2,3));
	}
	@Test
	public void testok()
	{
		assertEquals(6, adder.add(3, 3));
	}
	@Test
	public void testFailed()
	{
		assertNotEquals(6, adder.add(5, 5));
	}
	@Test
	public void testminus() {
		 
		assertEquals( 1, minus.remove(4,3));
	}
	@Test
	public void testFailed1() {
		 
		assertEquals( 2, minus.remove(4,3));
	}
	@Test
	public void testOK()
	{
		assertNotEquals(25, adder.multi(5, 5));
	}
	@Test
	public void testNOK()
	{
		assertNotEquals(26, adder.multi(5, 5));
	}
	

}
