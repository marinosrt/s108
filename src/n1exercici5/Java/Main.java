package n1exercici5.Java;

import n1exercici5.Interfaces.PiValue;

public class Main {

    public static void main(String[] args) {

        PiValue myPiValue = value -> value;
        System.out.println(myPiValue.getPiValue(3.1415));

    }

}
