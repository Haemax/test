package package1;

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

	}

	int[] insereUltimo(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int next_element_index = selectSmallestbyIndex(arr);
			
		}
		return arr;
	}

	int selectSmallestbyIndex(int[] arr) {
		int smallest = -1;
		int smallest_index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
				smallest_index = i;
			}
		}
		return smallest_index;
	}
	
	int[] shiftRight(int[] arr, int pos) {
		int posVal = arr[pos];
		for(int i = (pos-1); i > 0; i--) {
			arr[pos] = arr[pos-1];
		}
		return arr;
	}

}
