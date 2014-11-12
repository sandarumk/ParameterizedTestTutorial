import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by dinu on 11/11/14.
 */
@RunWith(Parameterized.class)
public class TestEvenNumberChecker {
    private EvenNumberChecker evenNumberChecker;
    private Integer inputNumber;
    private boolean isEven;

    @Before
    public void initialize() {
        evenNumberChecker = new EvenNumberChecker();
    }

    // Parameter to be tested should be an argument here.
    // In this case we have two parameters, that is the input number and the boolean value of indicating whether the number is even.
    public TestEvenNumberChecker(Integer inputNumber,boolean isEven) {
        this.isEven=isEven;
        this.inputNumber = inputNumber;

    }

    // We have to add the parameters to be tested through this method
    @Parameterized.Parameters
    public static Collection Numbers() {

        return Arrays.asList(new Object[][]{{2314,true},{456834,true},{678423,false},{4632489,false}});


    }


    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Checking Number : "+inputNumber);
        assertEquals(isEven, evenNumberChecker.checkForEvenNumber(inputNumber));
    }
}

