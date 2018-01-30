package runner;



public class Task1 {
	

	public int Adder_fun(int x,int y,int z)
	{
	return x+y+z;
	}
    public int Mul_fun(int x,int y,int z)
    {
	return x*y*z;
    }
    public int div_10(int x,int y,int z)
    {
    	return ((x+y+z)%10);
    }

	public static void main(String[] args) 
	{
		int a=5,b=4,c=2;
        Task1 obj=new Task1();
		System.out.println("sum="+ obj.Adder_fun(a,b,c));
		System.out.println("pro="+ obj.Mul_fun(a,b,c));
		System.out.println("div="+ obj.div_10(a,b,c));
		

	}

}
