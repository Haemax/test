package package1;

import java.util.Scanner;

public class TrocaVizinhos {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inp = scn.nextLine();
		
		
		String[] inpSplit = inp.split(" ");
		
		int[] arr = new int[inpSplit.length];
		
		for(int i = 0; i < inpSplit.length; i++) {
			arr[i] = Integer.parseInt(inpSplit[i]);
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n");
		trocaVizinhos(arr);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		scn.close();
	}
	
	public static void trocaVizinhos(int[] arr) {
		for (int i = 1; i < (arr.length-1); i+=2) {
			int reg1 = arr[i-1];
			int reg2 = arr[i];
			
			arr[i-1] = reg2;
			arr[i] = reg1;
		}
	}
}
