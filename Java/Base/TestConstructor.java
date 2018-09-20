class ab
{
	private int k;
	private int v;
	public ab(int a,int b)
	{	
		this.k = a;
		this.v = b;
	}
	public ab(int a,int b,int c)
	{
		this(a,b);
		System.out.println("k:"+this.k+",v:"+this.v);
		this.k = this.v + c;
		System.out.println("k:"+this.k);
	}
}

public class TestConstructor
{
	public static void main(String[] args)
	{
		ab a = new ab(1,2,3);
	}
}