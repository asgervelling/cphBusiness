/*
2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean. 
2.b Write a function that receives to integers as parameters and returns the sum of them.
2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()".
    Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. 
    (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )
 */
package src.ex2;

class Main {
    public static boolean happy = true;
  
        public static void main(String [] args) {
            // 2.a
            if (iAmHappy())
            {
            System.out.println("I clap my hands");
            }
            else
            {
            System.out.println("I don't clap my hands"); 
            }

            // 2.b
            System.out.println("2 + 4 == " + iSum(2, 4));

            // 2.c
            System.out.println("Making \"This string\" uppercase: " + toUpper("This string"));

            // 2.d
            System.out.println("Return false on the string \"hello\": " + firstCharIsUpperCase("hello"));
            System.out.println("Return true on the string \"Hello\": " + firstCharIsUpperCase("Hello"));
        }
  
  
    public static boolean iAmHappy()
    {
        // fill out what is missing here: 
        return happy;
    }

    public static int iSum(int a, int b) {
        return a + b;
    }

    public static String toUpper(String s) {
        return s.toUpperCase();
    }

    public static boolean firstCharIsUpperCase(String s) {
        return Character.isUpperCase(s.charAt(0));
    }
}