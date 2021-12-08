import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassString() {
        MainClass mainClass = new MainClass();
        String classString = mainClass.getClassString();

        Assert.assertTrue("classString does not contain the substring \"Hello\" or \"hello\"",
                checkWordInLine(classString,"hello") || checkWordInLine(classString, "Hello"));
    }

    private boolean checkWordInLine(String line, String word) {
        return line.contains(word);
    }
}
