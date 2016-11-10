package programming.sorting.selectionsort;

public class SelectionSort {
	
		
		public void sort(int[] data){
			
	    	int len = data.length -1 ;
	    	if(len <= 0){
	    		return;
	    	}
	    	
			for (int i = 0; i < len; i++) {
				int minIndex = findMinimumIndex(data, i);
				doSwap(data, minIndex, i);
			}
		}
		
		
		private int findMinimumIndex(int[] data, int startIndex){
			int minIndex = startIndex;
			for (int j = startIndex+1; j < data.length; j++) {
				if (data[j] < data[minIndex]) {
					minIndex = j;
				}
			}
			
			return minIndex;
		}
		
		private void doSwap(int[] data, int from, int to){
			int tmp = data[from];
			data[from] = data[to];
			data[to] = tmp;

		}
		
		
	    public  void display(int[] numbers){

	    	for(int i : numbers){
	    		System.out.printf("%8d", i);
	    	}
	    	
	    }
	
}
