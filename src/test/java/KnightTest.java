import org.junit.Test;
import static org.junit.Assert.*;

public class KnightTest {
    @Test
    public void kick() throws Exception {
        Character knight = new Knight();
        assertTrue(2 <= knight.getHp() && knight.getHp() <= 21);
        assertTrue(2 <= knight.getPower() && knight.getPower() <= 12);
    }
}