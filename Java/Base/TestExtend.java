/* class ab
{
	static {
		System.out.println("123");
	}
	
	private int k;
	private int v;
	public ab(){
		System.out.println("ab()");
		
	}
	
	public ab(int a,int b)
	{	
		this.k = a;
		this.v = b;
		System.out.println("ab(int a,int b)");
	}
	public ab(int a,int b,int c)
	{
		this(a,b);
		System.out.println("k:"+this.k+",v:"+this.v);
		this.k = this.v + c;
		System.out.println("k:"+this.k);
		
		System.out.println("ab(int a,int b,int c)");
	}
	
	public void ll()
	{
		
	}
}

public class TestExtend extends ab
{
	
	public void kkk()
	{
		ab a = new ab(1,2);
		a.ll();
	}
	public static void main(String[] args)
	{
		ab a = new ab(1,2);
		
	}
} */


class ii
{
	/*static*/ {
		System.out.println("ii static");
	}
}

class kk extends ii{
	static{
		System.out.println("kk static");
	}
}

class jj extends kk{
	static{
		System.out.println("jj static");
	}
}

public class TestExtend
{
	public static void main(String[] args)
	{
		String str1 = new String("ooooooo");
		String str2 = new String("ooooooo");
		
		System.out.println(str1.hashCode());
		str1 = "3232";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1);
		System.out.println(str2);
	}
}

