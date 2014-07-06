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
		if(!"1".equals(actualResult))
		{
		    	testFail++;
			System.out.println("EXPECTED " + "1" + "  but  " + actualResult);
		}
		else
		{
			testSuccess++;
		}

		actualResult = fizzBuzz.say(2);
		if(!"2".equals(actualResult))
		{
		    	testFail++;
			System.out.println("EXPECTED " + "2" + "  but  " + actualResult);
		}
		else
		{
			testSuccess++;
		}

		actualResult = fizzBuzz.say(3);
		if(!"Fizz".equals(actualResult))
		{
		    	testFail++;
			System.out.println("EXPECTED " + "Fizz" + "  but  " + actualResult);
		}
		else
		{
			testSuccess++;
		}

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
