package org.example;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMainMethod() {
        PrintStream original = System.out;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{});

        System.setOut(original);

        String actual = out.toString().replace("\r\n", "\n").trim();

        String expected =
                "Hello and welcome!i = 1\n" +
                        "i = 2\n" +
                        "i = 3\n" +
                        "i = 4\n" +
                        "i = 5";

        assertEquals(expected, actual);
    }
}
