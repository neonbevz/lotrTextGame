import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterFactoryTest {
    @Test
    public void createCharacter() throws Exception {
        for (int i=0; i<100; i++) {
            Character ch = CharacterFactory.createCharacter();
            assertTrue(ch instanceof Hobbit || ch instanceof Elf || ch instanceof King || ch instanceof Knight);
        }
    }

}