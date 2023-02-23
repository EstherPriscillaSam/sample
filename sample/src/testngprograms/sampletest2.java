package testngprograms;

import org.testng.annotations.Test;

public class sampletest2 {
@Test(priority = 0)
void  car()
{
	System.out.println("i am car");
}
@Test(priority = 1)
void  auto()
{
	System.out.println("i am auto");
}
}
