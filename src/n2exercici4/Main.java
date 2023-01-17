package n2exercici4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("23", "papaya37", "Apustuflant", "escoliosi", "escrement", "28943", "pardieu");

        //Order list alphabetically, only by the first character
        //method reference from lambda
        //myList.sort((s1, s2) -> Character.compare(s1.charAt(0), s2.charAt(0)));
        myList.sort(Comparator.comparingInt(s -> s.charAt(0)));
        System.out.println("Alphabetically sorted List: " + myList);

        //Order list sorting strings containing letter E
        myList.sort((s1, s2) -> {
            if (s1.contains("e") && !s2.contains("e")) return -1;
            if (!s1.contains("e") && s2.contains("e")) return 1;
            return s1.compareTo(s2);
        });
        System.out.println("Elements containing letter E first: " + myList);

        // Modify elements containing an A
        myList.replaceAll(s -> s.toLowerCase().replace('a', '4'));
        System.out.println("Replacing letter A for 4: " + myList);

        // Mostrar solo los elementos que son numéricos
        System.out.println("Showing only numbers: ");
        myList.stream().filter(s -> s.matches("[0-9]+")).forEach(System.out::println);

    }

}
