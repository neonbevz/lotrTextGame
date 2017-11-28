import org.junit.Test;
import static org.junit.Assert.*;

public class KingTest {
    @Test
    public void kick() throws Exception {
        Character king = new King();
        Character hobbit = new Hobbit();
        while (hobbit.isAlive()) {
            int oldHP = hobbit.getHp();
            king.kick(hobbit);
            assertTrue(hobbit.getHp() < oldHP);
        }
    }
}