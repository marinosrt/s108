package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Pau", "Edna", "Albert", "Marina", "Ariel", "Jan", "Ala");

        System.out.println("Names that start with letter A and has exactly 3 characters:");
        System.out.println(findLetterA(myList));

    }

    public static List<String> findLetterA(List<String> myList){
        List<String> LetterAList = new ArrayList<>();

        myList.forEach(word -> {
            if(word.startsWith("A") && word.length() == 3){
                LetterAList.add(word);
            }
        });


        return LetterAList;
    }

}
