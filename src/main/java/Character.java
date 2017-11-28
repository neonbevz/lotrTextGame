abstract class Character {
    private int power;
    private int hp;

    Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    void damage(int amount) {
        this.hp -= amount;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    void decreasePower(int points) {
        this.power -= points;
        if (this.power < 0) {
            this.power = 0;
        }
    }

    abstract void kick(Character c);

    boolean isAlive() {
        return this.hp > 0;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    void setPower(int power) {
        this.power = power;
    }

    int getPower() {
        return power;
    }
}
