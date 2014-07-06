package com.baldur;

public class FizzBuzzTest extends XuShuangShuangJunit
{
	FizzBuzz fizzBuzz = new FizzBuzz();
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
	public void test_Buzz_should_be_5()
	{
		String actualResult = fizzBuzz.say(5);
		assertEquals("Buzz", !"Buzz".equals(actualResult));
	}
}

