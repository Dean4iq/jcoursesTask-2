package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Model {
    private int minNumber;
    private int maxNumber;
    private int chosenNumb;
    private LinkedList<Integer> userAttempts;

    public Model() {
        final Random random = new Random();

        minNumber = 0;
        maxNumber = 100;
        chosenNumb = random.nextInt(maxNumber - 1) + 1;
        userAttempts = new LinkedList<Integer>();
    }

    public boolean checkInputtedValue(int value) {
        userAttempts.add(value);
        if (value == chosenNumb) {
            return false;
        } else if (value > chosenNumb) {
            maxNumber = value;
        } else {
            minNumber = value;
        }
        return true;
    }

    public List<Integer> getUserAttempts() {
        return userAttempts;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getChosenNumb() {
        return chosenNumb;
    }
}
