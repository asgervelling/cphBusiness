/*
7.a create an integer called input and assign it a value of 20. Use a loop to print all integers between the input value and 0, with the following exceptions:
 if the number is 6, instead print the string "six".
 Once the number is half of the input value, print "HALF!"
 
 7.b Run exercise 7.a again with a different input value and make sure it still works. You should also consider if it will work with a negative input, e.g. -20.
 */

void printIteration(int i, int input) {
  if (i == 6) {
    println("six");
  } else if (i == input / 2) {
    println("HALF!");
  } else {
    println(i);
  }
}

void sevenAB(int input) {
  println("\nvoid sevenAB(" + input + "):");
  if (input > 0) {
    for (int i = 0; i < input; i++) {
      printIteration(i, input);
    }
  } else {
    for (int i = 0; i > input; i--) {
      printIteration(i, input);
    }
  }
}


void setup() {
  sevenAB(20); // exercise 7.a
  sevenAB(-8); // exercise 7.b
}
