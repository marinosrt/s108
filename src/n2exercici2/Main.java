package n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 23, 45, 567, 342, 3, 2);

        System.out.println("The output list is: ");
        System.out.println(returnLettersAndNumbers(myList));

    }

    public static List<String> returnLettersAndNumbers(List<Integer> myList){
        List<String> LetterNumberList = new ArrayList<>();

        myList.forEach(number -> {
            if(number % 2 == 0){
                LetterNumberList.add("e" + number);
            } else {
                LetterNumberList.add("o" + number);
            }
        });

        return LetterNumberList;
    }

}
