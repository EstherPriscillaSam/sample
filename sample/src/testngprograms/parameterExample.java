package testngprograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

public class parameterExample {

	@Test
	@Parameters("names")
	void display(String value)
	{double radius=Double.parseDouble(value);
		double area=(3.14*radius);
		System.out.println(area);
	}
}
