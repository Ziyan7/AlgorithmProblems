package userRegistration.AlgorithPrograms;

public class PrimeNumbers {
	public static void main(String[] args) {
		int start =0;
		int end =1000;
		int count;
		// loop for finding and printing all prime numbers between given range
		for (int i = start; i <= end; i++) {
			// logic for checking number is prime or not
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count = count + 1;
			}
			if (count == 2)
				System.out.print(i + " ");
		}
	}
}
