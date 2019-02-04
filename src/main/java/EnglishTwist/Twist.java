package EnglishTwist;


import java.util.ArrayList;
import java.util.List;

public class Twist {

    public List<String> englishTwistArray(String[] testArray) {

        List<String> solutionList = new ArrayList<>();
        if (testArray == null || testArray[0].length() < 1)
            return null;
        for (int i = 0; i < testArray.length; i++){
            solutionList.add(testArray[i]);
            if (i == testArray.length - 1 || testArray[i].length() < 1 || testArray[i+1].length() < 1 || testArray[i + 1].charAt(0) != testArray[i].charAt((testArray[i].length()-1))) break;
        }
        return solutionList;
    }

}
