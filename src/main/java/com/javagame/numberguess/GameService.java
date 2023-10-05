package com.javagame.numberguess;

import org.springframework.stereotype.Service;

@Service
public class GameService {
    private int numberToGuess;
    private int guessChance = 5;

    public void restart() {
        numberToGuess = (int) (Math.random() * 20);
        guessChance = 5;
    }
    //game logic
    public String guess(int number) {
        if (guessChance <= 0) {
            return "You have no more chance left. The number was " + numberToGuess + ". Game restarted! You have 5 new attempts to guess the number between 0 and 20.";
        }else if (number == numberToGuess) {
            return "Great job! You guessed the number! Game restarted! You have 5 new chances to guess the number between 0 and 20.";
        } else if (number > numberToGuess) {
            guessChance--;
            return "Your guess higher than secret number! You have " + guessChance + " chances left. Guess again";
        } else {
            return "Your guess is too low! You have " + guessChance + " chances left.";
        }
    }
}
