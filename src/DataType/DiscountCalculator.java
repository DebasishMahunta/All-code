package DataType;
import java.util.*;

public class DiscountCalculator {
	float discoutCalculator(float i,float s,float t,float n) {
		float d1 = 0.0f;
		float d2 = 0.0f;
		d1 = i*(7.0f/100)+s*(3.0f/100)+t*(2.0f/100)+n*(1.0f/100);
		float sum = i+s+t+n;
		if (sum >= 25001 && sum <= 50000) {
			d2 = sum * (5.0f / 100);
			} else if (sum >= 50001 && sum <= 100000) {
			d2 = sum * (7.0f / 100);
			} else{
			d2 = sum * (10.0f / 100);
			}
		if(d1>d2) {
			return d1;
		} else {
		    return d2;
		}
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost of Iron :");
		float i = sc.nextFloat();
		System.out.println("Enter the cost of Steel :");
		float s = sc.nextFloat();
		System.out.println("Enter the cost of Tungsten :");
		float t = sc.nextFloat();
		System.out.println("Enter the cost of  Neckel :");
		float n = sc.nextFloat();
		DiscountCalculator d = new DiscountCalculator();
		d.discoutCalculator(i, s, t, n);
		System.out.println(d.discoutCalculator(i, s, t, n));
	}

}
