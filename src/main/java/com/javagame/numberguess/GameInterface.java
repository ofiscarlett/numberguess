package com.javagame.numberguess;

public class GameInterface {
    void restart() {

    }
    String user1Guess(Integer number) {
        return "user1Guess";
    }
    String user2Guess(Integer number) {
        return "user2Guess";
    }
    boolean isUser1Winner() {
        return true;
    }
    boolean isUser2Winner() {
        return true;
    }
    boolean isGameOver() {
        return true;
    }
    String getGameResult() {
        return "getGameResult";
    }

    String getGameStatus(Integer number, Integer number2) {
        return "getGameStatus";
    }
    

}
