import java.util.Scanner;

public class CheckArmstrongNum {
	public static boolean isArmstrong(int num) {
		int last = 0, digits = 0, sum = 0;
		int temp = num;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = num;
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (sum == num) {
			// System.out.println("Armstrong");
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (isArmstrong(n)) {
			System.out.println("Armstrong");

		} else {
			System.out.println("Not ArmStrong");

		}
	}
}
