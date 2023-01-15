package n1exercici8.Java;

import n1exercici8.Interfaces.Revert;

public class Main {

    public static void main(String[] args) {

        String originalString = "apustuflant";

        Revert reverser = str -> {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        };

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reverser.reverse((originalString)));

    }

}
