abstract class harshi
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
abstract class pavan extends harshi{
	void m1()
	{
		System.out.println("method1");
	}
	void m2()
	{
		System.out.println("method2");
	}
}
class jeevan extends pavan
{
	void m3()
	{
		System.out.println("method3");
	}
}
public class prasanth {

	public static void main(String[] args) {
jeevan t=new jeevan();
t.m1();
t.m2();
t.m3();

	}

}
