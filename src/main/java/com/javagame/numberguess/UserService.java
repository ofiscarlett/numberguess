package com.javagame.numberguess;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private String userName;
    //private Integer gamePlayed = 0;
    private Integer totalGuesses = 5;

    //Setters and getters
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    //How to do this part? 
    public Integer getTotalGuesses() {
        return totalGuesses;
    }
    public void setTotalGuesses(Integer totalGuesses) {
        this.totalGuesses = totalGuesses;
    }
/*     public Integer getGamePlayed() {
        return gamePlayed;
    }
    public void setGamePlayed(Integer gamePlayed) {
        this.gamePlayed = gamePlayed;
    } */
}
