package com.baldur;

public class FizzBuzzTest
{
	public static void main(String[] args)
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.say(1);
		if("1".equals(actualResult))
		{
			System.out.println("EXPECTED " + "1" + "  but  " + actualResult);
		}

		actualResult = fizzBuzz.say(2);
		if("2".equals(actualResult))
		{
			System.out.println("EXPECTED " + "2" + "  but  " + actualResult);
		}

		actualResult = fizzBuzz.say(3);
		if("Fizz".equals(actualResult))
		{
			System.out.println("EXPECTED " + "Fizz" + "  but  " + actualResult);
		}

	}
}
