import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Problem1 problem1 = new Problem1();
        Problem2 problem2 = new Problem2();
        Problem3 problem3 = new Problem3();
        Problem4 problem4 = new Problem4();

        // i assume that 3 numbers are given as a java list. and no more than 3 numbers in that list
        List<Integer> problem1List = new ArrayList<>(Arrays.asList(3,5,8));

        System.out.println("Prob 1 by for : " + problem1.sumByfor(problem1List));
        System.out.println("Prob 1 by while : " + problem1.sumByWhile(problem1List));
        System.out.println("Prob 1 by rec : " + problem1.sumByRec(problem1List));

        System.out.println("Prob 2 : " + problem2.alternatinglyLists());

        System.out.println("Prob 3 : " + problem3.calculateFibonacci());

        problem4.formedNumber();

    }












}


