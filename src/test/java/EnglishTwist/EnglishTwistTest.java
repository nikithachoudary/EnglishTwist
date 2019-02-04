package EnglishTwist;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnglishTwistTest {

  @Test
  public void englishTwist(){

    //setup

      Twist twist = new Twist();
      String[] solutionList={"dog","goose","elephant","tiger","rhino","orc","cat"};
      List<String> expected = Arrays.asList(solutionList);
      List<String> actual=twist.englishTwistArray(solutionList);
      assertEquals(expected,actual);

  }

  @Test
    public void testEnglishTwistFail1(){
        Twist twist = new Twist();
        String[] solutionList={"dog","goose","tiger","cat","elephant","orc","cat"};
        String[] expect ={"dog","goose"};
        List<String> expected = Arrays.asList(expect);
        List<String> actual=twist.englishTwistArray(solutionList);
        assertEquals(expected,actual);

    }

    @Test
    public void testEnglishTwistFail2(){

        Twist twist = new Twist();
        String[] solutionList={"ab","bc","","cd"};
        String[] expect ={"ab","bc"};
        List<String> expected = Arrays.asList(expect);
        List<String> actual=twist.englishTwistArray(solutionList);
        assertEquals(expected,actual);



    }
   @Test
        public void testEnglishTwistFail3(){


        Twist twist = new Twist();
        String[] solutionList={"","bc","","cd"};
        List<String> expected=null;
        List<String> actual=twist.englishTwistArray(solutionList);
        assertEquals(expected,actual);

    }


}

