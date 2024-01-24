import java.util.Scanner;

public class PrintArmstromg {
	public static boolean isArmStrong(int n) {
		int last = 0, digits = 0, temp = n, sum = 0;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (sum == n) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (isArmStrong(i)) {
				System.out.println(i);
			}
		}
	}

}
