package n2exercici3;

@FunctionalInterface
public interface Calculator <T, U>{

    float operacio(T t, U u, String operand);

}
