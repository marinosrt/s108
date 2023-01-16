package n1exercici6;

import java.util.*;
import java.util.stream.Collectors;

//Crea una llista amb nombres i cadenes de text
// i ordena la llista amb les cadenes de més curta a més llarga.
public class Main {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("42jkss", "popeye67", "sking1732", "243", "aloha");

        System.out.println(SortList(myList));

        
    }

    public static List<String> SortList(List<String> myList){
        List<String> givenList = new ArrayList<>();

        //method reference from lambda expression:
        // myList.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        myList.sort(Comparator.comparingInt(String::length));

        return givenList;
    }

}
