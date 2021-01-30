package org.com.exercise;

public class SharedDigit {

	public static void main(String[] args)
	{
			hasSharedDigit(59,64);

			}
			public static boolean hasSharedDigit(int num1,int num2)
			{
				int leftnum1,rightnum1,leftnum2,rightnum2;
				if(num1>10 && num1<99 && num2>10 && num2<99)
				{
					leftnum1=num1/10;
				    rightnum1=num1%10;
					leftnum2=num2/10;
				    rightnum2=num2%10;
				    if(leftnum1==leftnum2)
				    {
				    
				    	return true;
				    }
				    if(leftnum1==rightnum2)
				    {
				    	return true;
				    }
				    if(rightnum1==leftnum2)
				    {
				    	return true;
				    }
				    if(rightnum1==rightnum2)
				    {
				    	return true;
				    }
				    else
				    {
				    	System.out.println("num1 is has no SharedDigit with num2");
				    	return false;
				    }
			
				}
				return false;
			}

	}


