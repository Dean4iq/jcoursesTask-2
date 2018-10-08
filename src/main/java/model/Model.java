package model;

import java.util.Random;

public class Model {
    private int minNumber;
    private int maxNumber;
    private int chosenNumb;

    public Model() {
        final Random random = new Random();

        minNumber = 0;
        maxNumber = 100;
        chosenNumb = minNumber + random.nextInt() * maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getChosenNumb() {
        return chosenNumb;
    }
}
