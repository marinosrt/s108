package n1exercici7;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("42jkss", "popeye67", "sking1732", "243", "aloha");

        System.out.println(SortList(myList));


    }

    public static List<String> SortList(List<String> myList){

        myList.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));

        return myList;
    }

}
