package com.baldur;

public class FizzBuzzTest
{
  	static boolean testResult = true;
	static int testSuccess = 0;
	static int testFail = 0;
	public static void main(String[] args)
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.say(1);
		assertEquals("1", !"1".equals(actualResult));

		actualResult = fizzBuzz.say(2);
		assertEquals("2", !"2".equals(actualResult));	

		actualResult = fizzBuzz.say(3);
		assertEquals("3", !"Fizz".equals(actualResult));
		outputTestResport(testResult);	
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
