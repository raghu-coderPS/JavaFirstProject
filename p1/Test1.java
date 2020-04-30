package p1;

public interface Test1 {
	abstract int operation(int x,int y);
	default Test1 add(int a,int b)
	{
		return (int x, int y) -> x + y;
	}
	default Test1 multiply(int a,int b)
	{
		return (int x, int y) -> x*y;
	}
	default Test1 substract(int a,int b)
	{
		return (int x, int y) -> x - y;
	}
	default Test1 devide(int a,int b)
	{
		return (int x, int y) -> x / y;
	}


}
