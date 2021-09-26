package userRegistration.AlgorithPrograms;

import java.util.ArrayList;
import java.util.Scanner;


public class Permutation {
	static ArrayList<String> permutation1 = new ArrayList<>();
	static ArrayList<String> permutation2 = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		int n = str.length();
		sc.close();
		Permutation permutation = new Permutation();
		permutation.permuteRecursion(str, 0, n - 1);
		System.out.println("using recursive approach:" + permutation1);
		permutation.permuteIteration(str);
		System.out.println("using iterative approach:" + permutation2);
		permutation.checkEqual();
	}

	/**
	 * permutation function
	 * @param str string to calculate permutation for
	 * @param l   starting index
	 * @param r   end index
	 */
	private void permuteRecursion(String str, int l, int r) {
		if (l == r)
			permutation1.add(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permuteRecursion(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	/**
	 * Swap Characters at position
	 * @param str1 string value
	 * @param i    position 1
	 * @param j    position 2
	 * @return swapped string
	 */
	public String swap(String str1, int i, int j) {
		char temp;
		char[] charArray = str1.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	private void permuteIteration(String str) {
		// base case
		if (str == null || str.length() == 0) {
			return;
		}
		// initialize the list with the first character of the string
		permutation2.add(String.valueOf(str.charAt(0)));

		// do for every letter of the specified string
		for (int i = 1; i < str.length(); i++) {
			// consider previously constructed partial permutation one by one
			for (int j = permutation2.size() - 1; j >= 0; j--) {
				// remove current partial permutation from the ArrayList
				String s = permutation2.remove(j);

				// Insert the next character of the specified string at all
				// possible positions of current partial permutation. Then
				// insert each of these newly constructed strings in the list

				for (int k = 0; k <= s.length(); k++) {
					// Advice: use StringBuilder for concatenation
					permutation2.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
				}
			}
		}
	}

	private void checkEqual() {
		int check = 0;
		for (int i = 0; i < permutation1.size(); i++) {
			if (permutation2.contains(permutation1.get(i)))
				continue;
			else
				check = 1;
		}
		if (check == 0)
			System.out.println("Same results");
		else
			System.out.println("Different result");
	}

}