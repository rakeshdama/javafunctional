package functionalInteface;

import java.util.function.Function;

public class _Function {
    static Function<Integer, Integer> incrementFun =
            number -> ++number;

    public static void main(String[] args) {
        System.out.println(increment(8));
        System.out.println(incrementFun.apply(9));
    }

    static int increment(int number) {
        return ++number;
    }
}
