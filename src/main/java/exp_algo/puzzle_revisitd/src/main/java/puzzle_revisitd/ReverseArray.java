package puzzle_revisitd;

public class ReverseArray {

	public static void main(String[] args) {
		char[] sss = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println(reverseArray(sss).toString());
	}

	private static char[] reverseArray(char[] inputAr) {
		char[] reverseAr = new char[inputAr.length] ;
		
		for(int i= 1;i<=inputAr.length;i++)
		{
			reverseAr[i] =inputAr[inputAr.length-i];
		}
		return reverseAr;

	}
}
