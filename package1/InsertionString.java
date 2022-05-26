package package1;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inp = scn.nextLine();

		String[] inpSplit = inp.split(",");

		System.out.println(Arrays.toString(inpSplit).replace("[", "").replace("]", ""));

		String[] sorted = insertionSort(inpSplit);

		scn.close();
	}

	private static String[] insertionSort(String[] inpSplit) {
		for (int i = 0; i < inpSplit.length; i++) {
			for (int j = 0; j < i; j++) {
				if (inpSplit[i].compareTo(inpSplit[j]) < 0) {
					insertShift(inpSplit, j, i);
					System.out.println(Arrays.toString(inpSplit).replace("[", "").replace("]", ""));
				}
			}
		}
		return inpSplit;
	}

	private static void insertShift(String[] inpSplit, int insert_pos, int current_pos) {
		String val = inpSplit[current_pos];

		for (int i = current_pos; i > insert_pos; i--) {
			inpSplit[i] = inpSplit[i - 1];
		}

		inpSplit[insert_pos] = val;
	}

}
