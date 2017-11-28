class Elf extends Character {
    Elf() {
        super(10, 10);
    }

    @Override
    void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
            System.out.println("Elf kills " + c.getClass().getName());
        } else {
            c.decreasePower(1);
            System.out.println("Elf decreases " + c.getClass().getName() + "'s power by 1 point");
        }
    }
}
