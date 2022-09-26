import java.util.List;

public class Problem1 {

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

}
