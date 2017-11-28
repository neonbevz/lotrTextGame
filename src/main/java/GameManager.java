class GameManager {
    static void fight() {
        Character c1 = CharacterFactory.createCharacter();
        String c1Name = c1.getClass().getName();
        System.out.println("First rival: " + c1Name + "\nHP: " + c1.getHp() + " Power: " + c1.getPower());
        Character c2 = CharacterFactory.createCharacter();
        String c2Name = c2.getClass().getName();
        System.out.println("Second rival: " + c2Name + "\nHP: " + c2.getHp() + " Power: " + c2.getPower());
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1Name + " attacks " + c2Name);
            c1.kick(c2);
            if (!c2.isAlive()) {
                System.out.println(c1Name + " wins!");
                break;
            }
            System.out.println(c2Name + " attacks " + c1Name);
            c2.kick(c1);
        }
        if (c2.isAlive()) {
            System.out.println(c2Name + " wins!");
        }
    }
}
