package n3exercici1;

import n3exercici1.Class.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> containsA;

        List<Student> studentList = Arrays.asList(
                new Student("Marina", 30, "JAVA", 7.0),
                new Student("Gaby", 32, "PHP", 8.7),
                new Student("Christian", 35, "REACT", 9),
                new Student("Julia", 26, "JAVA", 7.9),
                new Student("Pablo", 43, "NODEJ", 9.8),
                new Student("Paula", 33, "PHP", 6),
                new Student("Guillem", 31, "REACT", 4),
                new Student("Cesar", 34, "JAVA", 8.5),
                new Student("Anna", 28, "NODEJ", 9.3),
                new Student("Ali", 39, "JAVA", 2)
        );

        //print every student and its name
        System.out.println("List of every student");
        studentList.forEach(student -> System.out.println(student.getName() + ", " + student.getAge()));

        //save into a new list students starting name A
        System.out.println("\n List of every student starting with A");
        containsA = studentList.stream()
                .filter(student -> student.getName().startsWith("A"))
                .collect(Collectors.toList());
        containsA.forEach(System.out::println);

        //print students' grade up to 5
        System.out.println("\n List of every student who's grade is up from 5: ");
        studentList.stream()
                .filter(student -> student.getGrade() > 5)
                .forEach(System.out::println);

        //print students' grade up to 5 and not belonging to PHP course
        System.out.println("\n List of every student who's grade is up from 5 and don't belong to the PHO course: ");
        studentList.stream()
                .filter(student -> student.getGrade() > 5 && student.getCourse().equalsIgnoreCase("PHP"))
                .forEach(System.out::println);

        //print students' JAVA course and up to 18 years old
        System.out.println("\n List of every student from JAVA course and 18 years old or more ");
        studentList.stream()
                .filter(student -> student.getAge() >= 18 && student.getCourse().equalsIgnoreCase("JAVA"))
                .forEach(System.out::println);


    }

}
