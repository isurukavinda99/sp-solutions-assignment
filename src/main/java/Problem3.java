import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3 {

    // problem 3 ---------------------------
    public List<Integer> calculateFibonacci(){

        // initialize first Fibonacci number as 0 and second Fibonacci number as 1
        List<Integer> fibonacciNumbers = new ArrayList<>(Arrays.asList(0,1));

        int numberOfIterations = 100;

        for(int itr = 2 ; itr < numberOfIterations ; itr++){
            fibonacciNumbers.add(fibonacciNumbers.get(itr - 1) + fibonacciNumbers.get(itr - 2));
        }

        return fibonacciNumbers;

    }

}
