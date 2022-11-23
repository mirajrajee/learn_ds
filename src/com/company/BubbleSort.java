package com.company;

/**
 * Array Sorting - Bubble Sort
 * Author: Maverick
 * Time complexity O(n^2) Quadratic
 * BubbleSort class implements the array bubble sort algorithm, This bubbles up the large value to the
 * right hand-side of the array.
 */
public class BubbleSort {
  public int[] perform(int[] inputArray) {

    for(int j= inputArray.length-1; j > 0; j--){
      for(int i= 0; i < j; i++){
        if (inputArray[i] > inputArray[i+1]){
          swap(inputArray,i,i+1);
        }
      }
    }

    return inputArray;
  }

  public void swap(int[] input, int i, int j){
    int temp = input[i];
    input[i] = input[j];
    input[i+1] = temp;
  }
}
