package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {
  int[] inputArray= new int[]{22,35,-15,55,7,-22,-1,65};
  int [] sortedArray = new int[]{-22,-15,-1,7,22,35,55,65};
  BubbleSort bubbleSort = new BubbleSort();

  @Test
  void performBubbleSort() {
    assertArrayEquals(sortedArray,bubbleSort.perform(this.inputArray));
  }
}