package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("Hello", " banana ", " lover.", "to ", "paradise ", "fandango!");

        System.out.println(FindO(myList));


    }

    public static List<String> FindO (List<String> myList){
        List<String> ListO = new ArrayList<>();

        myList.forEach(word -> {
            if(word.toLowerCase().contains("o")){
                ListO.add(word);
            }
        });

        return ListO;
    }
}