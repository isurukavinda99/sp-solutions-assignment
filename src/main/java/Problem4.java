import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem4 {

    // problem 4 ----------------------------
    public void formedNumber(){
        // i assume number list are create locally
        // ** i think there is an error in question i am getting 9 as 90

        List<Integer> numberList = new ArrayList<>(Arrays.asList(50,2,1,90));

        // i am using pre build function to sort list.
        Collections.sort(numberList , Collections.reverseOrder());


        // create out put as given format
        StringBuilder output = new StringBuilder();

        for(Integer num : numberList){
            output.append(num);
        }

        System.out.println("Formed number is : " + output);

    }

}
