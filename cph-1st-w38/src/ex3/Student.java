package src.ex3;

public class Student {
    /*
    in the Student class, declare the class "Student" and add 4 fields: "name", "age", "isFemale", "datamatikerTeam"
    using appropriate data types for each. */
    String name;
    int age;
    boolean isFemale;
    char datamatikerTeam;

    /* in the Student class, add a constructor that takes in 4 parameters with the names "tmpName", "tmpAge", "tmpIsFemale",
    "tmpDatamatikerTeam" with the same data types used in 3.c */    
    public Student(String name, int age, boolean isFemale, char datamatikerTeam) {
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
        this.datamatikerTeam = datamatikerTeam;
    }
}
