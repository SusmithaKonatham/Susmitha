package org.com.exercise;

public class Factorial {

	public static void main(String[] args) 
	{
		long i,factorial=1;
		int number=80;
		for(i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);

	}

}
