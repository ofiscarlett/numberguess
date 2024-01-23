package com.javagame.numberguess;

import org.springframework.stereotype.Service;

@Service
public class GameService {
    private Integer numberToGuess ;
    private Integer guessChance = 5;
    private Integer user1Guess;
    private Integer user2Guess;

    //constructor
    GameService() {
        //Always create number 
        Double randomNumber = (Math.random() * 20)+1;
        numberToGuess = randomNumber.intValue();
    }

    public void restart() {
        //when restart, it will create a new number for guessing
        Double randomNumber = Math.random() * 20; 
        numberToGuess = randomNumber.intValue();
        //numberToGuess = 10;
        guessChance = 5;
        user1Guess = 0;
        user2Guess = 0;
    }
    
    //http://localhost:8080/api/user1/10
    public String user1Guess(Integer number) {
        user1Guess = number;
        //game logic
        if (guessChance <= 0) {
            return "You have no more chance left. The number was " + numberToGuess + ". Game restarted! You have 5 new attempts to guess the number between 0 and 20.";
        }
        else if (user1Guess == numberToGuess) {
            //call method saveUserInfo and write to file
            WritePlayerToJson json = new WritePlayerToJson();
            json.saveUserInfo("user1");
            return "Great Job! You guessed the number! Game restarted! You have 5 new chances to guess the number between 0 and 20.";
        } else if (user1Guess > numberToGuess) {
            guessChance--; 
            if(guessChance == 0) {
                return "You have no more chance left. The number was " + numberToGuess + ". Game restarted! You have 5 new attempts to guess the number between 0 and 20.";
            }
            return "Your guess higher than secret number! You have " + guessChance + " chances left. Guess again";
        } else {
            guessChance--;
            if(guessChance == 0) {
                return "You have no more chance left. The number was " + numberToGuess + ". Game restarted! You have 5 new attempts to guess the number between 0 and 20.";
            }
            return "Your guess is too low! You have " + guessChance + " chances left.";
        }
    }
        public String user2Guess(Integer number) {
        user2Guess = number;
        //game logic
        if (guessChance <= 0) {
            return "You have no more chance left. The number was " + numberToGuess + ". Game restarted! You have 5 new attempts to guess the number between 0 and 20.";
        }
        else if (user2Guess == numberToGuess) {
            WritePlayerToJson json = new WritePlayerToJson();
             json.saveUserInfo("user2");
            return "Great Job! You guessed the number! Game restarted! You have 5 new chances to guess the number between 0 and 20.";
        } else if (user2Guess > numberToGuess) {
            guessChance--; 
            if(guessChance == 0) {
                return "You have no more chance left. The number was " + numberToGuess + ". Game restarted! You have 5 new attempts to guess the number between 0 and 20.";
            }
            return "Your guess higher than secret number! You have " + guessChance + " chances left. Guess again";
        } else {
            guessChance--;
            if(guessChance == 0) {
                return "You have no more chance left. The number was " + numberToGuess + ". Game restarted! You have 5 new attempts to guess the number between 0 and 20.";
            }
            return "Your guess is too low! You have " + guessChance + " chances left.";
        }
    }


    //game logic only one user to guess number from computer comment out first
   /*  public String guess(int number) {
        if (guessChance <= 0) {
            return "You have no more chance left. The number was " + numberToGuess + ". Game restarted! You have 5 new attempts to guess the number between 0 and 20.";
        }
        //guessChance--;
        else if (number == numberToGuess) {
            return "Great Job! You guessed the number! Game restarted! You have 5 new chances to guess the number between 0 and 20.";
        } else if (number > numberToGuess) {
            guessChance--; 
            if(guessChance == 0) {
                return "You have no more chance left. The number was " + numberToGuess + ". Game restarted! You have 5 new attempts to guess the number between 0 and 20.";
            }
            return "Your guess higher than secret number! You have " + guessChance + " chances left. Guess again";
        } else {
            guessChance--;
            if(guessChance == 0) {
                return "You have no more chance left. The number was " + numberToGuess + ". Game restarted! You have 5 new attempts to guess the number between 0 and 20.";
            }
            return "Your guess is too low! You have " + guessChance + " chances left.";
        }
    } */
}
