class Knight extends Character {
    Knight() {
        super((int) (Math.random() * 11 + 2), (int) (Math.random() * 20 + 2));
    }
    @Override
    void kick(Character c) {
        int dmg = (int) (Math.random() * this.getPower() + 1);
        c.damage(dmg);
        System.out.println("Knight damages " + c.getClass().getName() + " by " + dmg + " points");
    }
}
