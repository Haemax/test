package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * The selection sort algorithm chooses the smallest element from the array and
 * puts it in the first position. Then chooses the second smallest element and
 * stores it in the second position, and so on until the array is sorted.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {


	private int getSmallest(T[] array, int startPos){
		int smallest = startPos;

		for (int i = startPos; i < array.length-1; i++){
			if (array[smallest].compareTo(array[i+1]) > 0){
				smallest = i+1;
			}
		}
			return smallest;
	}


	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		for (int j = 0; j< array.length; j++){
			Util.swap(array, getSmallest(array, j), j);
		}
	}
}
