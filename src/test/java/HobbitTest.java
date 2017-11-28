import org.junit.Test;

import static org.junit.Assert.*;

public class HobbitTest {
    @Test
    public void kick() throws Exception {
        Character hobbit = new Hobbit();
        Character elf = new Elf();
        int oldHP = elf.getHp();
        int oldPower = elf.getPower();
        hobbit.kick(elf);
        assertEquals(oldHP, elf.getHp());
        assertEquals(oldPower, elf.getPower());
    }

}