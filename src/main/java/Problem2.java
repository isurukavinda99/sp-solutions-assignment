import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {

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


}
