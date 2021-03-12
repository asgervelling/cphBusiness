package src.ex3;

public class Datamatik {
    public void main() {
        Teacher christian = new Teacher("Christian", 36, false);
        Student asger = new Student("Asger", 24, false, 'A');
        Student nikolaj = new Student("Nikolaj", 25, false, 'A');

        System.out.println("The teacher's name is " + christian.name);
        System.out.println("The students:");
        System.out.println(String.format("%s is from team %c.\n%s is from team %c.",
                                         asger.name, asger.datamatikerTeam,
                                         nikolaj.name, nikolaj.datamatikerTeam));
    }
}
