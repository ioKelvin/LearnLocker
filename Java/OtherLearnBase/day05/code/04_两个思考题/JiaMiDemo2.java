/*
	A:把实现的代码改进为功能实现
	B:键盘录入版
*/
import java.util.Scanner;
class Point{
	int x;
	int y;
	
	public Point(int a,int b)
	{
		x=a;y=b;
	}
}

class JiaMiDemo2 {
public static void swap(int k,int j)
{
	int temp = k;
	k=j;
	j=k;
}
public static void tricky(Point arg1, Point arg2)
{
  System.out.println(arg1);
  System.out.println(arg2);
  System.out.println("sssssssssssssssssssssss");
  arg1.x = 100;
  arg1.y = 100;
  Point temp = arg1;
  
  System.out.println("X: " + temp.x + " Y: " +temp.y); 
  System.out.println("----------1-----------");
  arg1 = arg2;
  System.out.println("X: " + arg1.x + " Y: " +arg1.y); 
  System.out.println("----------2-----------");
  arg2 = temp;
  System.out.println("X: " + arg2.x + " Y: " +arg2.y); 
  System.out.println("----------3-----------");
  
  
  System.out.println(arg1);
  System.out.println(arg2);
  System.out.println("sssssssddddddddddddddsssssss");
}
public static void main(String [] args)
{
  Point pnt1 = new Point(0,0);
  Point pnt2 = new Point(0,0);
  
  System.out.println(pnt1);
  System.out.println(pnt2);
  
  System.out.println("X: " + pnt1.x + " Y: " +pnt1.y); 
  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
  System.out.println(" ");
  tricky(pnt1,pnt2);
  System.out.println("X: " + pnt1.x + " Y:" + pnt1.y); 
  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
  
  System.out.println("=-----------------------------------=");
  
  int k1 = 1;
  int k2 = 3;
  System.out.println(k1);
  System.out.println(k2);
  swap(k1,k2);
  System.out.println("k1: " + k1 + " k2: " +k2);
  System.out.println(k1);
  System.out.println(k2);
  
  

}

}
