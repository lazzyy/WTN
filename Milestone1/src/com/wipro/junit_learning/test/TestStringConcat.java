package com.wipro.junit_learning.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.wipro.junit_learning.task.DailyTasks;
public class TestStringConcat 
{
	DailyTasks d=new DailyTasks();
	@Test
	public void test() 
	{
		System.out.println("During test");
		assertEquals("Ram Kumar",d.doStringConcat("Ram", "Kumar"));
		System.out.println("String concat passed");
	}
}