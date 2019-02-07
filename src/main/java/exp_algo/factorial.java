package exp_algo;

public class factorial {

	public static void main(String[] args) {
System.out.println(factorialFunction(6));
	}

	public static int factorialFunction(int num) {
		int factorial = 1;
		if (num == 0)
			return 1;
		/*for (int i = num; i > 0; i--)
			factorial *= i;
		return factorial;*/
		return num * factorialFunction(num-1);
	}
}
