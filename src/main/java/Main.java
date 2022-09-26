import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // i assume that 3 numbers are given as a java list. and no more than 3 numbers in that list
        List<Integer> problem1List = new ArrayList<>(Arrays.asList(3,5,8));


    }

    // using for
    public int sumByfor(List<Integer> numberList){

        int sum = 0;

        for(int i = 0 ; i < 3 ; i++){
            sum += numberList.get(i);
        }


        return sum;
    }


    // using while
    public int sumByWhile(List<Integer> numberList){

        int iterations = 0;
        int sum = 0;

        while(iterations < 3){
            sum += numberList.get(iterations);

            iterations++;
        }

        return sum;
    }

    // using recursion
    public int sumByRec(List<Integer> numberList){
        return  numberList.stream().mapToInt(Integer::intValue).sum();
    }



    // problem 2 -----------------------
    public List<String> alternatinglyLists(){
        // i assume that lists are create inside this function and, 2 lists with same size
        List<String> list1 = new ArrayList<>(Arrays.asList("a","b","c"));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));


        // i am getting this list as string because this need to store strings and numbers
        List<String> finalResult = new ArrayList<>();


        for(int counter = 0; counter < list1.size() ; counter++){
            finalResult.add(list1.get(counter));
            finalResult.add(list2.get(counter).toString());
        }


        return finalResult;

    }

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


