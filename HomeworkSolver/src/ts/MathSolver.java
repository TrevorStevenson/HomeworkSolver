package ts;

import java.util.*;

public class MathSolver {
	
	public static long lowestFactor(long num)
	{
		if (num == 1) return -1;
		else if (num == 2) return 2;
		else if (num == 3) return 3;
		
		long root = (long) Math.sqrt(num);
		
		for (int i = 2; i <= root; i++)
		{
			if (num % i == 0) return i;	
		}
		
		return -1;
	}
	
	public static String isPrime(long num)
	{
		if (num == 1) return "Neither";
		else if (num == 2 || num == 3) return "Yes";
	
		if (lowestFactor(num) == -1) return "Yes";
		
		return "No";
	}
	
	public static String primeFactorization(long num)
	{
		List<Long> factors = new ArrayList<>();
		
		long lowFactor = lowestFactor(num);
		
		while (lowFactor != -1)
		{
			factors.add(lowFactor);
			num /= lowFactor;
			lowFactor = lowestFactor(num);
		}
		
		factors.add(num);
		
		String out = "";
		
		for (int i = 0; i < factors.size(); i++)
		{
			if (i != factors.size() - 1) out += "" + factors.get(i) + " x ";
			else out += "" + factors.get(i);
		}
		
		return out;
	}
	
	public static String gcd(long num1, long num2)
	{
		long remainder = -1;
		long value = 0;
		
		if (num1 < num2)
		{
			value = num1;
			num1 = num2;
			num2 = value;
		}
		
		remainder = num1 % num2;
		
		while (remainder != 0)
		{
			num1 = num2;
			num2 = remainder;
			remainder = num1 % num2;
		}
		
		return String.valueOf(num2);
	}
}
