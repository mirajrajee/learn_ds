package com.company;

public class Main {

    public void main(String[] args) {
        int[] intArray=new int[7];
        intArray[0] = 20;
        intArray[1]= 35;
        intArray[2]= -15;
        intArray[3] =55;
        intArray[4]= 1;
        intArray[5] = 7;
        intArray [6] = -22;

        BubbleSort bubbleSortClass = new BubbleSort();
        bubbleSortClass.perform(intArray);
    }
}

