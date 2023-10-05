package com.javagame.numberguess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//get mapping
@RequestMapping("/api")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/restart")
    public String restart() {
        gameService.restart();
        return "Game restarted! You have 5 new chance to guess the number between 0 and 20.";
    }
    @PostMapping("/restart")
    public String restartPost() {
        gameService.restart();
        return "Game restarted! You have 5 new chance to guess the number between 0 and 20.";
    }

    //guess cant link from postman but import my number is working????
    @GetMapping("/guess")
    public String guess(@RequestParam int number) {
        return gameService.guess(number);
    }
    //http://localhost:8080/api/guess?number=<your-guess> this one works????why
    @PostMapping("/guess")
    public String guessPost(@RequestParam int number) {
        return gameService.guess(number);
    }
    
}
