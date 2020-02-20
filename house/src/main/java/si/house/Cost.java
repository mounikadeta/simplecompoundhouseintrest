package si.house;
import java.util.*;
public class Cost {
	int ms,totalarea;
	public void input()
	{
	Scanner s=new Scanner(System.in);
	System.out.printf("enter material standard");
	System.out.printf("1.standard material");
	System.out.printf("2.above standard material");
	System.out.printf("3.hign standard material");
	System.out.printf("4.high standard material and fully automated");
	ms=s.nextInt();
	System.out.printf("enter the money");
	totalarea=s.nextInt();
	}
	public void compute()
	{
		int amount=0;
		switch(ms)
		{
		case 1:amount=1200;
		       break;
		case 2:amount=1500;
		       break;
		case 3:amount=1800;
		       break;
		case 4:amount=2500;
		}
		amount=amount*totalarea;
		System.out.printf("total cost for house is %d",amount);
	}
}
	
	
	
	
	
	


