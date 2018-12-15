package hronlinr;

public class SOlution {
	public static void main(String... a) {
		int[] apples = new int[] { -2, 2, 1 };
		int[] oranges = new int[] { 5, -6 };
		// countApplesAndOranges(7, 11, 5, 15, apples, oranges);
		System.out.println(kangaroo(0, 1, 0, 1));
	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		for (int i = 0; i < apples.length; i++) {
			apples[i] = apples[i] + a;
		}
		for (int j = 0; j < oranges.length; j++) {
			oranges[j] = oranges[j] + b;
		}
		int count = 0;
		int i = 0;
		while (i < apples.length) {
			if (apples[i] < t && apples[i] >= s) {
				count++;
			}
			i++;
		}
		System.out.println(count);
		count = 0;
		i = 0;
		while (i < oranges.length) {
			if (oranges[i] < t && oranges[i] >= s) {
				count++;
			}
			i++;
		}
		System.out.print(count);
	}

	// Complete the kangaroo function below.
	static String kangaroo(int x1, int v1, int x2, int v2) {
		if (x1 == 0 && x2 == 0) {
			if (v1 == v2) {
				return "YES";
			} else
				return "NO";
		} else if(v1 == v2) {
			if(x1 > x2) 
				return "YES";
			else
				return "NO";
		}
		double z = (x1 - x2) / (v2 - v1);
		if (z > 0) {
			return "YES";
		} else
			return "NO";
	}
}
