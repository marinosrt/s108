package n1exercici3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

        System.out.println("Year's month list:\n");
        myList.forEach(month -> System.out.println(month));

    }

}
