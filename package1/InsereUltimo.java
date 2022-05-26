package package1;

import java.util.Arrays;
import java.util.Scanner;

public class InsereUltimo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inp = scn.nextLine();

		String[] inpSplit = inp.split(" ");

		int[] arr = new int[inpSplit.length];

		for (int i = 0; i < inpSplit.length; i++) {
			arr[i] = Integer.parseInt(inpSplit[i]);
		}

		arr = insereUltimo(arr);

		System.out.println(Arrays.toString(arr));

		scn.close();
	}

	private static int[] insereUltimo(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					insertShift(arr, j, i);
				}
			}
		}
		return arr;
	}

	private static void insertShift(int[] arr, int insert_pos, int shift_index) {
		int val = arr[shift_index];

		for (int i = shift_index; i > insert_pos; i--) {
			arr[i] = arr[i - 1];
		}

		arr[insert_pos] = val;
	}

}
