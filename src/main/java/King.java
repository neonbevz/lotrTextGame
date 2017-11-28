class King extends Character {
    King() {
        super((int) (Math.random() * 10 + 5), (int) (Math.random() * 10 + 5));
    }
    @Override
    void kick(Character c) {
        int dmg = (int) (Math.random() * this.getPower() + 1);
        c.damage(dmg);
        System.out.println("King damages " + c.getClass().getName() + " by " + dmg + " points");
    }
}
