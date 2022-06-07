package com;
class bank
{
	float getRateOfIntrest ()
	{
		return 6.7f;
	}
}
	class SBI extends bank
	{
		float getrateofintrest ()
		{
	
			return 6.7f;
		}
	}
	class HDFC extends bank
	{
		float getrateofintrest ()
		{
			return 6.5f;
			
		}
	}
	class ICICI extends bank
	{
		float getrateofintrest ()
		{
			return 6.3f;
		}
	}	
public class MethodOverridingDemo {

	public static void main(String[] args) {
	SBI obj = new SBI();
	System.out.println("The rate of intrest of SBI = ");
	System.out.println(obj.getrateofintrest());
	

	}

}
