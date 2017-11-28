class Hobbit extends Character {
    Hobbit() {
        super(0, 3);
    }

    @Override
    void kick(Character c) {
        toCry();
    }

    private void toCry() {
        System.out.println("No way. Better hide and eat a couple Lembas.");
    }
}
