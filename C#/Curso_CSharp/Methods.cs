using System;

public class Method
{
	static void Method_()
	{
		{
			Console.WriteLine("I just got executed!");
		}

		static void Main(string[] args)
		{
			Method_();
			Method_();
			Method_();
		}
	}
}
