package view;

public class View {
    public static final String GREETING_MSG =
                                "Greetings and welcome! I want to play a game";
    public static final String CHOOSE_NUMBER_MSG = "Choose your number within";
    public static final String INPUT_NUMB_MSG = "Input your number";
    public static final String CONGRAT_MSG = "Congratulations! You did it!";
    public static final String WRONG_GREATER_MSG =
                              "You're wrong! Input a greater value! Try again";
    public static final String WRONG_LOWER_MSG =
                                "You're wrong! Input a lower value! Try again";
    public static final String ATTEMPTS_NUMB = "Your attempts number: ";
    public static final String INPUTTED_NUMB = "Your inputted numbers: ";
    public static final String OUT_OF_BOARDS = "Your number is out of boards";

    public void sendMessage(String message) {
        System.out.println(message);
    }
}
