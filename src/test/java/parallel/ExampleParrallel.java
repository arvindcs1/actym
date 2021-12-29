package parallel;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class ExampleParrallel extends BaseClass{

	@Test
	public void test1() {
		System.out.println(" I am in Test1");
	}
	@Test
	public void test2() {
		System.out.println(" I am in Test2");
    }
	@Test
	public void test3() {
		System.out.println(" I am in Test3");
    }
	@Test
	public void test4() {
		System.out.println(" I am in Test4");
    }
}