package Model;

public class Model {
    private int minNumber;
    private int maxNumber;
    private int chosenNumb;

    public Model() {
        minNumber = 0;
        maxNumber = 100;
        chosenNumb = minNumber + (int) (Math.random() * maxNumber);
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

    public void setChosenNumb(int chosenNumb) {
        this.chosenNumb = chosenNumb;
    }
}
