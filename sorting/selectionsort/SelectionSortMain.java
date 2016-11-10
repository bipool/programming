package programming.sorting.selectionsort;

public class SelectionSortMain {
	
	public static void main(String[] args) {
		int[] numbers = {3,2,1};
		SelectionSort selectionSort = new SelectionSort();
		System.out.println("Before Sorting ::: ");
		selectionSort.display(numbers);
		selectionSort.sort(numbers);
		System.out.println("\nAfter Sorting ::: ");
		selectionSort.display(numbers);
	}
}
