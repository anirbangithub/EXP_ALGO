package puzzle_revisitd;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("fibonacci series output:::"+(fibonacci(10).toString()));
		
	}
private static ArrayList<Integer> fibonacci(int range) {
	ArrayList<Integer> fibSeries = new ArrayList<Integer>();
	int a = 0;
	int b = 1;
	int k = 0;
while(fibSeries.size()<range)
{
		k = a +b;
		a =b;
		b = k;
		fibSeries.add(k);
		
	}
	
	return fibSeries;
}
}
