package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("Hello", " banana ", " lover.", "to ", "paradise ", "fandango!");

        System.out.println(FindO(myList));


    }

    public static List<String> FindO (List<String> myList){
        List<String> ListO = new ArrayList<>();

        ListO = myList.stream()
                .filter(str -> str.toLowerCase().contains("o"))
                .collect(Collectors.toList());

        return ListO;
    }
}