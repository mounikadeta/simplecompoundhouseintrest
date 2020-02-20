package si.si;
import java.util.*;
public class SI {
	public float p,t,r;
	public void inputValuessi()
	{
		Scanner s=new Scanner(System.in);
		System.out.printf("enter the principal amount");
		p=s.nextFloat();
		
		System.out.printf("enter the rate");
		r=s.nextFloat();
		System.out.printf("enter the time");
		t=s.nextFloat();
		
	}
	public void computesi()
	{
	     float simpint=(p*t*r)/100;
         System.out.printf("%f",simpint);
	}

}
