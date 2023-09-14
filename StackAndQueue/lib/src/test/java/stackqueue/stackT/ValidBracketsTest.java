package StackAndQueue.lib.src.test.java.stackqueue.stackT;
import StackAndQueue.lib.src.main.java.stackqueue.stack.ValidBrackets;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidBracketsTest {

    @Test
    public void testingFalse(){
        ValidBrackets v1 = new ValidBrackets();
        assertFalse(v1.validBracket("[({}]"));
    }

    @Test
    public void testingTrueWithCharacters(){
        ValidBrackets v2 = new ValidBrackets();
        assertTrue(v2.validBracket("()[[Extra Characters]]"));
    }

    @Test
    public void testEmptyString() {
        ValidBrackets v3 = new ValidBrackets();
        assertTrue(v3.validBracket(""));
    }

    @Test
    public void testSingleValidPair() {
        ValidBrackets v4 = new ValidBrackets();
        assertTrue(v4.validBracket("()"));
    }

    @Test
    public void testSingleInvalidPair() {
        ValidBrackets v5 = new ValidBrackets();
        assertFalse(v5.validBracket(")("));
    }

    @Test
    public void testNestedValidPairs() {
        ValidBrackets v6 = new ValidBrackets();
        assertTrue(v6.validBracket("([]{})"));
    }
}
