import org.junit.Test;

import static org.junit.Assert.*;

public class ElfTest {
    @Test
    public void kick() throws Exception {
        Character elf1 = new Elf();
        Character elf2 = new Elf();
        int oldPower = elf2.getPower();
        elf1.kick(elf2);
        assertEquals(oldPower - 1, elf2.getPower());
        elf1.kick(elf2);
        assertFalse(elf2.isAlive());
    }

}