import java.util.Scanner;

public class Number {
	public void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		char[] string = "122133".toCharArray();
		System.out.println(findMax(string));

	}

	public static int findMax(char[] string) {
		int length = string.length;
		for (int i = length; i >= 2; i--) {
			for (int j = 0; j + i - 1 < length; j++) {
				if (isSymmetry(string, j, j + i - 1)) {
					return i;
				}
			}
		}
		return 1;
	}

	private static boolean isSymmetry(char[] string, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			if(string[i]!=string[j]) {				
				return false;
			}
		}
		return true;
	}
}
