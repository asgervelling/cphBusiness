/*
For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size.
But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work,
if the array received as a parameter would not have a fixed length. 

4.a create arrays of the following type and assign it at least 3 different values: 
    - Integer array
    - String array
    - boolean array
4.b Write a function that takes in an array of strings as parameter and prints each string.
4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
4.d Write a function that receives an integer array as a parameter and returns the average value.	
4.e Consider how you could write a function that takes in an integer array as a parameter and 
    returns the array sorted from lowest to highest value.
*/
public class Main {
        public static void main(String[] args) {
            int[] intArr = {3, 1, 2, 4, 0, 5};
            String[] strArr = {"Hej", "med", "dig"};
            boolean[] boolArr = {false, true, true, false, true};

            ArrayMethods am = new ArrayMethods();
            am.printIntArr(intArr);
            am.printStringArr(strArr);
            System.out.println(am.average(intArr));
            am.insertionSort(intArr);
            am.printIntArr(intArr);
        }
}
