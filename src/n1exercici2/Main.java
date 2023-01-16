package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("Hello", " banana ", " lover.", " To ", "paradise ", "FANDANGO!");

        System.out.println(FindO(myList));


    }

    public static List<String> FindO (List<String> myList){
        List<String> ListO = new ArrayList<>();

        ListO = myList.stream()
                .filter(word -> word.toLowerCase().contains("o"))
                .filter(word -> word.length() > 5)
                .collect(Collectors.toList());

        return ListO;
    }

}
