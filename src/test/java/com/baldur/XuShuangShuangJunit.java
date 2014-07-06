package com.baldur;

import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class XuShuangShuangJunit
{
	static boolean testResult = true;
	static int testSuccess = 0;
	static int testFail = 0;

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
	public static void assertEquals(String exception, boolean actualResult)
	{
		if(actualResult)
		{
			testFail++;
			testResult = false;
			System.out.println("EXPECTED " + exception + "  but  " + actualResult);	
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
