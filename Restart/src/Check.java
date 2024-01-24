import java.util.Scanner;

public class Check {
	public int solve(String A) {
		int count_one = 0;
		int max_count = 0;
		int temp = 0;
		int n = A.length();
		for (int i = 0; i < n; i++) {
			if (A.charAt(i) == '1') {
				count_one++;
				temp++;
			} else {
				max_count = Math.max(max_count, temp);
				temp = 0;
			}
		}
		//System.out.println(count_one);
		max_count = Math.max(max_count, temp);
		int[] left = new int[n];
		int[] right = new int[n];

		if (A.charAt(0) == '1') {
			left[0] = 1;
		} else {
			left[0] = 0;
		}
		if (A.charAt(n - 1) == '1') {
			right[n - 1] = 1;

		} else {
			right[n - 1] = 0;
		}
		for (int i = 1; i < n; i++) {
			if (A.charAt(i) == '1') {
				left[i] = left[i - 1] + 1;
			} else {
				left[i] = 0;
			}
		}
		for (int j = n - 2; j >= 0; j--) {
			if (A.charAt(j) == '1') {
				right[j] = right[j + 1] + 1;

			} else {
				right[j] = 0;
			}
			
		}
		for(int i=1;i<n-1;i++) {
			if(A.charAt(i)=='0') {
				int sum=left[i-1]+right[i+1];
				if(sum<count_one) {
					max_count=Math.max(max_count, sum+1);
				}else {
					max_count=Math.max(max_count, sum);
				}
			}
		}
		return max_count;

	}

	public static void main(String[] args) {
		Check c = new Check();
		String s = "00000011111111";
		System.out.println(c.solve(s));
	}
}