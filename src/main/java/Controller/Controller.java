package Controller;

import Model.Model;
import View.View;

import java.util.LinkedList;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private int attempts;
    private LinkedList<Integer> userChoices;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.attempts = 0;
        this.userChoices = new LinkedList<Integer>();
    }

    public void execute() {
        view.sendMessage(View.GREETING_MSG);

        Scanner scanner = new Scanner(System.in);

        while (playAGame(scanner));
    }

    private boolean playAGame(Scanner scanner) {
        view.sendMessage(View.CHOOSE_NUMBER_MSG + " [" + model.getMinNumber()
                         + ";" + model.getMaxNumber() + "]");
        view.sendMessage(View.INPUT_NUMB_MSG);
        userChoices.add(scanner.nextInt());
        attempts++;

        if (userChoices.getLast() == model.getChosenNumb()) {
            view.sendMessage(View.CONGRAT_MSG);
            view.sendMessage(View.ATTEMPTS_NUMB + attempts);
            view.sendMessage(View.INPUTTED_NUMB + userChoices.toString());
            return false;
        } else if ((userChoices.getLast() < model.getMinNumber())
                     || (userChoices.getLast() > model.getMaxNumber())) {
            view.sendMessage(View.OUT_OF_BOARDS);
        } else if (userChoices.getLast() > model.getChosenNumb()) {
            model.setMaxNumber(userChoices.getLast());
            view.sendMessage(View.WRONG_LOWER_MSG);
        } else {
            model.setMinNumber(userChoices.getLast());
            view.sendMessage(View.WRONG_GREATER_MSG);

        }
        return true;
    }
}
