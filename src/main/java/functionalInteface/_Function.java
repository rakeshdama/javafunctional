package functionalInteface;

import java.util.function.Function;

public class _Function {
    static Function<Integer, Integer> incrementFun =
            number -> ++number;
    static Function<Integer, Integer> mutitlpeBy10 =
            (number) -> number * 10;

    public static void main(String[] args) {
        System.out.println(increment(8));
        System.out.println(incrementFun.apply(9));
        System.out.println(mutitlpeBy10.apply(2));
        Function<Integer, Integer> add1AndMultiplyBy10 =
                incrementFun.andThen(mutitlpeBy10);
        System.out.println(add1AndMultiplyBy10.apply(2));
    }

    static int increment(int number) {
        return ++number;
    }
}
