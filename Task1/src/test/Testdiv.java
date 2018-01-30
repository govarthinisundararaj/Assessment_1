package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import runner.Task1;

public class Testdiv {

	@Test
	public void div_fun()
	{
		Task1 a=new Task1();
		Assert.assertEquals(1, a.div_10(5,4,2));
		
		
	}
}
