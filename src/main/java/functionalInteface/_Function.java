package functionalInteface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    static Function<Integer, Integer> incrementFun =
            number -> ++number;
    static Function<Integer, Integer> mutitlpeBy10 =
            (number) -> number * 10;

    static BiFunction<Integer, Integer, Integer> numberAdds1andMultiplyByNumFunction = (number, multiplyNum) -> ++number * multiplyNum;

    static int increment(int number) {
        return ++number;
    }

    public static void main(String[] args) {
        // Function takes 1 argument and gives 1 result
        System.out.println(increment(8));
        System.out.println(incrementFun.apply(9));
        System.out.println(mutitlpeBy10.apply(2));
        Function<Integer, Integer> add1AndMultiplyBy10 =
                incrementFun.andThen(mutitlpeBy10);
        System.out.println(add1AndMultiplyBy10.apply(2));

        // BiFunction takes 2 arguments and gives 1 result

        System.out.println(numberAdds1andMultiplyByNum(1, 100));
        System.out.println(numberAdds1andMultiplyByNumFunction.apply(2, 100));
    }

    static int numberAdds1andMultiplyByNum(int numberIncrement, int numberMultiply) {
        return (numberIncrement + 1) * numberMultiply;
    }

}
