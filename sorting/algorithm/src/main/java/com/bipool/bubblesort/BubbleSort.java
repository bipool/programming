package com.bipool.bubblesort;

public class BubbleSort {
	
    public static void main( String[] args ){
    	
        int[] numbers = {3,2,1};
        
        display(numbers);
        bubbleSort(numbers);
        System.out.println("");
        System.out.println("After Sorting");
        display(numbers);
    }
    
    public static void bubbleSort(int[] numbers){
    	
    	int len = numbers.length -1 ;
    	if(len <= 0){
    		return;
    	}
    	
    	
    	for(int i = 0; i <= len; i++ ){
    		for(int j = 1; j <= len - i; j++ ){
    			if(numbers[j-1] > numbers[j]){
    				doSwap(numbers,j);
    			}
    		}
    	}
    	
    	
    }
    
    public static void doSwap(int[] numbers, int j){
    	int tmp = numbers[j-1];
    	numbers[j-1] = numbers[j];
    	numbers[j] = tmp;
    }
    
    
    public static void display(int[] numbers){

    	for(int i : numbers){
    		System.out.printf("%8d", i);
    	}
    	
    }
    
    
}
