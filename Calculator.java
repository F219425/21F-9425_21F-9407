package newCalc;

public class Calculator{
	private int var1;
	private int var2;
	
	public Calculator(){
		
	}
	
	public void add(int v1 , int v2){
		System.out.println(v1+v2);
	}
	
	public void sub(int v1, int v2)
	{
		System.out.println(v1-v2);
	}
	
	public void div(int v1,int v2){
		
		System.out.println(v1/v2);
		
	}
	
	public static void main(String[] args){
		
		Calculator c = new Calculator();
		
		c.add(1,2);
		c.sub(2,3);
		
	}
	
}