package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import runner.Task1;

public class Testmul {

	@Test
	public void mul_fun()
	{
		Task1 a=new Task1();
		Assert.assertEquals(25, a.Mul_fun(5,5,1));
		
		
	}

}
