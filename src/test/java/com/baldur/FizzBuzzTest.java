package com.baldur;

import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class FizzBuzzTest
{
  	static boolean testResult = true;
	static int testSuccess = 0;
	static int testFail = 0;
	FizzBuzz fizzBuzz = new FizzBuzz();
	public static void main(String[] args) throws Exception
	{
		Class clazz = FizzBuzzTest.class;
		runAllTest(clazz);
		outputTestResport(testResult);	
	}
	public static void runAllTest(Class clazz)
	{
		Iterator<Method> methodIterator = getAllTestMethod(clazz).iterator();
		while(methodIterator.hasNext())
		{
			Method method = methodIterator.next();
			try
			{
				Object obj = clazz.newInstance();
				method.invoke(obj, new Object[]{});
			}
			catch(Exception e)
			{
				testResult = false;
				System.out.println("UNEXCEPTION exception");
				e.printStackTrace();
			}
		}	
	}
	public static List<Method> getAllTestMethod(Class clazz)
	{
		List<Method> testMethod = new ArrayList<Method>();
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods )
		{
			if(method.getName().startsWith("test"))
			{
				testMethod.add(method);
			}
		}
		return testMethod;
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
