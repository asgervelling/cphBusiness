/*
5.a Create a new class Datamatik or reuse the one you created earlier.
    Add an array of Students with 10 elements in it. 
    This should be a class variable (static). 
    From the main method, add 10 student instances to the array. 
    Each student must have a unique reference.

5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer.
    The function should return the field "name" (the name of the student) and print it
    (the integer should be used as the index nuber of the student to be printed).
    Call this method with different parameters (only the integer - not the array) from the main() of Datamatik.

5.c Create a similar function to that of 5.b, but instead of receiving the array and an integer,
    it receives the array and a string.
    Loop through all elements in the array until you find the element with the name received as a parameter.
    Then return the index of that student. Call this method with different names from the main method of Datamatik
*/
public class Datamatik {
    static Student[] students = new Student[10];
    public void main() {
        // 5.a
        for (int i = 0; i < 10; i++) {
            students[i] = new Student(String.format("Student %d", i), 18 + i * 4,
                                     (Math.random() > 0.5 ? true : false),
                                     (Math.random() > 0.5 ? 'a' : 'b'));
        }
        
        // 5.b
        System.out.println("Printing some student names:");
        System.out.println(printStudentName(students, 2).name + "\n" +
                           printStudentName(students, 8).name + "\n");
        
        // 5.c
        System.out.println("Finding the indexes of those students from before:");
        System.out.println(String.format("Student 2 is at index %d.\n" +
                                         "Student 8 is at index %d.",
                                         getIndexFromName(students, "Student 2"),
                                         getIndexFromName(students, "Student 8")));
    }

    public Student printStudentName(Student[] students, int i) {
        return students[i];
    }

    public int getIndexFromName(Student[] students, String studentName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equals(studentName)) {
                return i;
            }
        }
        return -1;
    }
}
