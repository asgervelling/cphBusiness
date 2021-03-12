/*
4.b Write a function that takes in an array of strings as parameter and prints each string.
4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
4.d Write a function that receives an integer array as a parameter and returns the average value.	
4.e Consider how you could write a function that takes in an integer array as a parameter and 
    returns the array sorted from lowest to highest value.
*/
public class ArrayMethods {
    public void printStringArr(String[] arr) {
        for (String s : arr) {
            System.out.printf(s + " ");
        }
        System.out.println();
    }

    public void printIntArr(int[] arr) {
        for (int i : arr) {
            System.out.printf(i + " ");
        }
        System.out.println();
    }

    public float average(int[] arr) {
        float total = 0;
        for (int i : arr) {
            total += i;
        }
        return total / arr.length;
    }

    public void insertionSort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }
}
