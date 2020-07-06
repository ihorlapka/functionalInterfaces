package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    
    public static void main(String[] args) {
    
        // Function takes 1 arf and produces result
        int increment  = increment(0);
        System.out.println(increment);
    
        int increment2 = incrementByOneFunction.apply(0);
        System.out.println(increment2);
        
        int multiply = multiplyBy10Function.apply(2);
        System.out.println(multiply);
    
        Function<Integer, Integer> addByOneAndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addByOneAndThenMultiplyBy10.apply(4));
        
        // BiFunction
        System.out.println(incrementByOneAndMultiply(4, 100));
    
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
    
    }
    
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;
    
    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;
    
    static int increment(int number) {
        return number + 1;
    }
    
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numToIncrementByOne, numToMultiplyBy) ->
                    (numToIncrementByOne + 1) * numToMultiplyBy;
    
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
