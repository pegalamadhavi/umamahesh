package junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class test 
{
	sample obj;
	@BeforeAll
	public static void beforeclass()
	{
		System.out.println("before all test cases");
	}
	@AfterAll
	public static void afterclass()
	{
		System.out.println("after all test cases");
	}
	@BeforeEach
	public void setup() {
		System.out.println("before test method");
		obj=new sample();
	}
	@AfterEach
	public void setdown()
	{
		System.out.println("after test method");
	
	obj=null;
	}
@Test
	public void testadd()
	{
		System.out.println("test add method");
			assertEquals(50,obj.add(30,20 ));
	}
	@Test
	public void testsub()
	{
		System.out.println("test sub method");
		assertEquals(40,obj.sub(80,40));
	}
	@Test
	public void testmul()
	{
		System.out.println("test mul method");
		assertEquals(600,obj.mul(30,20));
	}
	@Test
	public void testgreet()
	{
		System.out.println("test Greet method");
		assertEquals("Hi",obj.greet("Hello"));
	}
}
	
