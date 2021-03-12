import java.util.Scanner;

public class ReversingNumber extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the positive integer:");
		int number = scanner.nextInt();
		int result = reverseNumber(number);

		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int reverseNumber(int number) {

		int sum = 0;

		while (number > 0) {
			int remainder = number % 10;
			sum = sum * 10 + remainder;
			number /= 10;
		}

		return sum;
	}
}
