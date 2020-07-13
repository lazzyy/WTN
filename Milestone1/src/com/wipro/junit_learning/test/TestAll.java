package com.wipro.junit_learning.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.wipro.junit_learning.task.DailyTasks;
public class TestAll 
{

	@Test
	public void test() 
	{
		DailyTasks d=new DailyTasks();
		System.out.println("During test");
		assertEquals("Ram Kumar",d.doStringConcat("Ram", "Kumar"));
		System.out.println("String concat passed");
		int[] a= {1,2,3,4,5,6,7};
		int[] b= {1,2,3,5,7,6,4};
		assertArrayEquals(a,d.sortValues(b));
		System.out.println("Arrays sort passed");
		assertEquals(true,d.checkPresence("Ram Kumar", "u"));
		System.out.println("Check presence passed");
	}

}
