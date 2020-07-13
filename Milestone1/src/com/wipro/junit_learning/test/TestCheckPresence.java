package com.wipro.junit_learning.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.wipro.junit_learning.task.DailyTasks;
public class TestCheckPresence 
{
	DailyTasks d=new DailyTasks();
	@Test
	public void test() 
	{
		assertEquals(true,d.checkPresence("Ram Kumar", "Ku"));
	}

}
