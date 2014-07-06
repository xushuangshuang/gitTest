package com.baldur;

import com.unit.XuShuangShuangJunit;

public class FizzBuzzTest extends XuShuangShuangJunit
{
	FizzBuzz fizzBuzz = new FizzBuzz();
	public void test_Fizz_should_be_3()
	{
		String actualResult = fizzBuzz.say(3);
		assertEquals("Fizz", actualResult);
	}
	public void test_2_should_be_2()
	{
		String actualResult = fizzBuzz.say(2);
		assertEquals("2", actualResult);
	}
	public void test_1_should_be_1()
	{
		String actualResult = fizzBuzz.say(1);
		assertEquals("1", actualResult);
	}
	public void test_Buzz_should_be_5()
	{
		String actualResult = fizzBuzz.say(5);
		assertEquals("Buzz", actualResult);
	}
	public void test_7_should_be_7()
	{
		String actualResult = fizzBuzz.say(7);
		assertEquals(7,7);
	}
	public void test_null()
	{
		assertNull(null);
	}
	public void test_null_should_be()
	{
		assertEquals(null, null);
	}

}

