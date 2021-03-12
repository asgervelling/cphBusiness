/*
4.a print out numbers from 0 to 20 using a for loop.
 4.b alter the for loop from 4.a to only print even numbers (hint: google 'java modulus even number')
 4.c print out the same result as in task 4.b using a while loop instead of a for loop.
 */

void fourA() {
  for (int i = 0; i < 20; i++) {
    System.out.println(i);
  }
}

void fourB() {
  for (int i = 0; i < 20; i++) {
    if (i % 2 == 0) {
      System.out.println(i);
    }
  }
}

void fourC() {
  int i = 0;
  while (i < 20) {
    if (i % 2 == 0) {
      System.out.println(i);
    }
    i++;
  }
}

void setup() {
  System.out.println("Opgave 4.a:\n");
  fourA();
  System.out.println("Opgave 4.b:\n");
  fourB();
  System.out.println("Opgave 4.c:\n");
  fourC();
}
