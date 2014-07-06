package com.unit;

import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import org.reflections.Reflections;
import java.util.Set;

public class XuShuangShuangJunit
{
	static boolean testResult = true;
	static int testSuccess = 0;
	static int testFail = 0;
	static int testNum = 0;

	public static void main(String[] args) throws Exception
	{
		String testCase = "com.unit";
		Reflections reflections = new Reflections(testCase);
		Set<Class<? extends XuShuangShuangJunit>> subType = reflections.getSubTypesOf(XuShuangShuangJunit.class);
		Iterator<Class<? extends XuShuangShuangJunit>> classIterator = subType.iterator();
		while(classIterator.hasNext())
		{
			Class clazz = classIterator.next();
			runAllTest(clazz);
		}
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
	public static void assertEquals(String exception, String actualResult)
	{
		assertEquals(exception, actualResult, exception.equals(actualResult));
	}
	public static void assertEquals(String exception, String actualResult, boolean testEquals)
	{
		if(!testEquals)
		{
			testFail++;
			testResult = false;
			testNum++;
			System.out.println("EXPECTED " + exception + "  but  " + actualResult);	
		}
		else
		{
			testNum++;
			testSuccess++;
		}
	}
	public static void outputTestResport(boolean testResult)
	{
		System.out.print("TEST NUM :" + testNum + "  ");
		if(testResult)
		{
			System.out.println("TEST SUCCESS :" + testSuccess );
		}
		else
		{
			System.out.println("TEST FALI :" + testFail );
		}
	}
}
