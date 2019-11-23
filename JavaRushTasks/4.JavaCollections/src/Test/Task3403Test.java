package Test;

import com.javarush.task.task34.task3403.Solution;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

abstract class OutputTest {

    protected final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}

public class Task3403Test extends OutputTest{

    @Test
    public void recurseShouldBeFactorizationNumber(){

        Solution solution = new Solution();
        solution.recurse(132);
        Assert.assertEquals("2 2 3 11", output.toString());

//        assertEquals("2 2 3 11 ", output.toString());

    }

}