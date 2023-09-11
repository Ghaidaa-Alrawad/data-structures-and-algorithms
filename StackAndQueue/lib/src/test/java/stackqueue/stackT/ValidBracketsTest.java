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
    public void testingTrue(){
        ValidBrackets v2 = new ValidBrackets();
        assertTrue(v2.validBracket("()[[Extra Characters]]"));
    }
}
