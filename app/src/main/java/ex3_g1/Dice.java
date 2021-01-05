package ex3_g1;

public class Dice {
    private int value;

    public Dice() {
        this.value = play();
    }

    public int play() {
        return (int) (Math.random() * 6) + 1;
    }

    public int getValue() {
        return this.value;
    }
}
