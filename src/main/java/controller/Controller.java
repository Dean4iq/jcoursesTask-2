package controller;

import model.Model;
import view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        view.sendMessage(View.GREETING_MSG);

        while (model.checkInputtedValue(playAGame(scanner))) ;

        view.sendMessage(View.CONGRAT_MSG);
        view.sendMessage(View.ATTEMPTS_NUMB + model.getUserAttempts().size());
        view.sendMessage(View.INPUTTED_NUMB + model.getUserAttempts().toString());
    }

    private int playAGame(Scanner scanner) {
        int inputtedNumber;

        while (true) {
            view.sendMessage(View.CHOOSE_NUMBER_MSG + View.OPENING_DASH_SYMB + model.getMinNumber()
                    + View.POINT_DIVIDE_SYMB + model.getMaxNumber() + View.CLOSING_DASH_SYMB);
            view.sendMessage(View.INPUT_NUMB_MSG);

            while (!scanner.hasNextInt()) {
                view.sendMessage(View.TYPE_ERROR_MSG);
                view.sendMessage(View.CHOOSE_NUMBER_MSG + View.OPENING_DASH_SYMB + model.getMinNumber()
                        + View.POINT_DIVIDE_SYMB + model.getMaxNumber() + View.CLOSING_DASH_SYMB);
                view.sendMessage(View.INPUT_NUMB_MSG);

                scanner.next();
            }

            if (((inputtedNumber = scanner.nextInt()) <= model.getMinNumber())
                    || (inputtedNumber >= model.getMaxNumber())) {
                view.sendMessage(View.OUT_OF_BOARDS);
                continue;
            }
            break;
        }
        return inputtedNumber;
    }
}
