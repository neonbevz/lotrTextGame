class CharacterFactory {
    static Character createCharacter() {
        int type = (int) (Math.random() * 4);
        if (type == 0) {
            return new Hobbit();
        } else if (type == 1) {
            return new Elf();
        } else if (type == 2) {
            return new King();
        } else {
            return new Knight();
        }
    }
}
