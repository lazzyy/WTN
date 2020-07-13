package com.wipro.junit_learning.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.wipro.junit_learning.task.DailyTasks;
public class TestSort 
{
	DailyTasks d=new DailyTasks();
	@Test
	public void test() 
	{
		int[] b= {1,2,3,5,6,4};
		int[] sorted_b= {1,2,3,4,5,6};
		assertArrayEquals(sorted_b,d.sortValues(b));
	}

}
