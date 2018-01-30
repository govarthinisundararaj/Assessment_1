package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import runner.Task1;
public class Testadd {

	@Test
	public void Adder_fun()
	{
		Task1 a=new Task1();
		Assert.assertEquals(11, a.Adder_fun(5,5,1));
		
		
	}

}
