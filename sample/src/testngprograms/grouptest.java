package testngprograms;

import org.testng.annotations.Test;

public class grouptest {
@Test(groups = "software")
 void cse()
{
	System.out.println("i am cse");
	
}
@Test(groups = "software")
void IT()
{
	System.out.println("i am IT");

}
@Test(groups = "hardware")
void EEE()
{
	System.out.println("i am EEE");

}
@Test(groups = "hardware")
void ECE()
{
	System.out.println("i am ECE");

}
}
