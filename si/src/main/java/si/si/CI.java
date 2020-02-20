package si.si;
import java.lang.Math;
import java.util.*;
public class CI {
	public float p,r;
	public int t,n;
	public void inputValuesci()
	{
		Scanner s=new Scanner(System.in);
		
		System.out.printf("enter the principal amount");
		p=s.nextFloat();
		
		System.out.printf("enter the rate");
		r=s.nextFloat();
		System.out.printf("enter the time");
		t=s.nextInt();
		System.out.printf("enter the number");
		n=s.nextInt();
	}
	public void computeci()
	{
		float d=p*(1+(r/n));
		float po=n*t;
		double compint=Math.pow(d,po);
		System.out.printf("%f",compint);
		
		
	}

}
