/*
6.a make 2 integer variables named a and b. Print "Success!" if either of them is equal to 10 or if the sum is. If not, print "Failure!".
6.b make 3 integer variables named x, y and z. Print "Success!" if their sum is 30, but none of them may have the value of 10, 20 or 30. Otherwise print "Failure!".
*/

void sixA(int a, int b) {
  String stringForTesting = "(" + a + ", " + b + "): ";
  if (a == 10 || b == 10 || a+b == 10) {
      println(stringForTesting + "Success!");
  } else {
    println(stringForTesting + "Failure!");
  }
}

void sixB(int x, int y, int z) {
  String stringForTesting = "(" + x + ", " + y + ", " + z + "): ";
  int[] inputs = { x, y, z };
  for (int in : inputs) {
    if (in == 10 || in == 20 || in == 30) {
      println(stringForTesting + "Failure!");
      return;
    }
  }
  
  if (x + y + z == 30) {
    println(stringForTesting + "Success!");
  } else {
    println(stringForTesting + "Failure!");
  }
}

void test() {
  println("Testing sixA():\n");
  sixA(-5, -5);
  sixA(4, 5);
  sixA(5, 5);
  sixA(5, 6);
  sixA(10, 2);
  
  println("Testing sixB():\n");
  sixB(10, 2, 3);
  sixB(10, 19, 1);
  sixB(4, 4, 22);
  sixB(5, 5, 20);
}

void setup() {
  test();
}
