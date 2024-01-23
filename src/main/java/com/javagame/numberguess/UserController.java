package com.javagame.numberguess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    //private String userName; //this is already in the game service, not need 
    @Autowired
    private UserService userService;
    //http://localhost:8080/api/user/ after/ to type name
    @GetMapping("/user/{userName}")
    public String getUser(@PathVariable String userName) {
        // String userName = userService.getUserName();
        return "Your name is " + userName + ". You have played " + "number guess"+ 
        " games. You have " + userService.getTotalGuesses() + " chances to guess number.";
    }
    @PostMapping("/user/{userName}")  //how to post user name
    public String setUserName(@PathVariable String userName) {
        userService.setUserName(userName);
        return "User name is : " + userName ;
    }
    
/*    public userInfo() {
        this.userName = userName;
    }   */

    // Implement logic to retrieve user data here


/*     public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    */
}
