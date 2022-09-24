using System;

public class Arrayss
{
	public Arrayss()
	{
		string[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		cars[0] = "Opel";
		Console.WriteLine(cars[0]);
		// Now outputs Opel instead of Volvo

		string[] cars2 = { "Volvo", "BMW", "Ford", "Mazda" };
		foreach (string i in cars2)
		{
			Console.WriteLine(i);
		}
	}
}
