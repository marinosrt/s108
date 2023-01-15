package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("Hello", " banana ", " lover.", " To ", "paradise ", "FANDANGO!");

        System.out.println(FindO(myList));


    }

    public static List<String> FindO (List<String> myList){
        List<String> ListO = new ArrayList<>();

        myList.forEach(word -> {
            if(word.toLowerCase().contains("o") && word.length() > 5){
                ListO.add(word);
            }
        });

        return ListO;
    }

}
