package com.baldur;

import java.lang.reflect.Method;

public class FizzBuzzTest
{
  	static boolean testResult = true;
	static int testSuccess = 0;
	static int testFail = 0;
	FizzBuzz fizzBuzz = new FizzBuzz();
	public static void main(String[] args) throws Exception
	{
		Method[] methods = FizzBuzzTest.class.getDeclaredMethods();
		for(Method method : methods )
		{
			if(method.getName().startsWith("test"))
			{
				Object obj = FizzBuzzTest.class.newInstance();
				method.invoke(obj, new Object[]{});
			}
		}
		outputTestResport(testResult);	
	}
	public void test_Fizz_should_be_3()
	{
		String actualResult = fizzBuzz.say(3);
		assertEquals("3", !"Fizz".equals(actualResult));
	}
	public void test_2_should_be_2()
	{
		String actualResult = fizzBuzz.say(2);
		assertEquals("2", !"2".equals(actualResult));
	}
	public void test_1_should_be_1()
	{
		String actualResult = fizzBuzz.say(1);
		assertEquals("1", !"1".equals(actualResult));
	}
	public static void assertEquals(String exception, boolean actualResult)
	{
		if(actualResult)
		{
			testFail++;
			System.out.println("EXPECTED " + "Fizz" + "  but  " + actualResult);	
		}
		else
		{
			testSuccess++;
		}
	}
	public static void outputTestResport(boolean testResult)
	{
		if(testResult)
		{
			System.out.println("TESTSUCCESS :" + testSuccess + "  TESTFAIL :" + "0");
		}
		else
		{
			System.out.println("TESTFALI :" + testFail );
		}
	}
}
