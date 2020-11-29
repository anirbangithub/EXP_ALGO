package puzzle_revisitd;

public class Pyramid {
	public static void main(String[] args) {
		//printPyramidAsterix();
		printPiramidNo();
	}

	public static void printPyramidAsterix() {
		for(int i = 0; i<5;i++)
		{
			for(int j = 0;j <=5-i;j++) {
				System.out.print(" ");
			}
			for(int k = 0;k <=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void printPiramidNo() {
		for(int i = 0; i<5;i++)
		{
			for(int j = 0;j <=5-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k <=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
