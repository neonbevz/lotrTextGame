import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {
    private class TestingCharacter extends Character {
        TestingCharacter(int power, int hp) {
            super(power, hp);
        }

        @Override
        void kick(Character c) {
        }
    }

    @Test
    public void damage() throws Exception {
        Character c = new TestingCharacter(10, 10);
        c.damage(4);
        assertEquals(6, c.getHp());
        c.damage(6);
        assertFalse(c.isAlive());
    }

    @Test
    public void decreasePower() throws Exception {
        Character c = new TestingCharacter(10, 10);
        c.decreasePower(9);
        assertEquals(1, c.getPower());
        c.decreasePower(5);
        assertEquals(0, c.getPower());
    }

    @Test
    public void isAlive() throws Exception {
        Character c = new TestingCharacter(10, 10);
        assertTrue(c.isAlive());
        c.damage(10);
        assertFalse(c.isAlive());
    }

    @Test
    public void setHp() throws Exception {
        Character c = new TestingCharacter(10, 10);
        assertEquals(10, c.getHp());
        c.setHp(15);
        assertEquals(15, c.getHp());
        c.setHp(0);
        assertFalse(c.isAlive());
    }

    @Test
    public void getHp() throws Exception {
        Character c = new TestingCharacter(10, 10);
        assertEquals(10, c.getHp());
    }

    @Test
    public void setPower() throws Exception {
        Character c = new TestingCharacter(10, 10);
        c.setPower(15);
        assertEquals(c.getPower(), 15);
    }

    @Test
    public void getPower() throws Exception {
        Character c = new TestingCharacter(50, 10);
        assertEquals(c.getPower(), 50);
    }
}