class Test
{
	protected int kk;
}
public class Protect
{
	public static void main(String[] main)
	{
		Test a = new Test();
		a.kk   = 300;
		System.out.println(a.kk);
	}

}

	/*		
		Java里面可以通过类的实例变量访问Protect的成员,(同一个包或者不同包的子类中)
		但是C++不同的是，Protect的成员不能通过实例访问，如同private一样
		但是可以通过 类中的友元函数和友元类来访问
	*/